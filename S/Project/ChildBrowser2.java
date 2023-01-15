package S.Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser2 {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://skpatro.github.io/demo/links/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='NewTab']")).click();
    
    Set<String> win = driver.getWindowHandles();
    Iterator i= win.iterator();
    
    Object parentWindows = i.next();
    Object childWindows = i.next();
    
    System.out.println("parentWindows");
    System.out.println("childWindows");
    driver.switchTo().window((String) parentWindows);
    System.out.println("Title="+driver.getTitle());
    
    driver.switchTo().window((String)childWindows);
    System.out.println("Titlechild="+driver.getTitle());
    
    driver.quit();
	}

}
