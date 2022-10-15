package PizzaHutWebsiteHW;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PizzaHut {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("http://www.pizzahut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on menu
		driver.findElement(By.xpath("//*[@class='MuiButton-label']")).click();
		//click on pizza
		driver.findElement(By.xpath("//*[@data-analytics-action=\"Pizza\" and @title=\"Pizza\"]")).click();
		//choose cheese pizza
		driver.findElement(By.xpath("//*[contains(text(),'Cheese Pizza')]")).click();
		//choose delivery
		driver.findElement(By.xpath("(//*[contains(text(),'DELIVERY')])[3]")).click();
		//street address
		driver.findElement(By.id("w2-address")).sendKeys("43178 wealdstone");
		driver.findElement(By.id("w2-address2")).sendKeys("Ter");
		//select city
		driver.findElement(By.xpath("//*[@placeholder=\"City\"]")).sendKeys("Asburn");
		//select state
		driver.findElement(By.id("w2-state")).sendKeys("VA");
		//select ZIP
		driver.findElement(By.xpath("(//*[@data-testid=\"delivery-zip\" or @type=\"text\"])[5]")).sendKeys("20148");
      //click sreach
		driver.findElement(By.xpath("(//*[contains(text(),'Search')])[2]")).click();
	//screenshot
		File sreach = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sreach, new File("C:\\\\Users\\\\jani1\\\\eclipse-workspace\\\\project.selenium\\\\ScreenShots\\\\img.jpg\"));"));
      
      
      
      
      
	}

}
