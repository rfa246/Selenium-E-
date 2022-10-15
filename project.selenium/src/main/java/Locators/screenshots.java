package Locators;


import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshots {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	public static void Screenshot() throws IOException {
		Date ob = new Date();
		System.out.println();
		String od = ob.toString().replace(" ", "_").replace(":","_");
		System.out.println(od);
		File HomePage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(HomePage, new File("C:\\Users\\jani1\\eclipse-workspace\\project.selenium\\ScreenShots./image3.png"));
		
	}
	}


