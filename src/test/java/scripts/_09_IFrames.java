package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _09_IFrames extends Base {
  /*
  1. Go to http://the-internet.herokuapp.com/
  2. Click on “Frames” link
  3. Click on “iFrame” link
  4. Clear text “Your content goes here.” in the content
  box
  5. Enter “Hello World” in the content box
  6. Validate the text of the content box is “Hello
  World”
  7. Validate the heading3 as “An iFrame containing the TinyMCE WYSIWYG Editor”
   */
  @Test(priority = 1)
  public void testIFrame1() {
    driver.get("http://the-internet.herokuapp.com/");
    Waiter.pause(2);
    heroAppPage.clickOnLink("Frames");
    Waiter.pause(2);
    heroAppPage.iFrameLink.click();
    Waiter.pause(2);
    //switch to inner html - iframe
    //driver.switchTo().frame(0);
    //driver.switchTo().frame("mce_0_ifr");
    driver.switchTo().frame(heroAppPage.innerIFrame);

    heroAppPage.contentBox.clear();
    Waiter.pause(2);
    heroAppPage.contentBox.sendKeys("Hello World");
    Assert.assertEquals(heroAppPage.contentBox.getText(), "Hello World");

    //Switch back to parent html - outer
    //driver.switchTo().parentFrame();
    driver.switchTo().defaultContent();
    Assert.assertEquals(heroAppPage.iFrameHeading3.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");
  }

  @Test
  public void locateMoneyFrame() {
//  driver.get("https://www.rediff.com/");
//  driver.switchTo().frame(rediffHomePage.moneyIframe1);
//  driver.switchTo().frame(rediffHomePage.moneyIframe2);
//   Assert.assertTrue(rediffHomePage.moneyIframe1.isDisplayed());
//   Assert.assertTrue(rediffHomePage.moneyIframe2.isDisplayed());
    driver.switchTo().frame(rediffHomePage.moneyIFrame);
    //driver.switchTo().frame(0);
    //driver.switchTo().frame("moneyiframe");

    for (WebElement element : rediffHomePage.moneyCells) {
      Assert.assertTrue(element.isDisplayed());
    }
  }
}















