package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrom.driver","Chromedriver");
    WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/explicit-wait");
	
	WebElement button =driver.findElement(By.xpath("//button[@id='enable-button']"));
	Thread.sleep(10000);
	System.out.println(button.isDisplayed());
	System.out.println(button.isEnabled());
	System.out.println("-------------------------------------------");
	driver.findElement(By.xpath("//button[@id='enable-button']")).click();
	Thread.sleep(10000);
	System.out.println(button.isDisplayed());
	System.out.println(button.isEnabled());
	driver.close();
	}

}
