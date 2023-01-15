package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   Thread.sleep(2000);
		   driver.manage().window().maximize();
		 driver.get("https://www.rediff.com/signup/register");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Anuja");
	
        Thread.sleep(2000);
		driver.findElement(By.id("emailid")).sendKeys("anuja@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Anuja@123");
		Thread.sleep(2000);
		driver.findElement(By.name("repass")).sendKeys("Anuja@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='f']")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.name("date_day")).sendKeys("21");
        Thread.sleep(2000);
        driver.findElement(By.name("date_mon")).sendKeys("MARCH");
        Thread.sleep(2000);
        driver.findElement(By.name("Date_Year")).sendKeys("1997");
        Thread.sleep(2000);
        driver.findElement(By.name("city")).sendKeys("Satara");
        Thread.sleep(2000);
        driver.findElement(By.name("school")).sendKeys("NHS");
        Thread.sleep(2000);
        driver.findElement(By.name("college")).sendKeys("Dahiwadi college Dahiwadi");
        Thread.sleep(2000);
        driver.findElement(By.xpath ("//a[text()='rediff.com'] ")).click();
        Thread.sleep(2000);
		driver.close();
	}

}
