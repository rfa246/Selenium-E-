package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wording {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		//driver.navigate().to("http://www.facebook.com");
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	u see any element on webPage
		String title= driver.findElement(By.xpath("//*[contains(text(),'Connect with')]")).getText();
		System.out.println(title);
		
		String google=driver.findElement(By.xpath("//*[@class='lnXdpd']")).getText();
		System.out.println(google);
	}
}
