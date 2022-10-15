package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightsAlerts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("http://www.expedia.com/Flights");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("d1-btn")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@aria-label='Oct 12, 2022']")).click();
		driver.findElement(By.id("d2-btn")).click();
		driver.findElement(By.xpath("//*[@aria-label='Nov 16, 2022'] ")).click();
}
}