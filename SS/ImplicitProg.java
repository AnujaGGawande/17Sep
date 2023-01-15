package SS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitProg {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.google.co.in/"); 
		 
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Seleni");
		 
  List<WebElement>autosugEle=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
  for(int i=0;i<autosugEle.size();i++)
  {
	  System.out.println(autosugEle.get(i).getText());
  }
		 for(int i=0;i<autosugEle.size();i++)
		 {
			 if(autosugEle.get(i).getText().equals("selenium webdriver"));
			 autosugEle.get(i).click();
			 break;
		 }
		 driver.close();
	}

}
