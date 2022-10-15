package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseAndKeyboardEvents {
	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();;
			driver = new ChromeDriver();
			//driver.navigate().to("http://omayo.blogspot.com/");
		//	driver.navigate().to("https://omayo.blogspot.com/p/page3.html");
		//	driver.navigate().to("http://tutorialsninja.com/demo/");
		//	driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
	/*Action is predefined class in Selenium webDriver
	moveToElement(),click,perform()and build() methods
			click to blogs
		WebElement blogaMenueElement= driver.findElement(By.id("blogsmenu"));
			Actions act =new Actions(driver);
			act.moveToElement(blogaMenueElement).build().perform();
			click to sleniumByArun
	WebElement option2=driver.findElement(By.xpath("//*[text()='SeleniumByArun']"));
		act.moveToElement(option2).click().build().perform();
		*/
			
			
			
	/*	dragAndDropBy()
the startButton on a slider horizontal to the right
the stratButton horizontal to the left		
WebElement minlabelElement=	driver.findElement(By.xpath("(//*[@role=\"slider\"])[1]"))	;
	Actions act= new Actions(driver);
	act.dragAndDropBy(minlabelElement,-50,0 ).perform();
	*/
			
			
			
/*context() right clicking on SreachBox			
	WebElement sreachBoxField=driver.findElement(By.name("search"));
	Actions act = new Actions(driver);
	act.contextClick(sreachBoxField).build().perform();
	*/
	
			
			
	/*		
	//	doubleClick();	double clicking on double click text	//omayo.com
	WebElement doupleClickOption=driver.findElement(By.id("testdoubleclick"));
	Actions act = new Actions(driver);
	act.doubleClick(doupleClickOption).build().perform();
		*/	
		
			
			
	/*
	//keyDown keyUp//   opening a link in new tap
	WebElement coppendiumDevLink= driver.findElement(By.linkText("compendiumdev"));		
	Actions act = new Actions(driver);
	//coppendiumDevLink open in new tap
	act.keyDown(Keys.CONTROL).moveToElement(coppendiumDevLink).click().keyUp(Keys.CONTROL).build().perform();
	*/
			
	
	/*		
	//Mouse right click action	
	WebElement rightclickaction= driver.findElement(By.xpath("//*[text()='right click me']"));	
	Actions act = new Actions(driver);
	act.contextClick(rightclickaction).build().perform();
	*/		
			
			
			
	//mouse doubleclickAction
//	if 	there is iframe we switch first then perfom action
			driver.switchTo().frame("iframeResult");
			//we have clear text and then write the sendkey
			WebElement feild1=driver.findElement(By.id("field1"));
			feild1.clear();
			feild1.sendKeys("welcome");
			//inspect copy button
		WebElement button=	driver.findElement(By.xpath(" //button[normalize-space()='Copy Text']"));
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
			
			
			
			
			
			
			
			
			
			
			
}
}