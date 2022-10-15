package com.training.org.project.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibrowse {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:/Dev.tools(E)/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
	//	Thread.sleep(6000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.navigate().back();
		Thread.sleep(6000);
		//driver.navigate().forward();
		String windows= driver.getWindowHandle();//section id we use this
		System.out.println(windows);
		String kl= driver.getCurrentUrl();//print Url
		System.out.println(kl);
		String titlesk=driver.getTitle();//Print title
		System.out.println(titlesk);
		//faceBook//create account
	WebElement CreateAccount = driver.findElement(By.linkText("Create new account"));
	CreateAccount.click();
				
	WebElement FN =driver.findElement(By.name("firstname"));
	FN.sendKeys("ab");
				
	WebElement LN =driver.findElement(By.name("lastname"));
	LN.sendKeys("bc");
				
	WebElement PN =driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']"));
	PN.sendKeys("12 345 4567");
				
	WebElement pass = driver.findElement(By.className("input[type=password]"));
	pass.sendKeys("123");
				
				//select dropDown//
	WebElement Month=driver.findElement(By.name("birthday_month"));
	Select ob= new Select(Month);
	ob.selectByIndex(5);
				
	WebElement day=driver.findElement(By.name("birthday_day"));
	Select bd = new Select(day);
	bd.selectByValue("4");
				
	WebElement year=driver.findElement(By.name("birthday_year"));
	Select bc = new Select(year);
	bc.selectByVisibleText("2018");
	
	WebElement Gender=driver.findElement(By.cssSelector("input[type='radio']"));
	Gender.click();
	
	WebElement button = driver.findElement(By.linkText("Sign Up"));
	button.clear();
	
	//Absolute XPath
//driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]")).click();
			
driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]")).click();		
		
//relative Xpath	//tagname[@attribute-name='attribute value']	
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

//text() XPath   //td[text()='uesrname']
driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

//using or and XPath
driver.findElement(By.xpath("//button[text()='Sign Up' and @type='submit']")).click();
driver.findElement(By.xpath("//button[text()='Sign Up' or @type='submit']")).click();

//contain()   //tagname[contain(@type,'sub']   use for daymanic change every time number
driver.findElement(By.xpath("//*[contains(text(),'Forgot password?')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//id
//		WebElement UserField =driver.findElement(By.id("email"));
//		UserField.sendKeys("reema");
//		WebElement Password =driver.findElement(By.name("pass"));
//		Password.sendKeys("123");
		//name
//		WebElement Button = driver.findElement(By.name("login"));
//		 Button.click();
		 //linkText
	//	 WebElement ForGotIt= driver.findElement(By.linkText("Forgot password?"));
	//	 ForGotIt.click();
		 //partialLinkText
	//	 WebElement ForGotIt= driver.findElement(By.partialLinkText("Forgot password"));
//				 ForGotIt.click();
		
//		WebElement CreateAccount = driver.findElement(By.linkText("Create new account"));
//		CreateAccount.click();
//		//select dropDown
//		//month
//		WebElement Month= driver.findElement(By.name("birthday_month"));
//		Select ob = new Select(Month);
//		ob.selectByIndex(5);
//		//day
//		WebElement da = driver.findElement(By.name("birthday_day"));
//		Select k = new Select(da);
//		k.selectByValue("6");
//		//year
//		WebElement ye = driver.findElement(By.name("birthday_year"));
//		Select y = new Select(ye);
//		y.selectByVisibleText("2000");
//		//gender
//		WebElement Gender= driver.findElement(By.name("sex"));
//		Gender.click();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
