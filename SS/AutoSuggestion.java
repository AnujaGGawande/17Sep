package SS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestion {

	public static void main(String[] args) throws Exception {
    System.setProperty("WebDriver, Chrome.Driver","chromeDriver");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Seleni");
    
   List<WebElement> AuSuList = driver.findElements(By.xpath("//div[@class='UUbT9']"));
   for(int i=0;i<AuSuList.size();i++) 
	   System.out.println(AuSuList.get(i).getText());
   for(int i=0;i<AuSuList.size();i++)
   { if(AuSuList.get(i).getText().equals("selenium webdriver"));
      { AuSuList.get(i).click();
       break;
       }
   }
   Thread.sleep(5000);
   driver.close();
	}
}
