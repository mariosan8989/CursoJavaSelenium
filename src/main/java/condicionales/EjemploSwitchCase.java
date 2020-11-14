package condicionales;

public class EjemploSwitchCase {
      
	public void EjemSwitch()
	{
		int i = 9;
		
		switch(i) {
		case 0:
			System.out.println("i es igual que cero");
			break;
		case 1:
			System.out.println("i es igual que uno");
			break;
		case 2:
			System.out.println("i es igual que dos");
			break;
		default :
			System.out.println("i es mayor que dos");
		}
	}
}
