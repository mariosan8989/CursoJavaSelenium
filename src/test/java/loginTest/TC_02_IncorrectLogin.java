package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSeptup.DriverSetup;
import globalVarialbes.GlobalVariables;
import navigationPages.LoginPage;

public class TC_02_IncorrectLogin {
	// declarar e inicializar un objeto del tipo driver 
	WebDriver driver = DriverSetup.setupDriver();
	
	//Login PageObject
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void starWebDriver()
	{
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}
  @Test
  public void TC_02() {
	  
	  boolean isTrue = login.incorrectLogin(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	  Assert.assertTrue(isTrue);
  }
  
  
  @AfterTest
  public void closeDriver()
  {
	  driver.quit();
  }
}
