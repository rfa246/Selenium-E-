package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsToControl {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//mouse move over we use click action
		WebElement signed=driver.findElement(By.id("nav-al-signin"));
		Actions act = new Actions(driver);
		act.moveToElement(signed).build().perform();
		
	WebElement membership =driver.findElement(By.xpath("//*[text()='Prime Membership']"));
	Thread.sleep(6000);
	act.moveToElement(membership).click().build().perform();
	}

}
