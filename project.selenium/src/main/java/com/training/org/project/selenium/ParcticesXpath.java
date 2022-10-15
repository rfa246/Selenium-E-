package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParcticesXpath {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	XPath      //htmltag[@attribute='value']
	//	driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		
	//	//htmltag[@attribute='value'and@attribute='value']
	//	driver.findElement(By.xpath("//input[@id=\"login1\" and @type=\"text\"]")).sendKeys("selenium");
		
		
	//use for links better	//htmltag[text()='valueofthetext']
	//	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		
		// //htmltag[contains(text(),'valueofthetext']
		//  //htmltag[contain(@attribute,'value')]
	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("abcd");
	
	
	//  //htmltag[starts-with(@attribute,'value')]
	//   //htmltag[ends-with(@attribute,'value')]
	}
}
