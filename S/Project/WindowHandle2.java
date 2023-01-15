package S.Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://skpatro.github.io/demo/links/");
		 Thread.sleep(2000);
//To Handle Multiple windows.		 
		 driver.findElement(By.xpath("//input[@name='NewTab']"));
		 Set<String> window=driver.getWindowHandles(); 
		 for(String win:window)
		 {
			 System.out.println(win);
		 }
		 Thread.sleep(3000);
		 driver.close();
		 
	// To handle Single window.
		 String wind =driver.getWindowHandle();
		 System.out.println("Parent window"+ wind);
	}
	

}
