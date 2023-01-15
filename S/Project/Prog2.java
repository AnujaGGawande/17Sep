package S.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver","chromedriver");
WebDriver driver = new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.manage().window().minimize();
driver.get("https://www.rediff.com/");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);

driver.navigate().to("https://www.facebook.com/login/");
Thread.sleep(2000);
driver.navigate().to("https://www.google.co.in/");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.close();

	}

}
