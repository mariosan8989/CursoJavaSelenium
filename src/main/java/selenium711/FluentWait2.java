package selenium711;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait2 {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; // seteando el path de nuestro driver
	    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //identificar el exe driver
	    WebDriver driver = new ChromeDriver();//creacion de tiempo de ejecucion de muestro web driver
	    driver.get("https://opensource-demo.orangehrmlive.com/");// abriendo el navegador
	    driver.manage().window().maximize();
	    
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(20)) //Esperando 20 segundos a que el elemento este presente en la pagina
	    		.pollingEvery(Duration.ofSeconds(2)) //Verifcando el elemento cada 2 segundos
	    		.ignoring(NoSuchElementException.class); //La exception que va a evitar durante esos 20 segundos
	    
	    WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>() 
	    		{public WebElement apply(WebDriver driver)
	    	  {driver.navigate().refresh();
	    	  return driver.findElement(By.id("txtUsernam"));
	    			
	    	  }
	    	 });
	       txtUsername.click();

	}

}
