package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _06_RadioButtonTest extends Base {
  /*
Go to https://www.facebook.com/
Click on "Create New Account" link
Validate "Female", "Male" and "Custom" radio buttons are displayed, enabled and not selected
Select "Female" and validate it is selected
Select "Male" radio button and and validate "Male" is selected and "Female" is deselected
 */
  @Test(priority = 1, description = "TC234: Validate Facebook gender radio buttons")
  public void testFacebookGenderRadioButtons(){
    driver.get("https://www.facebook.com/");
    Waiter.pause(2);

    facebookPage.createNewAccountLink.click();
    Waiter.pause(2);

    for(WebElement element : facebookPage.genderRadioButtons){
      Assert.assertTrue(element.isDisplayed(), "Element IS NOT displayed");
      Assert.assertTrue(element.isEnabled(), "Element IS NOT enabled");
      Assert.assertFalse(element.isSelected(), "Element IS selected");
    }

    facebookPage.genderRadioButtons.get(0).click();
    Waiter.pause(2);
    Assert.assertTrue(facebookPage.genderRadioButtons.get(0).isSelected());

    facebookPage.genderRadioButtons.get(1).click();
    Waiter.pause(2);
    Assert.assertTrue(facebookPage.genderRadioButtons.get(1).isSelected());
    Assert.assertFalse(facebookPage.genderRadioButtons.get(0).isSelected());
  }
}