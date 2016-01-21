import java.util.Scanner;

public class Arreglo_int
{
	private int[] elementos;
	
	public Arreglo_int(int N)
	{
		elementos = new int[N];	  
	}
	
	public Arreglo_int()
	{
		
	}
	
	public void printArray()
	{
		int i;
        for(i = 0; i < elementos.length; i ++)
        	System.out.print(" ["+i+"]:"+elementos[i]);
        System.out.println("");
	}
	
	public void printArray(String Arr)
	{
		System.out.print("" + Arr + "");
		int i;
        for(i = 0; i < elementos.length; i ++)
        	System.out.print(" [" + i + "]:" + elementos[i]);
        System.out.println("");	
	}
	
	public int[] getArray()
	{
		return (elementos);
	}
	
	public void iniArray(int max)
	{
		int i = 0;
		for(i = 0; i < elementos.length; i ++)
	  	   elementos[i] = (int)Math.round((Math.random()) * max);
	}
	
	public void iniArray()
	{
		int i = 0;
		int N; // variable para leer tamaño del arreglo
		@SuppressWarnings("resource")
		Scanner ingresar = new Scanner(System.in); //variable para lectura
		
		System.out.println("Ingresar tamaño del arreglo: ");
		N = ingresar.nextInt(); //se lee un entero del teclado
		elementos = new int[N]; //se crea el arreglo de tamaño N
		
		for(i = 0; i < elementos.length; i ++)
		{
			System.out.println("Ingresar el entero del arreglo para la posición " + i + " : ");
			elementos[i] = ingresar.nextInt();
		}
	}

	private void intercambia(int i, int j)
	{
		int aux;
		aux = elementos[i];
		elementos[i] = elementos[j];
		elementos[j] = aux;
	}
	
	public void ordenaBurbuja()
	{
		int i;
		int j;
		for(i = 0; i < elementos.length; i ++)
			for(j = 0; elementos.length > j; j ++)
				if(elementos[i] < elementos[j])
					intercambia(i, j);
	}
    	
}

	
	
