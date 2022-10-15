package Locators;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsSwitch {
	static WebDriver driver;
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
	//	driver.navigate().to("http://automationpractice.com/index.php");
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
	WebElement dress=	driver.findElement(By.xpath("(//*[@title=\"Dresses\"])[2]"));
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		dress.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String>windowsS=driver.getWindowHandles();
		Iterator<String>iterator=windowsS.iterator();
		String FirstWindow=iterator.next();
		String SecondWindow=iterator.next();
		driver.switchTo().window(SecondWindow);
		System.out.println(FirstWindow);
		System.out.println(SecondWindow);
		driver.findElement(By.xpath("(//*[@class=\"replace-2x\"])[1]")).click();
*/
		
	/*	
	WebElement AmazonBasic=	driver.findElement(By.linkText("Amazon Basics"));
	Actions ob=new Actions(driver);
	ob.keyDown(Keys.SHIFT).build().perform();
	AmazonBasic.click();
	ob.keyUp(Keys.SHIFT).build().perform();
	Set<String>windowS=driver.getWindowHandles();
	Iterator<String>iterator=windowS.iterator();
	String FW=iterator.next();
	String SW=iterator.next();
	driver.switchTo().window(SW);
	System.out.println(FW);
	System.out.println(SW);
	WebElement elec=driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
	elec.click();
	*/
	
	//page amazonhome(switch multiple window)
	WebElement AmazonHome=driver.findElement(By.linkText("Amazon Home"));
	Actions od = new Actions(driver);
	od.keyDown(Keys.SHIFT).build().perform();
	AmazonHome.click();
	od.keyUp(Keys.SHIFT).build().perform();
	Set<String>wi=driver.getWindowHandles();
	Iterator<String>iterator1=wi.iterator();
	String FirstWindow=iterator1.next();
	String SecondWindow=iterator1.next();
	driver.switchTo().window(SecondWindow);
	System.out.println(FirstWindow);
	System.out.println(SecondWindow);
	driver.findElement(By.xpath("//*[@alt=\"Bed & Bath\"]")).click();
	
	
	
	
		
}
}