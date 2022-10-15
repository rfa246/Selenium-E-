package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverOperation {
	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();;
			driver = new ChromeDriver();
			driver.navigate().to("https://demo.opencart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
	WebElement desktopMenu=	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac =	driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act = new Actions(driver);
		act.moveToElement(desktopMenu).click().perform();
		act.moveToElement(mac).click().perform();
		
		WebElement components=driver.findElement(By.xpath("//a[normalize-space()='Components']"));
		WebElement monitors=driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		act.moveToElement(components).moveToElement(monitors).click().perform();
			
			
			
			
			
		}			
}
