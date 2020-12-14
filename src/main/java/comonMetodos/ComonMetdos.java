package comonMetodos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ComonMetdos {

	public static void takeScreenshot(WebDriver driver, String testCaseName)
	{
		//toma el screnshot de la pagina
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// establecer ruta donde se va a guardar el archivo
		String screenshotPath = Paths.get("").toAbsolutePath().toString() 
				+ File.separator +"test-output"+ File.separator + "ExecutionResult";
		
		try {
			//Creamos el folder usando la ruta especificado en la variable "screenshot"
			FileHandler.createDir(new File(screenshotPath));
			//copiar el screenshot generado en el objeto "srcFile" a la ruta especificada en "screenshot"
			FileHandler.copy(srcFile, new File(screenshotPath + File.separator + testCaseName+ ".png"));
		}catch (IOException e){
			
			e.printStackTrace();
		}	
		
	}
}
