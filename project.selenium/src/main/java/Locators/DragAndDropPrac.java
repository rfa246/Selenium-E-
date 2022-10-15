package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropPrac {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		//driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	//	driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*	WebElement wa=driver.findElement(By.xpath("(//*[text()='Washington'])[2]"));//dhtmlgoodies.com
		WebElement un =driver.findElement(By.xpath("//*[text()='United States']"));
		Actions act =new Actions(driver);
		act.dragAndDrop(wa, un).build().perform();
		
		WebElement ol=driver.findElement(By.xpath("(//*[text()='Oslo'])[2]"));//demoqa.com/droppable
		WebElement sk=driver.findElement(By.xpath("//*[text()='South Korea']"));
		Actions ab =new Actions(driver);
		ab.dragAndDrop(ol, sk).build().perform();
		
		WebElement co =driver.findElement(By.xpath("(//*[text()='Copenhagen'])[2]"));
		WebElement No=driver.findElement(By.xpath("//*[text()='Norway']"));
		Actions ac =new Actions(driver);
		ac.dragAndDrop(co, No).build().perform();
		*/
		
	/*	WebElement da =driver.findElement(By.id("draggable"));
		WebElement ba =driver.findElement(By.id("droppable"));
		Actions cd=new Actions(driver);
		cd.dragAndDrop(da, ba).build().perform();
		*/
}
}