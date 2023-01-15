 package S.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws Exception {
   System.setProperty("webdriver.chrome.driver", "chromedriver");
   WebDriver driver=new ChromeDriver();
   Thread.sleep(2000);
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.get("https://www.rediff.com/");
   
   String expTitle = "Rediff.com";
   String actTitle = driver.getTitle();
   if(expTitle.equals(actTitle))
   {
	   System.out.println("Title - Test case pass");
   }
   else 
   {
	   System.out.println("Title - Test case failed");
   }
	   System.out.println("Actual Title=" + actTitle);
	   String currURL = driver.getCurrentUrl();
	   System.out.println("URL = " + currURL);
	   driver.close();
	 
	}

}
