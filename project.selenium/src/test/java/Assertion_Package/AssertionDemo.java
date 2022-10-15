package Assertion_Package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionDemo {
	WebDriver driver;
  @Test
  public void testMethod() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//soft assert class we create obj first
		SoftAssert softVerify =new SoftAssert();
		
		
		
		
		//hard assert//in hard assert immdely give expection.not execute remanaing code,
//		System.out.println("verifying title");
//		String expectedTitle = "Automation Testing practice" ;
//		String actualTitle = driver.getTitle();
//	Assert.assertEquals(expectedTitle,actualTitle ,"Title veridication");
		
		//wikipedia is presence or not
		System.out.println("verifying presence of wikipedia-icon");
		WebElement icon=driver.findElement(By.xpath("//*[@class='wikipedia-icon']"));
		softVerify .assertTrue(icon.isDisplayed());
		
		//wikipedia sreachButton presence or not
				System.out.println("verifying presence of wikipedia-sreach-button");
				WebElement sreachbutton=driver.findElement(By.xpath("//*[@class='wikipedia-search-button']"));
				softVerify .assertTrue(sreachbutton.isDisplayed());
				
				driver.close();
				
	
		//report all failure message
				softVerify.assertAll();	
		
	  
  }
  
}
