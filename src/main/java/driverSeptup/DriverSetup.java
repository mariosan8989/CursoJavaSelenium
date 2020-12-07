package driverSeptup;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

	public static WebDriver setupDriver()
	{
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; // seteando el path de nuestro driver
	    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //identificar el exe driver
	    WebDriver driver = new ChromeDriver();//creacion de tiempo de ejecucion de muestro web driver
	    return driver;
	    
	}
}
