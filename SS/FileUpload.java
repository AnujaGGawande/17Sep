package SS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
     System.setProperty("WebDriver,Chrome.Driver","ChromeDriver" );
     WebDriver driver = new ChromeDriver();
     driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
     driver.manage().window().maximize();
    WebElement chooseFile= driver.findElement(By.xpath("//input[@type='file']"));
     chooseFile.sendKeys("C:\\Users\\hp\\Documents\\fileUpload.txt");
     Thread.sleep(2000);
     WebElement press= driver.findElement(By.xpath("//input[@type='submit']"));
     press.click();
     driver.close();
	}

}
