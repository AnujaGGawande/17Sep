package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws Exception  {
	System.setProperty("WebDriver,Chrome.Driver", "ChromeDriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");	
	driver.manage().window().maximize();
	WebElement mobileNo = driver.findElement(By.xpath("//input[@id='user-number']"));
	mobileNo.sendKeys("9090905645");
	Thread.sleep(1000);
	WebElement emailId = driver.findElement(By.xpath("//input[@id='email_id']"));
	emailId.sendKeys("abc@gmail.com");
	Thread.sleep(1000);
	WebElement Continue = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
	Continue.click();
	WebElement occupation = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));
	Actions a= new Actions(driver);
	a.moveToElement(occupation).click().build().perform();
	for(int i=0;i<=4;i++) {
		Thread.sleep(2000);
		a.sendKeys(Keys.DOWN).build().perform();
	}
	Thread.sleep(5000);
	driver.close();
	}
}
