package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPage {

  public EbayPage(WebDriver driver){

    PageFactory.initElements(driver, this);
  }


}
