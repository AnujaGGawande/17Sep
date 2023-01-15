package S.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
		
		WebElement Prime= driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions a= new Actions(driver);
		a.moveToElement(Prime).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		Thread.sleep(2000);
		driver.close();
	}

}
