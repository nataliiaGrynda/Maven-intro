package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Base {


  WebDriver driver;
  WebDriverWait explicitWait;
  Wait fluentWait;
  EtsySearchPage etsySearchPage;
  TGApplicationPage tgApplicationPage;
  GoogleSearchPage googleSearchPage;
  GoogleSearchResultPage googleSearchResultPage;
  HeroAppPage heroAppPage;
  FacebookPage facebookPage;
  ExpediaSearchPage expediaSearchPage;

  @BeforeMethod
  public void setup(){
    driver = Driver.getDriver();
    explicitWait = new WebDriverWait(driver, 30);
    fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
    etsySearchPage = new EtsySearchPage(driver);
    tgApplicationPage = new TGApplicationPage(driver);
    googleSearchPage = new GoogleSearchPage(driver);
    googleSearchResultPage = new GoogleSearchResultPage(driver);
    heroAppPage = new HeroAppPage(driver);
    facebookPage = new FacebookPage(driver);
    expediaSearchPage = new ExpediaSearchPage(driver);
  }

  @AfterMethod
  public void teardown(){
    Driver.quitDriver();
  }

}
