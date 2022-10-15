package TestNg;

import org.testng.annotations.Test;

import Common.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;


public class NewTestSession extends Utilities {
	
  @Test
  public void f() throws InterruptedException   {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(Keys.CONTROL);
		Thread.sleep(6000);
		ob.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	  
  }
  

  

  

  
  
}
