package TestNg;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import Amazon_Pages.AmazonBasics;
import Amazon_Pages.Desk;
import Amazon_Pages.Home;
import Common.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Amazon_PagesTest extends Utilities {
	 
  @Test(priority = 2,dependsOnMethods = "SearchFiledVerification")//if first text passed then next text excute we use depends on Method="SearchFiledVerificatio")
  public void f() {
	  Home home = new Home(driver);
	  home.AmazonBasics();
	  AmazonBasics amazonbasics= new  AmazonBasics(driver);
	  amazonbasics.HomeOffice();
	  Desk desk = new Desk(driver);
	  desk.Table();
	 
  }
  @Test(priority = 1)//if first text passed then next text excute we use depends on Method="f"
  public void SearchFiledVerification() {
	  Home home = new Home(driver);
	  home.LogoClick();
	  home.SreachFieldKeys();
	  home.SreachToClick();
	  
  }
 
}
 
	



