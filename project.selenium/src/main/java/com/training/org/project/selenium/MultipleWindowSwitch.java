package com.training.org.project.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowSwitch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("www.half.ebay.com");
		//driver.navigate().to("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement NR=driver.findElement(By.linkText("New Releases"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		NR.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String>windowsi=driver.getWindowHandles();
		Iterator<String>iterator=windowsi.iterator();
		String FirstWindowHandle=iterator.next();
		String SecondWindowHandle=iterator.next();
		driver.switchTo().window(SecondWindowHandle);
		System.out.println(FirstWindowHandle);
		System.out.println( SecondWindowHandle);
		Thread.sleep(6000);
		driver.findElement(By.linkText("Amazon Explore")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
	WebElement kindlesj=	driver.findElement(By.linkText("Kindle Books"));
	Actions act =new  Actions(driver);
	act.keyDown(Keys.SHIFT).build().perform();
	kindlesj.click();
	act.keyUp(Keys.SHIFT).build().perform();
	Set<String> windowsoi=driver.getWindowHandles();
	Iterator<String> iterator=windowsoi.iterator();
	String FirstWindow=iterator.next();
	String secondWindow=iterator.next();
	driver.switchTo().window(secondWindow);
	System.out.println(FirstWindow);
	System.out.println(secondWindow);
	Thread.sleep(6000);
	WebElement stopover= driver.findElement(By.linkText("The Stopover"));
	stopover.click();
		*/
	/*
		WebElement kindlesj=driver.findElement(By.linkText("Kindle Books"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		kindlesj.click();
		ob.keyDown(Keys.SHIFT).build().perform();
	Set<String> windowsh=driver.getWindowHandles();//widowhandles get the section id for all windows opening that section
	Iterator<String> iterator=windowsh.iterator();
	String FirstWindowHandle=iterator.next();
	String SecondWindowHandle=iterator.next();
	driver.switchTo().window(SecondWindowHandle);
	System.out.println(FirstWindowHandle);
	System.out.println(SecondWindowHandle);
	Thread.sleep(2000);
		WebElement stopover=driver.findElement(By.linkText("The Stopover"));
		stopover.click();
		*/
		
		
		
		
		
		
		
}
}