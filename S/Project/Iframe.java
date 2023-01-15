package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws Exception {
     System.setProperty("Webdriver,Chromedriver","Chrome.Driver");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	 driver.manage().window().maximize();	
	 driver.switchTo().frame("iframeResult");
	 
	 WebElement timeDisplayButton = driver.findElement(By.xpath("//button[@type='button']"));
	 timeDisplayButton.click();
	  Thread.sleep(5000);	
	  driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	  
	   driver.close();
	}

}
