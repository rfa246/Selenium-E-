package pizzaHut.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath = "//*[@class='MuiButton-label']")WebElement menu;
	@FindBy(xpath = "//*[@data-testid='link-menu-pizza-link']") WebElement selectpizza;
	
	public void menu() {
		menu.click();
	}
	public void SelectPizza() {
		selectpizza.click();
	}
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
