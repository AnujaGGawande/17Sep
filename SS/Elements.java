 package SS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","Chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement rediffLink =
		driver.findElement(By.xpath("//a[text()='ft11']"));
		WebElement rediffLogo =
		driver.findElement(By.xpath("//img[@class='halflogo']"));
//		WebElement fullnameTextbox =
//		driver.findElement(By.xpath("//input[@id='fullname']"));
//		WebElement emailidTextbox =
//		driver.findElement(By.xpath("//input[@id='emailid']"));
//	 	WebElement passwordTextbox =
//	    driver.findElement(By.xpath("//input[@id='pass']"));
//		WebElement retypePassTextbox =
//		driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement gender =
		driver.findElement(By.xpath("//input[@value='f']"));

		int	count	=	0;
		if((rediffLink.isDisplayed())==true)
		{
		System.out.println("Rediff	Link	element	is	available");
		count++;
		}
		else
		System.out.println("Rediff	Link	element	is	not	available");
		if((rediffLogo.isDisplayed())==true)
		{
		System.out.println("Rediff	Logo	is	available");
		count++;
		}
		else
		System.out.println("Rediff	logo	is	not	available");
		System.out.println("Total	count	of	elements	are	"	+	count);
	
//		String expTellUsLabel = "Tell us a few things about yourself and we will help you find classmates and\r\n" + 
//				"other friends among rediff.com's millions of world-wide users.\r\n";
//		
//		String actTellUsLabel = tellUsLabel.getText();
//		
		
//		if(expTellUsLabel.equals(actTellUsLabel))
//		System.out.println("Correct");
//		else System.out.println("incorrect");
	
		if((gender.isDisplayed())==true) {
		System.out.println("gender is available");}
		else
		{System.out.println("gender element is not available");}
			
		driver.close();
		
	}

}
