package selenium711;

import java.io.File;
import java.nio.file.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Arrays.ArregloMulti;
import Arrays.EjemploArreglos;
import accesosmodifiers.A;
import ciclos.BucleFor;
import ciclos.EjemploForBreak;
import ciclos.EjemploWhile;
import claseObjetos.Vehiculo;
import condicionales.EjemploIf;
import condicionales.EjemploIfAnidado;
import condicionales.EjemploIfElse;
import condicionales.EjemploSwitchCase;
import constructor.ConstructorEj;
import encapsulamiento.MiClase;
import herencia.Triangulo;
import metodos.EjemploMetodos;
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
    
    System.out.println("");
    System.out.println("Ejemplo de IF");
    EjemploIf a = new EjemploIf();
    a.EjemIf();
    System.out.println("");
    System.out.println("Ejemplo de IF else");
    EjemploIfElse s = new EjemploIfElse();
    s.EjemIfElse();
    System.out.println("");
    System.out.println("Ejemplo de IF Anidado");
    EjemploIfAnidado E =new   EjemploIfAnidado();
    E.EjemIfAnidado();
    E.EjemploIfElseIf();
    
    System.out.println("");
    System.out.println("Ejemplo de SwitCase");
    EjemploSwitchCase f =new EjemploSwitchCase();
    f.EjemSwitch();
   
    //ejemplo bucle  while
    System.out.println("");
    System.out.println("Ejemplo de While");
    EjemploWhile g = new  EjemploWhile();
    g.EjemWhile();
    System.out.println("");
    System.out.println("Ejemplo de doWhile");
    g.EjemploDoWhile();
    
    //ejemplo bucle for
    System.out.println("");
    System.out.println("Ejemplo de For break");
    BucleFor w = new BucleFor();
    w.EjemploFor();
    
    //quebrar un for
    System.out.println("");
    System.out.println("Ejemplo de For break");
	EjemploForBreak m = new EjemploForBreak();
    m.breakk();
   
    System.out.println("");
    System.out.println("Ejemplo de Arreglos");
    EjemploArreglos ArE = new EjemploArreglos();
    ArE.Ejemarreglo();
    System.out.println(" Ejemplo Arreglo Bidimencional");
    ArregloMulti ml=new  ArregloMulti();
    ml.ArregloBs();
    
    System.out.println("");
    System.out.println("Ejemplo de Metodos");
    EjemploMetodos Em = new EjemploMetodos();
    System.out.println("La suma es :"+Em.suma(39, 79));
    System.out.println("La suma es :"+Em.suma(39, 79,67)+" metodo sobrecargado");
    System.out.println("El carro seleccionado es "+ Em.carro(1));  
    
    System.out.println("");
    System.out.println("Ejemplo de objetos");
    Vehiculo vi = new Vehiculo();
    int rango;
    vi.capacidad=15;
    vi.pasajeros=20;
    vi.kmh=80;
    rango = vi.capacidad*vi.kmh;
    System.out.println("El vehiculo puede llevar "+ vi.pasajeros + " con un rango de "+ rango + " kilometros" );
    
    System.out.println("");
    System.out.println("Ejemplo de contructor");
    ConstructorEj cej= new ConstructorEj();
    System.out.println(cej.x);
    
    System.out.println("");
    System.out.println("Ejemplo de Herencia");
    Triangulo t1 = new Triangulo();   
    t1.altura =12;
    t1.base =5;
    t1.estilo ="isoceles";
    
    System.out.println("información pra t1");
    t1.mostrarEstilo();
    t1.mostrarDimencional();
    System.out.println("Su area es: "+t1.area()); 
   
    System.out.println("");
    System.out.println("Ejemplo de polimorfismo se reutiliza las clases variables y codigo");
    Triangulo t2 = new Triangulo();
    t2.altura =10;
    t2.base =9;
    t2.estilo ="isoceles";
    
    System.out.println("información pra t2");
    t2.mostrarEstilo();
    t2.mostrarDimencional();
    System.out.println("Su area es: "+t2.area()); 
    
    System.out.println("");
    System.out.println("Ejemplo de Capsulación son los getters y setters");
    MiClase miclase = new MiClase();
    miclase.setTipo(7);
    System.out.println("El tipo es :" + miclase.getTipo());
    
    System.out.println("");
    System.out.println("Ejemplo de los modificadores de acceso publico privado ");
    A ab = new A();
    ab.mostrar1();
    
	}
}
