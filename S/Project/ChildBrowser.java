package S.Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

		public static void main(String[] args) throws Exception  {
			System.setProperty("WebDriver,Chrome.Driver", "ChromeDriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.aspsnippets.com/demos/1102/");	
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
			Set<String>windows = driver.getWindowHandles();
			Iterator a= windows.iterator();
			System.out.println("All windows");
			while(a.hasNext())
				System.out.println(a.next());
			System.out.println("No. of elements in collection="+ windows.size());
			
			String win[] = new String[3];
			for(int i=0;i<windows.size();i++)
			{
				win[i] =(String)a.next();
				System.out.println(win[i]);
			}
			driver.switchTo().window(win[0]);
			System.out.println("Title of Win 0 ="+driver.getTitle());
			driver.close();
			Thread.sleep(4000);
			driver.switchTo().window(win[1]);    //small window
			System.out.println("title of Win 1 =" + driver.getTitle());
			driver.close();
			
			Thread.sleep(4000);
			driver.close();
	}

}
