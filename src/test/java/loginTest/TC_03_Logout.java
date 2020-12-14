package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comonMetodos.ComonMetdos;
import driverSeptup.DriverSetup;
import globalVarialbes.GlobalVariables;
import navigationPages.LoginPage;
import navigationPages.DashboarPage;

public class TC_03_Logout {
	// declarar e inicializar un objeto del tipo driver 
	WebDriver driver = DriverSetup.setupDriver();
	
	//Login PageObject
	LoginPage login = new LoginPage(driver);
	DashboarPage dashboard = new DashboarPage(driver); 
	@BeforeTest
	public void starWebDriver()
	{
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
		
	}
	
  @Test
  public void TC_03() throws InterruptedException {
	  //Step 1 : Login
	  login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
	  
	  //step 2 : logout
	  dashboard.logout();
  }
  
  @AfterTest
  public void closeDriver()
  {
	  ComonMetdos.takeScreenshot(driver, "TC_03_Logout");
	  driver.quit();
  }
}
