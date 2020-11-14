package condicionales;

public class EjemploIfAnidado {

	public void EjemIfAnidado()
	{
		int temperatura= 14;
		
		if(temperatura>15) {
			if(temperatura>25) {
				System.out.println("A la playa..");
			}else {
				System.out.println("A la montaña..");
			}
			}else {
				System.out.println("A descanasar..");
		}
		
		
	}
	
	public void EjemploIfElseIf()
	{
		int i=18;
		
		if(i==10)
		{
			System.out.println("El valor de la variable es 10");
		}else if(i==15)
		{
			System.out.println("El valor de la variable es 15");
		}else if(i==20)
		{
			System.out.println("El valor de la variable es 20");
		}else {
			System.out.println("El valor de la variable No equivales al opciones presentes");
		}
	}
}
