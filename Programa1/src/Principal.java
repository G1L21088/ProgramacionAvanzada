
public class Principal
{
	static Grupo avanzada;

	public static void main(String[] args)
	{
		avanzada = new Grupo();
		Menu();
	}
		
	private static void Menu()
	{
		System.out.println("¿Qué desea hacer?\n");
		System.out.println("1> Altas");
		System.out.println("2> Bajas");
		System.out.println("3> Cambios");
		System.out.println("4> Consultas");
		System.out.println("5> Salir del Sistema");
		System.out.print("\nSeleccione una opción: ");
	
		int opcion = Lee.entero();

		switch(opcion)
		{
		case 1:
			System.out.println("Dar de Alta");
			avanzada.alta(Lee.enteroMatriculas(), Lee.cadenaNombre());
			Menu();
			break;
				
		case 2:
			System.out.println("Dar de Baja");
			avanzada.baja(Lee.enteroMatriculas());
			Menu();
			break;
			
		case 3:
			System.out.println("Poner calificación");
			avanzada.calificacion();
			Menu();
			break;
			
		case 4:
			System.out.println("Consultas");
			System.out.println("");
			consulta();
			break;
			
		case 5:
			System.out.println("GRACIAS POR USAR MI PROGRAMA.\n" +
					"BUEN DIA");
			break;

		default:
			System.out.println("Eligio una opción invalida");
			System.out.println("");
			Menu();
			break;
		}
	}
		
	private static void consulta()
	{
		System.out.println("¿Qué consulta desea hacer?\n");
		System.out.println("1> Alumno");
		System.out.println("2> Listado por Nombre");
		System.out.println("3> Listado por Matrícula");
		System.out.println("4> Listado por Calificación");
		System.out.println("5> Promedio del Grupo");
		System.out.println("6> Fin Consultas");
		System.out.print("\nSeleccione una opción: ");
		
		int opcion = Lee.entero();
		
		switch (opcion)
		{
		case 1:
			System.out.println("Alumno");
			System.out.println("");
			avanzada.estado();
			consulta();
			break;
				
		case 2:
			System.out.println("Orden Por Nombre");
			System.out.println("");
			avanzada.ord_NombreBurbuja();
			avanzada.lista();
			consulta();
			break;
				
		case 3:
			System.out.println("Orden Por Matricula");
			System.out.println("");
			avanzada.ord_MatriculaSeleccion();
			avanzada.lista();
			consulta();
			break;
			
		case 4:
			System.out.println("Orden Por Calificaciones");
			System.out.println("");
			avanzada.ord_CalificacionInsercion();
			avanzada.lista();
			consulta();
			break;
			
		case 5:
			System.out.println("Promedio del Grupo");
			System.out.println("");
			avanzada.promedio();
			consulta();
			break;
			
		case 6:
			System.out.println("");
			Menu();
			break;

		default:
			System.out.println("Eligio una opción invalida");
			System.out.println("");
			consulta();
			break;	
		}
	}
}
