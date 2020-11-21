package herencia;

public class Triangulo extends Dosdimencionales{
public	String estilo;
public double area()
	{
		return base*altura/2;
	}
    
	public void mostrarEstilo()
	{
		System.out.println("Triangulo es : " + estilo);
	}
}
