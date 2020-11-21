package Arrays;

public class EjemploArreglos {

	//formas de iniciarlizar un arreglo
	//int intArray[];
	//int [] intArray2;
	//short shorArray[];
	String arrays [];
	
	public void Ejemarreglo()
	{
		
		arrays = new String[6];
		
		arrays[0]="Cero";
		arrays[1]="Uno";
		arrays[2]="Dos";
		arrays[3]="Tres";
		arrays[4]="Cuatro";
		arrays[5]="Cinco";
		
		for(int i=0;i<arrays.length; i++)
		{
			System.out.println("Elemento en el indice "+i+ " : "+arrays[i]);
		}
	}
	

}
