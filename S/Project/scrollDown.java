package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollDown {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://majhinaukri.in/");
		 Thread.sleep(2000);
		 WebElement Last = driver.findElement(By.xpath("//a[@class='last']"));
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].scrollIntoView();", Last);
		 Thread.sleep(3000);
		 driver.close();
	}

}
