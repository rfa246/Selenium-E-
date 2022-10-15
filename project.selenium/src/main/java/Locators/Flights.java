package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flights {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();;
			driver = new ChromeDriver();
			driver.navigate().to("https://expedia.com/flights");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//departing date	
			driver.findElement(By.id("d1-btn")).click();
			driver.findElement(By.xpath("//*[@aria-label='Oct 6, 2022 selected, current check in date.']")).click();
			driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022 selected, current check in date.']")).click();
driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']")).click();
	}

}
