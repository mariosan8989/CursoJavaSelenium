package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);// inicializamos los  webElement con PageFactory
		                                       // This es un keyword con el que estamos indicando
		                                       // que es la misma clase donde se estan inicializando los objetos
		
	}
	
	//login PageObjects/webElement
	@FindBy(id="txtUsername")
	private WebElement userNameTxt;
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	@FindBy(xpath="//*[@id=\"spanMessage\"]")
	private WebElement ivalidCredencials;
	
	public void login(String user, String password)
	{
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean incorrectLogin(String user,String password)
	{
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		boolean msj = ivalidCredencials.getText().contains("Invalid credentials");
		return msj;
	}
}
	
	

