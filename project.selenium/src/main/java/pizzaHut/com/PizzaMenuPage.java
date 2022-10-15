package pizzaHut.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzaMenuPage {
	WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Cheese Pizza')]")WebElement cheesepizza;
	@FindBy(xpath = "(//*[contains(text(),'DELIVERY')])[3]")WebElement delivery;
	@FindBy(id = "w2-address")WebElement st;
	@FindBy(id = "w2-address2")WebElement ad;
	@FindBy(id = "w2-city")WebElement city;
	@FindBy(id = "w2-state")WebElement state;
	@FindBy(id = "w2-zip")WebElement zipcode;
	@FindBy(xpath = "(//*[contains(text(),'Search')])[2]")WebElement sreach;
	
	public void CheesePizza() {
		cheesepizza.click();
		
	}
	public void Delivery() {
		delivery.click();
	}
	public void StreetAddress() {
		st.sendKeys("43178 wealdstone");
		ad.sendKeys("Ter");
		
		
	}
	public void CityState() {
		city.sendKeys("Ashburn");
		state.sendKeys("VA");
		
	}
	public void Zip() {
		zipcode.sendKeys("20148");
	}
	public void Sreach() {
		sreach.click();
	}
	public PizzaMenuPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
