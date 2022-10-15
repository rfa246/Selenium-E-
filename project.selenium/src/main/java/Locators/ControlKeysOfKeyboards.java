package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlKeysOfKeyboards {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find element amazon sreachBox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
		//Action class control keys of keyboard
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform(); //keyDown u pras keyDown
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();//copy
		ob.keyDown(Keys.CONTROL);//release the key
		Thread.sleep(6000);
		ob.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		
		
}
}