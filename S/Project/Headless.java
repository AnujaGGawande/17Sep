package S.Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {
   public static void main (String[]args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions option = new ChromeOptions();
	 option.addArguments("--headless");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.co.in/");
	 List<WebElement> links =driver.findElements(By.xpath("//a"));
	 System.out.println(links.size());
	   
	   for(int i=0;i<links.size();i++)
	   {
		   System.out.println(links.get(i).getText());
	   }
	   driver.close();
   }
	
}
