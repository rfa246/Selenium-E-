package com.training.org.project.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//save depandence ctrl s
public class XpathLocator {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Absolute XPath  /full xPath
	//	/html/body/div[1]/div/div[3]/div[1]/img
		
		//Relative xPath  /partial xPath
		//*[@id="divlogo"]/img
		
		//syantax relative XPath
	//	//tagname[@attribute='value']or
	//	//*[@name='username']
		
		
		//Absolute XPath
//driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T_shirts");
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		//relative XPath//
	//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T_shirts");
	//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	//	XPath option//
		//or ,  contain(), starts_with() , text(), chained xPath
		
		//XPath with 'or' any one is true
	//	driver.findElement(By.xpath("//input[@id=\"search_query_top1\" or @name=\"search_query\"]")).sendKeys("T_shirt");
	//	driver.findElement(By.xpath("//button[@name=\"submit_search1\" or @type=\"submit\"]")).click();
		
		//XPath with 'and' both must true
	//	driver.findElement(By.xpath("//input[@id=\"search_query_top\" and @name=\"search_query\"]")).sendKeys("T_shirt");
	//		driver.findElement(By.xpath("//button[@name=\"submit_search\" and @type=\"submit\"]")).click();
			
	//XPath with contains()//	starts_with
			// //tagname[contains(@attribute,'value')]
			// //tagname[start-with(@attribute,'value')]
	//	driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T_shirt");
	//	driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
	//	driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T_Shirts");
	//	driver.findElement(By.xpath("//button[starts-with(@name,submit_')]")).click();
		
	//XPath with text()	
	//driver.findElement(By.xpath("//a[text()='Women']")).click();  //women tab
	
	//chained XPath  //multiple xpath
	//driver.findElement(By.xpath("//form[@id=\"searchbox\"]//input[@id='search_query_top']")).sendKeys("T_shirts");
//	driver.findElement(By.xpath("//form[@id=\"searchbox\"]//button[1]")).sendKeys("T_shirts");
//driver.findElement(By.xpath("//form[@id=\"searchbox\"]//button[@name=\"submit_search\"]")).sendKeys("T_shirts");	
		
		
		
		
		
		//if u find how many linkson ur page u do with findElements
		int links =driver.findElements(By.tagName("a")).size();
		System.out.println("total number of links="+links);
		
		int dresslinked=driver.findElements(By.linkText("Dresses")).size();
		//interview q if not fond element u don,t want to srcp fail u use findelements .use if
		//element found print this if not print this
		System.out.println("dress count is ="+dresslinked);
		if( dresslinked==1) {
			driver.findElement(By.linkText("Dresses")).click();
			
		}else {
			System.out.println("Element is not displaying");
		}
		
		
		
		
		
}
}