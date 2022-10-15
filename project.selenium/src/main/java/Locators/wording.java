package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wording {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		//driver.navigate().to("http://www.facebook.com");
		driver.navigate().to("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//u found the text element in webPage	
//	String titles=	driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]")).getText();
//	System.out.println(titles);
		
	//	instagram.com
	String words=	driver.findElement(By.xpath("//*[contains(text(),'Sign up to see')]")).getText();
	System.out.println(words);
	
	
	
	
	
}
}