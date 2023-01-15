package SS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver,Chrome.Driver", "ChromeDriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	List<WebElement> z = driver.findElements(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine'][2]"));	
	
	for(int i=0; i<z.size();i++)
		{
			System.out.println(z.get(i).getText());
		}
		driver.close();
	}

}
