package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboarPage {

	public DashboarPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//DashboardObject
	@FindBy(id="welcome")
	private WebElement welcomeDrpDwn;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logoutBtn;
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		welcomeDrpDwn.click();
		Thread.sleep(1000);
		logoutBtn.click();
	}
}
