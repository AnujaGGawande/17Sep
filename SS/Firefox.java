package SS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {

	public static void Method() throws Exception {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");	
	File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\ScreenshotFolder\\photo3.jpeg");
	FileHandler.copy(source, dest);
	driver.quit();
	}
	
	
	public static void main(String[] args) throws Exception {
     Method();
	
	}

}
