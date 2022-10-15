package com.training.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSectorLoctor {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Dev.tools(E)/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
		//cSS selector
				//Tag&id (or) #id
				//Tag&class  (or) .class
				//Tag& attribute (or) [attribute=value]
				//Tag,class&attribute
		
		//Tag&id (or) #id
		driver.findElement(By.cssSelector("input#email")).sendKeys("reema");//use #email
		
		//Tag&class  (or) .class
		driver.findElement(By.cssSelector("input.inputtext ")).sendKeys("reema"); //use .inputtext
		
		//Tag& attribute (or) [attribute=value]
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abc");//[type='password']
		
		//Tag,class&attribute
		driver.findElement(By.cssSelector("input.inputtext[name=\"email\"]")).sendKeys("abc");
		
		

	}

}
