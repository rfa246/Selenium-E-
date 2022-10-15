package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	 static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();;
			driver = new ChromeDriver();
			//driver.navigate().to("http://trytestingthis.netlify.app/");
			//driver.navigate().to("https://demo.automationtesting.in/Register.html");
			driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//in dropDrown we create select object 	
//In HTML we have dropdown controls we use very often, There are two types of dropdown available.
	//		Single-Selection Dropdown
	//		Multi-Selection Dropdown
			
			
			
		/*	
			WebElement dropdown=driver.findElement(By.id("option"));
			Select ob = new Select(dropdown);
			ob.selectByIndex(2);
			*/
			
			/*
			driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("rana");
			driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys("jana");
			driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys("12234456");
			driver.findElement(By.name("//input[@value='Male' ]")).click();
			driver.findElement(By.cssSelector("input[type='checkbox']")).click();
			WebElement element=driver.findElement(By.id("Skills"));
			Select ob = new Select(element);
			ob.selectByVisibleText("Android");
			*/
			
/*			Single-Selection Dropdown
			WebElement coursename=driver.findElement(By.id("course"));
			Select ob = new Select(coursename);
			ob.selectByIndex(1);//java
			Thread.sleep(3000);
			
			ob.selectByValue("net");
			Thread.sleep(3000);
			
			ob.selectByVisibleText("Python");
	*/		
			
//			Multi-Selection Dropdown
			WebElement multiselec=driver.findElement(By.id("ide"));
			Select ba =new Select(multiselec);
			ba.selectByIndex(0);
			Thread.sleep(3000);
			
			ba.selectByValue("ij");
			Thread.sleep(3000);
			
			ba.selectByVisibleText("Visual Studio");
			Thread.sleep(3000);
			
			//unselect option
			ba.deselectByIndex(0);
			Thread.sleep(3000);
			
			ba.deselectByValue("ij");
			Thread.sleep(3000);
			
			ba.deselectByVisibleText("Visual Studio");
			Thread.sleep(3000);
			
			
			
			
			
		}
}