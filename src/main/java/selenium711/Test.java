package selenium711;

import java.io.File;
import java.nio.file.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ciclos.BucleFor;
import ciclos.EjemploForBreak;
import ciclos.EjemploWhile;
import condicionales.EjemploIf;
import condicionales.EjemploIfAnidado;
import condicionales.EjemploIfElse;
import condicionales.EjemploSwitchCase;
import tiposDeDatos.variables;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("test");
    /*
    String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; // seteando el path de nuestro driver
    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //identificar el exe driver
    WebDriver driver = new ChromeDriver();//creacion de tiempo de ejecucion de muestro web driver
    driver.get("https://www.cooltesters.com/tienda-de-cursos/automation");// abriendo el navegador
    driver.manage().window().maximize();*/
    // ejemplo de variables
    variables v = new variables();
    v.var();
    EjemploIf a = new EjemploIf();
    a.EjemIf();
    EjemploIfElse s = new EjemploIfElse();
    s.EjemIfElse();
    EjemploIfAnidado E =new   EjemploIfAnidado();
    E.EjemIfAnidado();
    E.EjemploIfElseIf();
    EjemploSwitchCase f =new EjemploSwitchCase();
    f.EjemSwitch();
    //ejemplo bucle  while
    EjemploWhile g = new  EjemploWhile();
    g.EjemWhile();
    g.EjemploDoWhile();
    //ejemplo bucle for
    BucleFor w = new BucleFor();
    w.EjemploFor();
    //quebrar un for
	EjemploForBreak m = new EjemploForBreak();
    m.breakk();
	}
}
