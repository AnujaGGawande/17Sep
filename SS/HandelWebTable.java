package SS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandelWebTable {

		public static void main(String[] args) throws Exception {
		    System.setProperty("WebDriver, Chrome.Driver","chromeDriver");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://money.rediff.com/index.html");
   List<WebElement> tableRows = driver.findElements(By.xpath("//div[@id='div_bseindices']"));
   for(int i=0;i<tableRows.size();i++)
	   System.out.println(tableRows.get(i).getText());
   
     Thread.sleep(2000);
     driver.close();
	}
    
}
