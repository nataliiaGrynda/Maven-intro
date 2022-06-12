package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _14_Scrolling extends Base{


  @Test
  public void testScrolling() throws InterruptedException {
    driver.get("https://www.techglobalschool.com/");

  // actions.moveToElement(tgHomePage.registerForIntroLink).perform();
   // actions.sendKeys(Keys.PAGE_DOWN).perform();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);\n" +
      "var elementTop = arguments[0].getBoundingClientRect().top;\n" +
      "window.scrollBy(0, elementTop-(viewPortHeight/2));", tgHomePage.registerForIntroLink);

  }

}
