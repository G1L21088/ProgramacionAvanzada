import java.util.*;

public class Principal
{
	static Scanner in = new Scanner(System.in);
	static int opcion;
	static Grupo avanzada;

	public static void main (String[] args)
	{
		avanzada = new Grupo ();
		Tarea ();
	}
	
	public static void Tarea ()
	{
		System.out.println("¿Qué desea hacer?\n");
		System.out.println("1. Altas");
		System.out.println("2. Bajas");
		System.out.println("3. Cambios de Calificación");
		System.out.println("4. Consultas");
		System.out.println("5. Salir");
		System.out.println("\nSeleccione una opción");
		
		opcion = in.nextInt();
		
		switch (opcion)
		{
		case 1:
			System.out.println("Dar de Alta");
			avanzada.alta ();
			Tarea ();
			break;
			
		case 2:
			System.out.println("Dar de Baja");
			avanzada.baja();
			Tarea ();
			break;
			
		case 3:
			System.out.println("Poner calificación");
			avanzada.calificacion ();
			Tarea ();
			break;
			
		case 4:
			System.out.println("Consultas");
			consulta ();
			break;
			
		case 5:
			System.out.println("Gracias por usar mi programa.");
			break;

		default:
			System.out.println("Eligio una opción invalida");
			Tarea ();
			break;
		}
	}
	
	private static void consulta ()
	{
		System.out.println("¿Qué consulta desea hacer?\n");
		System.out.println("1. Alumno");
		System.out.println("2. Listado por Nombre");
		System.out.println("3. Listado por Matricula");
		System.out.println("4. Listado por Calificaciones");
		System.out.println("5. Promedio del Grupo");
		System.out.println("6. Regresar al menú anterior");
		System.out.println("\nSeleccione una opción");
		
		opcion = in.nextInt();
		
		switch (opcion)
		{
		case 1:
			System.out.println("Alumno");
			avanzada.estado();
			consulta ();
			break;
			
		case 2:
			System.out.println("Orden Por Nombre");
			avanzada.ord_Nombre ();
			avanzada.lista ();
			consulta ();
			break;
			
		case 3:
			System.out.println("Orden Por Matricula");
			avanzada.ord_Matricula ();
			avanzada.lista ();
			consulta ();
			break;
			
		case 4:
			System.out.println("Orden Por Calificaciones");
			avanzada.ord_Calificacion ();
			avanzada.lista ();
			consulta ();
			break;
			
		case 5:
			System.out.println("Promedio del Grupo");
			avanzada.promedio ();
			consulta ();
			break;
			
		case 6:
			System.out.println("");
			Tarea ();
			break;

		default:
			System.out.println("Eligio una opción invalida");
			consulta ();
			break;	
		}
	}

}
