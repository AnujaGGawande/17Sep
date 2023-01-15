package SS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowser {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
    String browser="edge";
    
    if(browser.equals("Chrome")) {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    }
    if(browser.equals("edge")) {
    	WebDriverManager.edgedriver().setup();
    	driver = new EdgeDriver();
    }
    if(browser.equals("Chrome")) {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    }
    if(browser.equals("Firefox")) {
    	WebDriverManager.firefoxdriver().setup();
    	driver = new FirefoxDriver();
    }
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.close();
    
	}

}
