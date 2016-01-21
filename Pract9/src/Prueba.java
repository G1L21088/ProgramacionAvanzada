
public class Prueba
{
	public static void main(String[] args)
	{
		Lligada Llig1 = new Lligada();
		Lligada Llig2 = new Lligada();
		Lligada Llig3 = new Lligada();
		Larray Larr1 = new Larray();
		Larray Larr2 = new Larray();
		Larray Larr3 = new Larray();
		long tiempoIni, tiempoFin, milisegundos;

		int I = 25;
		int J = 24;
		
		Llig1.add_numbers_Last(I);
		Llig2.add_numbers_First(I);
		Llig3.add_numbers_Medium(I);
		Larr1.add_numbers_Last(I);
		Larr2.add_numbers_First(I);
		Larr3.add_numbers_Medium(I);
		Llig1.remove_numbers_Last(J);
		Llig2.remove_numbers_First(J);
		Llig3.remove_numbers_Medium(J);
		Larr1.remove_numbers_Last(J);
		Larr2.remove_numbers_First(J);
		Larr3.remove_numbers_Medium(J);

		Llig1.L.clear();
		Llig1.add_numbers_First(10);
		Larr3.L.clear();
		Larr3.add_numbers_Last(10);

		//Muestra
		
		tiempoIni = System.currentTimeMillis(); //obtiene tiempo al inicio
		Llig1.despliega();
		tiempoFin = System.currentTimeMillis(); //obtiene tiempo al final
		milisegundos = tiempoFin - tiempoIni; //obtiene tiempo de ejecución
		System.out.println("\nTiempo de ejecucion de Despliega Ligada: " + milisegundos + " milisegundos");
		
		tiempoIni = System.currentTimeMillis(); //obtiene tiempo al inicio
		Larr3.despliegaReversa();
		tiempoFin = System.currentTimeMillis(); //obtiene tiempo al final
		milisegundos = tiempoFin - tiempoIni; //obtiene tiempo de ejecución
		System.out.println("\nTiempo de ejecucion de Despliega Array: " + milisegundos + " milisegundos");
		
	}
}
