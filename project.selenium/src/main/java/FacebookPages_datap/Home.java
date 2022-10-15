package FacebookPages_datap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(id = "email")WebElement FeildEmail;
	@FindBy(id = "pass")WebElement psswrd;
	@FindBy(name = "login")WebElement loginbt;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void FieldToEmail(String name) {
		FeildEmail.clear();
		FeildEmail.sendKeys(name);
	}
	public void PsswdToField(String pssword) {
		psswrd.sendKeys(pssword);
	}
	public void loginbtclick() {
		loginbt.click();
	}

}
