package assertEj;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEj {
  @Test
  public void SoftAssertEquals() {
	  SoftAssert softAssert = new SoftAssert();
	  int a=5;
	  int b=10;
	  int x=8;
	  int y=8;
	  
	  softAssert.assertEquals(a, b);
	  softAssert.assertEquals(x, y);
	  
	  softAssert.assertAll();
	  
  }
}
