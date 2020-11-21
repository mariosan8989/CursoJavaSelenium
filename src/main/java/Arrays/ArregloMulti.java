package Arrays;

public class ArregloMulti {
	
	int arr [][] = {{1,4,6},{7,8,4,7},{0,9,8,7,6}};
	
	public void ArregloBs()
	{
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Arreglo "+" : "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
