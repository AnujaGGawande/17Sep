package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws Exception {
  System.setProperty("WebDriver,ChromeDriver","ChromeDriver");
  WebDriver driver= new ChromeDriver();
  driver.get("https://www.worldometers.info/geography/alphabetical-list-of-countries/");
  
  WebElement list = driver.findElement(By.xpath("//td[text()='Australia']"));
  Actions a=new Actions(driver);
  a.moveToElement(list).build().perform();
  Thread.sleep(3000);
  for(int i=0;i<=9;i++) {
		Thread.sleep(2000);
		a.sendKeys(Keys.DOWN).click().build().perform();
  }
  driver.close();
	}

}
