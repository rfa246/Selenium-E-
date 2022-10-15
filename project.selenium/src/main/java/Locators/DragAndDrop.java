package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		//we swictch in iframe we write
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//first u insect both element where u drag and drop
WebElement dragedit = driver.findElement(By.id("draggable"));
WebElement dropeds = driver.findElement(By.id("droppable"));

//create action class.help to drag and drop
	Actions act =new Actions(driver);
	act.dragAndDrop(dragedit, dropeds).build().perform();
	driver.switchTo().parentFrame();
	
	//what is iframe//A.webPage inside webPage
	//how we know  1,iframe word is there 2,other html tag in there.
	WebElement Resizable=driver.findElement(By.linkText("Resizable"));
	Resizable.click();
	
}
}