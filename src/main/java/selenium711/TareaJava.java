package selenium711;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TareaJava {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; // seteando el path de nuestro driver
	    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //identificar el exe driver
	    WebDriver driver = new ChromeDriver();//creacion de tiempo de ejecucion de muestro web driver
	    driver.get("https://opensource-demo.orangehrmlive.com/");// abriendo el navegador
	    driver.manage().window().maximize();
	    
	    //Obteniendo objetos o web elements
	    WebElement userName = driver.findElement(By.id("txtUsername"));
	    WebElement password = driver.findElement(By.id("txtPassword"));
	    WebElement btnLogin = driver.findElement(By.id("btnLogin"));
	    
	    //Login
	    userName.sendKeys("Admin");
	    Thread.sleep(2000);
	    password.sendKeys("admin123");
	    Thread.sleep(2000);
	    btnLogin.click();
	    Thread.sleep(5000);
	    
	    //click en directory
	    WebElement Directory = driver.findElement(By.id("menu_directory_viewDirectory"));
	    Directory.click();
	    
	    // input Name
	    WebElement Name = driver.findElement(By.id("searchDirectory_emp_name_empName"));
	    Name.sendKeys("Nathan");
	    
	    // select job
	    Select jobtitleDrop = new Select(driver.findElement(By.id("searchDirectory_job_title")));
	    jobtitleDrop.selectByVisibleText("Sales Representative");
	    
	    // select location
	    Select locationDrop = new Select(driver.findElement(By.id("searchDirectory_location")));
	    locationDrop.selectByVisibleText("  United States");
	    
	    WebElement search = driver.findElement(By.id("searchBtn"));
	    search.click();
	    
	    String verificar = driver.findElement(By.xpath("//b[contains(text(),'Nathan Elliot')]")).getText();
	    boolean existname = verificar.equals("Nathan Elliot");
	    
	    if(existname)
	    {
	    	System.out.println("El nombre del personaje existe");
	    }else
	    {
	    	System.out.println("El nombre del NO personaje existe");
	    }

	}

}
