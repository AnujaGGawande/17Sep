package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import org.apache.batik.gvt.Selectable;
import	org.apache.poi.ss.usermodel.Sheet;
import	org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {


public static void main(String[]args) throws Exception {
	 System.setProperty("webdriver.chrom.driver","Chromedriver");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement fullnameTextbox =
		driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement emailidTextbox =
		driver.findElement(By.xpath("//input[@id='emailid']"));
	 	WebElement passwordTextbox =
	    driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement retypePassTextbox =
		driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement genderButton =
		driver.findElement(By.xpath("//input[@value='f']"));
		WebElement DayDropdown =
	    driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement MonthDropdown =
		driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement YearDropdown =
		driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement LocationTextbox =
		driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement SchoolTextbox =
		driver.findElement(By.xpath("//input[@id='school']"));
		WebElement CollegeTextbox =
		driver.findElement(By.xpath("//input[@id='college']"));
		WebElement CaptchaTextbox =
		driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		
		
        FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\TestData/RediffData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value1 = excel.getRow(0).getCell(0).getStringCellValue();
		
		fullnameTextbox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		emailidTextbox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		passwordTextbox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		retypePassTextbox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		genderButton.click();
		DayDropdown.sendKeys(excel.getRow(0).getCell(5).getStringCellValue());
		MonthDropdown.sendKeys(excel.getRow(0).getCell(6).getStringCellValue());
		YearDropdown.sendKeys(excel.getRow(0).getCell(7).getStringCellValue());
		LocationTextbox.sendKeys(excel.getRow(0).getCell(8).getStringCellValue());
		SchoolTextbox.sendKeys(excel.getRow(0).getCell(9).getStringCellValue());
		CollegeTextbox.sendKeys(excel.getRow(0).getCell(10).getStringCellValue());
		CaptchaTextbox.sendKeys(excel.getRow(0).getCell(11).getStringCellValue());
		
//		Select	s1	=	new select	(DayDropdown);
//		s1.selectByVisibleText(excel.getRow(0).getCell(5).getStringCellValue());
//		Selectable	s2	=	new	Select(MonthDropdown);
//		s2.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
//		Select	s3	=	new	Select(YearDropdown);xx
//		s3.selectByVisibleText(excel.getRow(0).getCell(7).getStringCellValue());
		
		Thread.sleep(2000);
		driver.close();
 }
}
