package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Desk {
	WebDriver driver;

@FindBy(id =  "add-to-cart-button")WebElement dk;

public void Table() {
	dk.click();
	
}
public Desk(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}