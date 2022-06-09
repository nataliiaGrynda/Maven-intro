package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Base {


  WebDriver driver;
  WebDriverWait explicitWait;
  Wait fluentWait;
  SoftAssert softAssert;//initialize softAssert
  EtsySearchPage etsySearchPage;//
  TGApplicationPage tgApplicationPage;
  GoogleSearchPage googleSearchPage;
  GoogleSearchResultPage googleSearchResultPage;
  HeroAppPage heroAppPage;
  FacebookPage facebookPage;
  ExpediaSearchPage expediaSearchPage;
  AmazonHomePage amazonHomePage;
  RediffHomePage rediffHomePage;
  TGHomePage tgHomePage;

  @BeforeMethod
  public void setup(){
    driver = Driver.getDriver();
    explicitWait = new WebDriverWait(driver, 30);
    fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
    softAssert = new SoftAssert();//initialize it in the before method
    etsySearchPage = new EtsySearchPage(driver);//where we create the object of that page
    tgApplicationPage = new TGApplicationPage(driver);
    googleSearchPage = new GoogleSearchPage(driver);
    googleSearchResultPage = new GoogleSearchResultPage(driver);
    heroAppPage = new HeroAppPage(driver);// it is already instantiated i don't have to create a new object
    facebookPage = new FacebookPage(driver);
    expediaSearchPage = new ExpediaSearchPage(driver);
    amazonHomePage = new AmazonHomePage(driver);
   rediffHomePage = new RediffHomePage(driver);
   tgHomePage = new TGHomePage(driver);
  }

  @AfterMethod
  public void teardown(){
    softAssert.assertAll();
    Driver.quitDriver();
  }
}
