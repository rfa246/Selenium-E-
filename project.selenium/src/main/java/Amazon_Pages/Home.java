package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//page object model  locate the element 2 create method according to specific element
//page factory consturctor    create classes on main java and testng in test java

public class Home {
	WebDriver driver;
@FindBy(linkText = "Amazon Basics")WebElement kb;
@FindBy(xpath = "//*[@aria-label='Amazon']")WebElement logo;
@FindBy(id = "twotabsearchtextbox")WebElement screachfield;
@FindBy(id = "nav-search-submit-button") WebElement sreaching;

public void AmazonBasics() {
	kb.click();
}
public void LogoClick() {
	logo.click();
}
public void SreachFieldKeys() {
	screachfield.sendKeys("computer");
}
public void SreachToClick() {
	sreaching.click();
	
}

public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
}
