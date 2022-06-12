package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _13_Tables extends Base{


  /*
Go to http://the-internet.herokuapp.com/
Click on "Sortable Data Tables" link
Validate the table 1 headers to be displayed as below
Last Name
First Name
Email
Due
Web Site
Action
 */

  @Test(priority = 1, description = "Tables | headers")
  public void testTableHeaders() {
    driver.get("http://the-internet.herokuapp.com/");
    heroAppPage.clickOnLink("Sortable Data Tables");

    //Locate a List of web elements that returns all 6 headers and validate their texts with expected texts
    Waiter.pause(10);

    // List<WebElement> headerElements = driver.findElements(By.cssSelector("#table1 th"));

    String[] headerElementsNames = {"Last Name", "First Name", "Email", "Due", "Web Site", "Action"};
    for (int i = 0; i < 6; i++) {
      Assert.assertEquals(heroAppPage.header1Elements.get(i).getText(), headerElementsNames);
    }
  }
     @Test(priority = 1, description = "tables | first row")
       public void testFirstRow(){
      driver.get("http://the-internet.herokuapp.com/");
      heroAppPage.clickOnLink("Sortable Data Tables");
      String[] tableHeaders = {"Smith","John","jsmith@gmail.com","$50.00","http://www.ismith.com","edit delete"};
      for (int i = 0; i < 6; i++) {
        Assert.assertEquals(heroAppPage.tableFirstRow.get(i).getText(), tableHeaders[i]);
      }
    }

    @Test(priority = 3, description = "tables | 2nd column")
   public void testSecondColumn(){
    driver.get("http://the-internet.herokuapp.com/");
    heroAppPage.clickOnLink("Sortable Data Tables");
      String[] secondColon = {"John", "Frank", "Jason", "Tim"};
      for(int i = 0; i< 4; i++){
        Assert.assertEquals(heroAppPage.firstRowSecondColon.get(i), secondColon[i]);
      }
  }
}
