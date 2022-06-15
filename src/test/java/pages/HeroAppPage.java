package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeroAppPage {

  public HeroAppPage(WebDriver driver){
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//ul/li/a")
  public List<WebElement> links;

  @FindBy(css = "#checkboxes>input")
  public List<WebElement> checkboxes;

  @FindBy(xpath = "//ul//button")
  public List<WebElement> alertButtons;

  @FindBy(xpath = "//a[text()='iFrame']")
  public WebElement iFrameLink;

  @FindBy(css = "#tinymce>p")
  public WebElement contentBox;

  @FindBy(xpath = "//h3")
  public WebElement iFrameHeading3;

  @FindBy(id = "mce_0_ifr")
  public WebElement innerIFrame;
//
//  @FindBy(xpath = "//a[text()='Click Here']")
//  public WebElement clickHereLink;

  @FindBy(css = "#content a")//moving from parent to child
  public WebElement clickHereLink;

  @FindBy(css = "#content h3")
  public WebElement windowsH3;

  @FindBy(xpath = "//h3")
  public WebElement newWindowH3;

  @FindBy(id = "file-upload")
  public WebElement chooseFileInputBox;

  @FindBy(id = "file-submit")
  public WebElement uploadFileButton;

  @FindBy(xpath = "//h3")
  public WebElement fileUploadedH3;

  @FindBy(id = "uploaded-files")
  public WebElement uploadedFileText;

  @FindBy(css = "#table1 th")
   public List<WebElement> header1Elements;

  @FindBy(css = "#table1>tbody>tr:nth-child(1)>td")////table[@id='table1']/tbody/tr[1]/td
  public List<WebElement> tableFirstRow;

  @FindBy(xpath = "//table[@id='table1']/tbody/tr/td[2]")
  public List<WebElement> firstRowSecondColon;

  public void clickOnLink(String linkText){
    for (WebElement link : links) {
      if(link.getText().equals(linkText)){
        link.click();
        break;
      }
    }
  }
  public void clickOnAlertButton(String buttonText){
    for(WebElement element: alertButtons){
      if(element.getText().equals(buttonText)){
        element.click();
        break;
      }
    }
  }
  @FindBy(id = "username")
  public WebElement username;

  @FindBy(id = "password")
  public WebElement password;

  @FindBy(css = ".radius")
  public WebElement loginButton;

}
