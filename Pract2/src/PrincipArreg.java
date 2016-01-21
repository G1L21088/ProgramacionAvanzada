
public class PrincipArreg {

	public static void main(String[] args)
	{
		Arreglo_int A = new Arreglo_int(6);//se crea un objeto A que tiene un arreglo de tamaño 10
		Arreglo_int B = new Arreglo_int(6);//se crea un objeto B que tiene un arreglo de tamaño 10
        Arreglo_int C = new Arreglo_int();
		
        int E[];
        int i;
        
		A.iniArray(20); //inicializa el arreglo del objeto A con valores del 0 al 20
		A.printArray("A =");
		A.printArray();//despliega el arreglo del objeto  A
		A.ordenaBurbuja();
		A.printArray("Ordenado A = ");
		System.out.println("");
		
		B.iniArray(20); //inicializa el arreglo del objeto B con valores del 0 al 20
		B.printArray("B =");
		B.printArray();//despliega el arreglo del objeto  B
		B.ordenaBurbuja();
		B.printArray("Ordenado B = ");
		System.out.println("");
		
		System.out.println("El producto de los vectores A y B es: " + Vectores.prodV(A.getArray(), B.getArray()));
		System.out.println("");
		
		System.out.println("La suma de los vectores A y B es: ");
		for(i = 0; i < Vectores.sumaV(A.getArray(), B.getArray()).length; i ++)
			System.out.print(" [" + i + "]:" + Vectores.sumaV(A.getArray(), B.getArray())[i]);
		
		System.out.println("\n");
		
		E = A.getArray().clone();
		for(i = 0; i < E.length; i ++)
			E[i] = i;
		A.printArray("A = "); //desplegamos A
		System.out.print("E = "); //desplegamos E
		for(i = 0; i < E.length; i ++)
			System.out.print(" [" + i + "]:" + E[i]);
		System.out.println("\n");

		C.iniArray();//inicializa el arreglo del objeto B con valores del 0 al 20
		System.out.println("");
		C.printArray("C =");
		C.ordenaBurbuja();
		C.printArray("Ordenado C = ");
  	}

}
