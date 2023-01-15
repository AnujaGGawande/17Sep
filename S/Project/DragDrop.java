package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

   public static void main(String[] args) throws Exception {
   System.setProperty("WebDriver,Chrome.Driver","ChromeDriver");
   WebDriver driver =new ChromeDriver();
   driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
   driver.manage().window().maximize();
   
   WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
   driver.switchTo().frame(iframe);
   
   WebElement Tatras1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
   WebElement Tatras2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
   WebElement Tatras3=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
   WebElement Tatras4=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
   WebElement Trash =driver.findElement(By.xpath("//div[@id='trash']"));
   
   Actions a= new Actions(driver);
   a.moveToElement(Tatras1).clickAndHold().moveToElement(Trash).release().build().perform();
   Thread.sleep(2000);
   a.dragAndDrop(Tatras2,Trash).build().perform();
   Thread.sleep(2000);
   a.dragAndDrop(Tatras3,Trash).build().perform();
   Thread.sleep(2000);
   a.dragAndDrop(Tatras4,Trash).build().perform();
   Thread.sleep(2000);
   driver.close();
   
	}

}
