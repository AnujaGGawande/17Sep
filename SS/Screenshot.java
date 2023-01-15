package SS;

import	java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshot {

	public static void main(String[] args) throws Exception  {
		 System.setProperty("webdriver.chrom.driver","Chromedriver");
		    WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			File source	=	
			((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println(source);
			File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenshotFolder/photo.jpeg");
			FileHandler.copy(source, dest);
			driver.close();
			
	}

}
