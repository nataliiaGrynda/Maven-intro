package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_GoogleSearchTest extends Base{



  @Test
  public void testGoogleSearch(){
    driver.get("https://www.google.com/");


    googleSearchPage.searchInpytBox.sendKeys("Selenium" + Keys.ENTER);

    String results = googleSearchResultPage.resultTab.getText();

    Assert.assertTrue(    Integer.parseInt(results.substring(results.indexOf(" ")+1,
      results.indexOf("results")-1).replace(",", ""))> 0);





  }















}
