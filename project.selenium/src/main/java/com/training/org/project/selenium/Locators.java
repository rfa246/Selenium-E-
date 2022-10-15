package com.training.org.project.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static WebDriver driver;
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:/Dev.tools(E)/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.findElement(By.id("search_query_top")).sendKeys("T_shirts");
//		driver.findElement(By.name("submit_search")).click();
//		//driver.findElement(By.linkText(" Printed Chiffon Dress")).click();
//		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
		//how many slider are yourLogo page  //class name locator
	//	int sliders=driver.findElements(By.className("homeslider-description")).size();
	//	System.out.println(sliders);
		
		 //tag name locator    //find links//u find all common links
		//find how many links on page
	//	int links=driver.findElements(By.tagName("a")).size();
	//System.out.println(links);
		
		
		//how many slider on amazan page
	//	int sliders=driver.findElements(By.xpath("//*[@class='a-icon a-icon-next-rounded']")).size();
	//	System.out.println(sliders);
		
		int links= driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	}

}
