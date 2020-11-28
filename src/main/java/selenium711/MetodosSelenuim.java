package selenium711;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MetodosSelenuim {

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
	    
	    //metodo del Explorador
	     String title = driver.getTitle();
	     System.out.println("El titrulo es : " + title);
	     
	     //Validicación HommePage
	     String urlDashboard = driver.getCurrentUrl();
	     boolean loginCorrect = urlDashboard.contains("/dashboard");//la url contiene la palabra dashboard
         if(loginCorrect == true)
         {
        	 System.out.println("Login Correcto");
         }else {
        	 System.out.println("Login Incorrecto");
         }
        /* 
         //Metodos de navegación
         driver.navigate().back();
         Thread.sleep(1000);
         driver.navigate().forward();
         Thread.sleep(1000);
         driver.navigate().refresh();
         Thread.sleep(3000);*/
         
      //   driver.close();//cierra un tab de el navegador
      //   driver.quit();// Cierra todos los tab
         
         //click en Assign leave
         WebElement assignLeave  = driver.findElement(By.className("quickLinkText"));
         assignLeave.click();
         Thread.sleep(3000);
         
         // llenar el texbox Employyee Name
         WebElement employeeName = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
         employeeName.sendKeys("Mario Sanchez");
         Thread.sleep(3000);
         employeeName.clear();
         
         //verificar el elemento desplegado en la pagina
         boolean assignBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
         
         if(assignBtn == true) 
         {
        	 System.out.println("El boton assign esta desplegado");
         }
         
         String welcomeMsj = driver.findElement(By.id("welcome")).getText();
         System.out.println(welcomeMsj);
         boolean userMsj = welcomeMsj.contains("paul");
         if(userMsj)
         {
        	 System.out.println("El mensaje no contiene el monbre de paul");
         }else {
        	 System.out.println("El mensaje no contiene el monbre de paul");
         }
         
         //interectual con dropdown
         Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
         oSelect.selectByVisibleText("US - FMLA");
         Thread.sleep(3000);
         
         // extrar una lista de elementos que comparten la misma clase
         List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
         System.out.println("Numero de elementos :" + firstLevelMenu.size());// muestra la lista
         String primerMenu = firstLevelMenu.get(0).getText();
         System.out.println(primerMenu);
         String segundoMenu = firstLevelMenu.get(1).getText();
         System.out.println(segundoMenu);
         System.out.println("");
         for (int i=0; i<firstLevelMenu.size();i++)
         {
        	 System.out.println("Los menus son :" + firstLevelMenu.get(i).getText());
         }
         
         driver.quit();// Cierra todos los tab
	}

}
