package com.training.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserOrChrome {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Ibrowsers("Chrome");
	//	String titles=driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]")).getText();
	//	System.out.println(titles);
		String title=driver.findElement(By.xpath("(//*[contains(text(),'Free Online Calculators')])[2]")).getText();
		System.out.println(title);
		Screenshot();
		
		
}
	public static void Ibrowsers(String NameOfBrowser) {
		if(NameOfBrowser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.navigate().to("https://www.calculator.net/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else if(NameOfBrowser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.navigate().to("https://www.calculator.net/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		}
	/*
		public static void Screenshot() throws IOException {
			Date ob = new Date();
			System.out.println(ob);
			String files=ob.toString().replace(" ", "_").replace(":", "_");
			System.out.println(files);
	File HomePage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(HomePage, new File("C:\\Users\\jani1\\eclipse-workspace\\project.selenium\\ScreenShots\\"+files+"Home.jpg"));
		*/
	
	


public static void Screenshot() throws IOException {
	Date ob = new Date();
	System.out.println(ob);
	String files=ob.toString().replace(" ", "_").replace(":", "_");
	System.out.println(files);
	File ama=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(ama, new File("C:\\Users\\jani1\\eclipse-workspace\\project.selenium\\ScreenShots\\"+files+"Home2.jpg"));
}
}
	
	
	
	
	
	
	
