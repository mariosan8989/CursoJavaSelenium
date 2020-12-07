package assertEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void VerificarTituloPagina() {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; // seteando el path de nuestro driver
	    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //identificar el exe driver
	    WebDriver driver = new ChromeDriver();//creacion de tiempo de ejecucion de muestro web driver
	    driver.get("https://opensource-demo.orangehrmlive.com/");// abriendo el navegador
	    driver.manage().window().maximize();
	    String actualidadTitle= driver.getTitle();
	    String ExpectedTitle = "OrangeHRM";
	    
        Assert.assertEquals(actualidadTitle, ExpectedTitle);	    	  
  }
}
 