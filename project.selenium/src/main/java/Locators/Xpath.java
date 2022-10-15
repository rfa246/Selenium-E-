package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//faceBook//create account
		WebElement CreateAccount = driver.findElement(By.linkText("Create new account"));
		CreateAccount.click();
		
		//Absolute XPath  start with  /,which means you can select the element from the root node.
		//grouping and index  ()[1]
	driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]")).click();
driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]")).click();

//relative XPth 
//Relative XPath starts from the middle of HTML DOM structure. It starts with double forward slash (//). 
//It can search elements anywhere on the webPage,
//means no need to write a long xPath and you can start from the middle of HTML DOM structure. 
//Relative XPath is always preferred as it is not a complete path from the root element.
//find with groping and index
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

//XPth text()
//The XPath text() function is a built-in function of selenium webdriver which is used to locate elements based on text of a web element. 
//It helps to find the exact text elements and it locates the elements within the set of text nodes.
//The elements to be located should be in string form.
		//     XPath=//td[text()='UserID']

driver.findElement(By.xpath("(//button[text()=\"Sign Up\"])[1]")).click();

//XPth or ,and
//In OR expression, two conditions are used, whether 1st condition OR 2nd condition should be true. 
//It is also applicable if any one condition is true or maybe both. 
//Means any one condition should be true to find the element.
//         XPath=//*[@type='submit' or @name='btnReset']

//In AND expression, two conditions are used, both conditions should be true to find the element. 
//It fails to find element if any one condition is false.

//        XPath=//input[@type='submit' and @name='btnLogin']
driver.findElement(By.xpath("//button[text()=\"Sign Up\" and @name=\"websubmit\"]")).click();
driver.findElement(By.xpath("//button[text()=\"Sign Up\" or @name=\"websubmit\"]")).click();

//contains() XPath;
//Contains() is a method used in XPath expression. It is used when the value of any attribute changes dynamically, for example,
//login information.
//     //*[contains(@type,'sub')]
driver.findElement(By.xpath("//*[contains(text(),'Forgot password?')]")).click();
	}

}
