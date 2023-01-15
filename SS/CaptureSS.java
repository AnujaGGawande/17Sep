package SS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureSS {

  static WebDriver driver;
	
	public static void captureCompletePageScreenshot() throws Exception{
		File source	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenshotFolder\\photo1.jpeg");
		FileHandler.copy(source, dest);
	}		
	public static void captureLogoScreenshotsAs() throws Exception{
	WebElement amazonLogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File source = amazonLogo.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenshotFolder\\photo2.jpeg ");
		FileHandler.copy(source, dest);
	}		
		public static void main(String[]args) throws Exception{
		System.setProperty("WebDriver.Chrome.Driver","Chromedriver");
		driver = new ChromeDriver()	;
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
				
	   captureCompletePageScreenshot();
	   captureLogoScreenshotsAs();	
			
		driver.close();
	}
}
