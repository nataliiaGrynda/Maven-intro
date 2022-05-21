package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class _02_TechGlobalTest {


  /*
1. Go to "https://www.techglobalschool.com/apply-now"
2. Validate the heading1 is displayed and the text for it is ="Application Form"
 */
  WebDriver driver;
//1. Set up
  @BeforeMethod
    public void setup(){
      driver = Driver.getDriver();
    }

//2. Validate test
  @Test
   public void testApplicationFormHeading(){
  driver.get("https://www.techglobalschool.com/apply-now");
    WebElement heading1 = driver.findElement(By.xpath("//span[text()='Application Form']"));

    String expectedHeadingText = "Application Form";
    String actualHeading1Text = heading1.getText();

    Assert.assertTrue(heading1.isDisplayed());
    Assert.assertEquals(actualHeading1Text, expectedHeadingText);
   }

//3. Teardown
  @AfterMethod
  public void teardown(){
    Driver.quitDriver();
  }










}
