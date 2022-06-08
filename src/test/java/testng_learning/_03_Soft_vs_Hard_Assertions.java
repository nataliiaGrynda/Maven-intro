package testng_learning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _03_Soft_vs_Hard_Assertions {
  @Test(priority = 1, description = "Practicing hard assertions")
  public void method1(){
    Assert.assertTrue(true);//we use for isEnabled
    Assert.assertTrue(false, "failure");
    System.out.println("hey world");//hard assertion known whenever there is a failure it will not continue it will break.
  }
  @Test(priority = 2, description = "practicing soft asserions")
  public void method2(){
    //soft assertions, will continue till the end and at the end it will give us the report
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(true);
    softAssert.assertTrue(false, "failure");//assertion error
    System.out.println("hello world");
    softAssert.assertAll();

//if is not critical functionality we can do soft assertion,
//soft assertion is only in jUnit

  }
}
