package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverSeptup.DriverSetup;
import globalVarialbes.GlobalVariables;
import navigationPages.LoginPage;

public class TC_04CorrectLoginParameters {
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
  @Parameters({"user","password"})
  public void TC_01(String user, String password) {
	  //Step 1 : Login
	  login.login(user, password);
  }
  @AfterTest
  public void closeDriver()
  {
	  driver.quit();
  }
  
}
