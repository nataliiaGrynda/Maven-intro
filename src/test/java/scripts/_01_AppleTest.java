package scripts;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class _01_AppleTest extends Base{
  //Declare your driver

  // 1. Initial set up - before each test

  // 2. Validation of test - test
  @Test(priority = 1, description = "TC235")
  public void testAppleTitle(){
    driver.get("https://www.apple.com/");

    String expectedTitle = "Apple"; // requirement
    String actualTitle = driver.getTitle(); // development
    Assert.assertEquals(actualTitle, expectedTitle);
    /*
    Instead of these if-else validation, we will use TestNG assertion
    if(actualTitle.equals(expectedTitle)) System.out.println("Apple title validation passed");
    else System.out.println("Apple title validation failed");
     */


  }

  @Test(priority = 2)
  public void testAppleURL(){
    driver.get("https://www.apple.com/");

    String expectedURL = "https://www.apple.com/";
    String actualURL = driver.getCurrentUrl();

    Assert.assertEquals(actualURL, expectedURL);
  }

   @Ignore
   @Test(priority = 3)
  public void X(){
    //fail() method is used to fail a test on purpose
    Assert.fail("Failure on purpose");
  }

  // 3. Teardown actions - after each test





}
