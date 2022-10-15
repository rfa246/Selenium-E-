package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//An Alert in Selenium is a small message box which appears on screen to give the user some information or notification. 
//It notifies the user with some specific information or error, 
//	tasks for permission to perform certain tasks and it also provides warning messages as well.	
	
		//Click Button to see alert
	//	driver.findElement(By.id("alertButton")).click();
	//	driver.switchTo().alert().accept();
		
		//On button click, confirm box will appear
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		
		
	//	On button click, prompt box will appear
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("ab");
		driver.switchTo().alert().accept();
		
}
}