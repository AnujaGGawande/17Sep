package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativePath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   Thread.sleep(2000);
//		   driver.manage().window().maximize();
//		 driver.get("https://www.rediff.com/signup/register");
//		
//		 //Xpath by attribute
//		  WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
//		  
//		  //Xpath by text
//     driver.findElement(By.xpath("//input[@value='Sign up']")).click();
//     Thread.sleep(3000);
//	  driver.close();
		   
//	  //Xpath by contains
//		  WebElement Gender = driver.findElement(By.xpath("//input[@class='col1']"));
//
//		  //Xpath by index
//		//(input[contains(@class="col1")])[8]
	}

}
