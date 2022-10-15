package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionToControl {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement signed =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//		//Create action object/controlling mouse
//		Actions act = new Actions(driver);
//		act.moveToElement(signed).build().perform();
		
		WebElement singed = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions act = new Actions(driver);
		act.moveToElement(singed).build().perform();
		
		//select element
//		WebElement PrimeMembership=driver.findElement(By.xpath("//*[text()='Prime Membership']"));
//		Actions ob = new Actions(driver);
//		ob.moveToElement(PrimeMembership).click().build().perform();
		
		WebElement watchlist =driver.findElement(By.xpath("//*[text()='Watchlist']"));
		Actions wl =new Actions(driver);
		wl.moveToElement(watchlist).click().build().perform();
		
		
}
	
}