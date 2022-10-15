package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlKeyofKeyboard {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(Keys.CONTROL);
		Thread.sleep(6000);
		ob.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		*/
		
		
		
		
		
		
}
}