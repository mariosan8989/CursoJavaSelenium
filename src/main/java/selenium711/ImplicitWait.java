package selenium711;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; // seteando el path de nuestro driver
	    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //identificar el exe driver
	    WebDriver driver = new ChromeDriver();//creacion de tiempo de ejecucion de muestro web driver
	    driver.get("https://opensource-demo.orangehrmlive.com/");// abriendo el navegador
	    driver.manage().window().maximize();
	    
	    // Implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //Obteniendo objetos o web elements
	    WebElement userName = driver.findElement(By.id("txtUsername"));
	   
	   
	}

}
