package com.training.org.project.selenium;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicRelativeXpath {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("www.half.ebay.com");
		//driver.navigate().to("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	driver.findElement(By.xpath("//div[@id='bluemenu']/child::ul[1]/child::li[6]/child::a[1]")).click();
	//	driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child::div[1]/child::div[@class=innerpage-bodycontainer-left-text-container]/child::table[1]/descendant::img[1]")).click();
	//	driver.findElement(By.xpath("//div[@id=\"header-container\"]/preceding_sibiling::table[3]/preceding::img[4]")).click();
		
		
		
	}

}
