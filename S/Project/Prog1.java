package S.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Throwable {
System.setProperty("chrome.ChromeDriver", "chromedriver");
WebDriver driver = new ChromeDriver();
Thread.sleep(1000);
driver.get("https://www.facebook.com/login/");
Thread.sleep(1000);
driver.close();	
driver.quit();
	}

}
