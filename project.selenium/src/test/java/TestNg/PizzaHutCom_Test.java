package TestNg;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Common.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import pizzaHut.com.HomePage;
import pizzaHut.com.PizzaMenuPage;

public class PizzaHutCom_Test extends Utilities {
	
  @Test
  public void f() {
	  HomePage home=new HomePage(driver);
	  home.menu();
	  home.SelectPizza();
	  PizzaMenuPage ob =  new PizzaMenuPage (driver);
	  ob.CheesePizza();
	  ob.Delivery();
	  ob.StreetAddress();
	  ob.CityState();
	  ob.Zip();
	  ob.Sreach();
  }
  


	


	  
	
}
