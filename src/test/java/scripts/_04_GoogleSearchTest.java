package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _04_GoogleSearchTest extends Base{



  @Test
  public void testGoogleSearch(){
    driver.get("https://www.google.com/");


    googleSearchPage.searchInpytBox.sendKeys("Selenium" + Keys.ENTER);

    String results = googleSearchResultPage.resultTab.getText();

    Assert.assertTrue(    Integer.parseInt(results.substring(results.indexOf(" ")+1,
      results.indexOf("results")-1).replace(",", ""))> 0);
  }

/*
1. Go to https://www.google.com/
2. Click on "Store" link
3. Validate the title of the page is "Google Store for Google Made Devices & Accessories"
 */

  @Test(priority = 2, description = "TC123: Validate Google Store link")
  public void testGoogleStoreLink(){
    driver.get("https://www.google.com/");

    //explicitWait.until(ExpectedConditions.visibilityOf(googleSearchPage.storeLink)); // 120 attempts
    Waiter.waitForVisibilityOfElement(driver, googleSearchPage.storeLink, 30);
    googleSearchPage.storeLink.click();//

    //Throws exception - Use explicit wait to prevent
    //explicitWait.until(ExpectedConditions.titleIs("Google Store for Google Made Devices & Accessories"));
    Waiter.waitUntilTitleIs(driver, 30, "Google Store for Google Made Devices & Accessories");

    Assert.assertEquals(driver.getTitle(), "Google Store for Google Made Devices & Accessories");

  }
}
