package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBasics {
	WebDriver driver;
	@FindBy(xpath = "//div[@id='ce5w1xbk1h']//a[@class='style__overlay__2qYgu EditorialTile__overlay__3cghg']")WebElement hm;
	@FindBy(xpath = " //body/div[@id='a-page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]")WebElement st;

	public void HomeOffice() {
		hm.click();
		st.click();
	}
	public AmazonBasics(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}
