package day24.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// sign in using id locators 
public class ExapmleLocaters {
WebDriver driver;

	public void launchingBrowser() throws Exception {
		WebDriverManager. chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='nav-link  text-primary text-center px-4']")).click();
		driver.findElement(By.xpath("//a[@class='signup']")).click();
		
//		
}	
	public void signin_using_id() throws Exception {
		launchingBrowser();	
		driver.findElement(By.id("name")).sendKeys("Sivakumar A");
		driver.findElement(By.id("email")).sendKeys("sivadot07@gmail.com");
		driver.findElement(By.id("password")).sendKeys("siva9566@");
		driver.findElement(By.id("mobileNumber")).sendKeys("8015648363");
		driver.findElement(By.id("signup-btn")).click();
		driver.close();
	
		
		}
	public void signin_using_xpath() throws Exception {
		launchingBrowser();	
	
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sivakumar A");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sivadot07@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("siva9566@");
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8015648363");
		driver.findElement(By.id("//a[@id='signup-btn']")).click();
		driver.close();
}
		
		
//tagName 
	public void using_tagname() throws Exception {
		launchingBrowser();
		List<WebElement> elem = driver.findElements(By.tagName("input"));
		for(WebElement x:elem) {
			System.out.println(x.getText());
			
			
		}
	
	}
		

//		linkText 
//		partialLinkText
public void using_multiple_locators() throws Exception {
		WebDriverManager. chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("BEAUTY")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("HOME AND ")).click();
		

		

}


public static void main(String[] args) throws Exception {
	ExapmleLocaters ex = new ExapmleLocaters();
//	ex.signin_using_id();
//	ex.signin_using_xpath();
//	ex.using_multiple_locators();
 ex.using_tagname();
	
}
}