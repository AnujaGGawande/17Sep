package SS;

import java.time.Duration;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitProg {

	public static void main(String[] args) {
   System.setProperty("WebDriver,Chrome.Driver", "ChromeDriver");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://chercher.tech/practice/explicit-wait");
 /*  //Scenario 1
   WebElement button1= driver.findElement(By.xpath("//button[@id='alert']"));
   button1.click();
   WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
   w.until(ExpectedConditions.alertIsPresent());
   driver.switchTo().alert().accept();  */
   
 /*  //Scenario 2
   WebElement button2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
   WebElement text=driver.findElement(By.xpath("//h2[@id='h2']"));
   button2.click();
   WebDriverWait a= new WebDriverWait(driver, Duration.ofSeconds(10));
  a.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver")); */
   
  //Scenario 3
  WebElement button3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
  WebElement disable = driver.findElement(By.xpath("//button[@id='hidden']"));
  button3.click();
  WebDriverWait b= new WebDriverWait(driver, Duration.ofSeconds(10));
  b.until(ExpectedConditions.elementToBeClickable(disable));

 
  driver.close();
	}
  
}
