package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
  /*
How to implement Page Object Model Design Pattern
1. Create a new class and locate your web elements there with a constructor using PageFactory class
 and initElements() method that takes a driver instance and current object
2. Either in base or script class, declare and initialize an object of this page to be able to access the web elements
3. Use your page instance to invoke-call-access web elements
TC765: Validate Google search
1. Go to "https://www.google.com/"
2. Search for "Selenium"
3. Validate the results are more than zero
2 Page Object Repository
GoogleSearchPage
GoogleSearchResultPage
 */



  public GoogleSearchPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
@FindBy(name = "q")
 public WebElement searchInpytBox;












}
