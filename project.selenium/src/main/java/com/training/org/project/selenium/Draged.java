package com.training.org.project.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Draged {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:/Dev.tools(E)/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.get("https://jqueryui.com/droppable/");
	//	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
		
		/*
		//iframes
		WebElement dragedit =driver.findElement(By.id("draggable"));
		WebElement dropeds=driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragedit,dropeds).build().perform();
		driver.switchTo().parentFrame();
		
		WebElement Rsizable = driver.findElement(By.linkText("Resizable"));
		*/
		
		/*
		//Drag and Drop
		WebElement drag=driver.findElement(By.id("box7"));
		WebElement drop=driver.findElement(By.id("box107"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		*/
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement item1=driver.findElement(By.xpath("//li[1]"));
		WebElement item2=driver.findElement(By.xpath("//li[2]/"));
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(item1, trash).build().perform();
		act.dragAndDrop(item2, trash).build().perform();
	}

}
