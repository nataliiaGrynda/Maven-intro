package pages;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EtsySearchPage {


    public EtsySearchPage(WebDriver driver) {// is already set up in the Driver class, will all the maximize and implicit waits
      PageFactory.initElements(driver, this);// introduces all the web elements that i will use in the page
    }//instantiate all my webElement and store them here


    //Locate all Etsy Search Page web elements here
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchInputBox;

    @FindBy(css = "button[data-id='gnav-search-submit-button']")
    public WebElement searchButton;

    @FindBy(id = "logo")
    public WebElement logo;

    @FindBy(css = ".wt-display-inline-flex-sm>span")
    public WebElement resultTag;

    @FindBy (css = "ul[role='menubar'] span")
    public List<WebElement> mainHeaderLinks;

    @FindBy(css = ".signin-header-action")
    public WebElement signInButton;

    @FindBy(css = ".wt-overlay--animation-done")
    public WebElement signInModal;

    @FindBy(id = "join-neu-overlay-title")
    public WebElement signInModalHeading;

    @FindBy(css = "ul[data-node-id='10855']>li")
    public List<WebElement> jewelryAndAccessoriesItems;

    //@FindBy(id = "#catnav-primary-link-10855")

  }

//also create reusable methods to
