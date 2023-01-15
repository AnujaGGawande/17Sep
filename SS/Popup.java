package SS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

		public static void main(String[] args) throws Exception  {
			System.setProperty("WebDriver,Chrome.Driver", "ChromeDriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Alerts.html");	
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Thread.sleep(1000);
			Alert a=driver.switchTo().alert();
			System.out.println("a.getText()");
			a.sendKeys("Hii Welcome");
			Thread.sleep(2000);
			a.accept();	
			driver.close();
	}

}
