
public class Ganado
{
	int no_total = 0;
	String namelocalidad = new String();
	int no_becerros = 0;
	int no_lecheras = 0;
	int no_toros = 0;
	static final int BECERROS = 1;
	static final int LECHERAS = 2;
	static final int TOROS = 3;
	static int no_total_ganado = 0;
	static int no_total_becerros = 0;
	static int no_total_lecheras = 0;
	static int no_total_toros = 0;
	static float costo_total = 0;
	static float mayortotal = 0;
		
	void compra(int num, int tipo)
	{
		switch(tipo)
		{
		case BECERROS: no_becerros = no_becerros + num; 
		no_total_becerros = no_total_becerros + no_becerros;
		break;
		case LECHERAS: no_lecheras = no_lecheras + num;
		no_total_lecheras = no_total_lecheras + no_lecheras;
		break;
		case TOROS: no_toros = no_toros + num;
		no_total_toros = no_total_toros + no_toros;
		break;
		default: System.out.println("ERROR...\nTipo de Ganado Invalido");
		}
		no_total = no_total + num;
		no_total_ganado = no_total_becerros + no_total_lecheras + no_total_toros;
	}
	
	void ini_localidad(String namelocalidad)
	{
		this.namelocalidad = namelocalidad;
	}
	
	void estado()
	{
		System.out.println("\nGanado en " + namelocalidad + "\n\n> Becerros: " + no_becerros + "\n> Lecheras: " + no_lecheras + "\n> Toros: " + no_toros + "\n\n>> Total = " + no_total);
	}
	
	String localidad()
	{
		return namelocalidad;
	}
	
	int total_ganado()
	{
		return no_total;
	}
	
	int num_becerros()
	{
		return no_becerros;
	}
	
	int num_lecheras()
	{
		return no_lecheras;
	}
	
	int num_toros()
	{
		return no_toros;
	}
	
	static void totales()
	{
		System.out.println();
		System.out.println("> El total de Becerros es: " + no_total_becerros);
		System.out.println("> El total de Lecheras es: " + no_total_lecheras);
		System.out.println("> El total de Toros es: " + no_total_toros);
		System.out.println("> El total de Ganado es: " + no_total_ganado);
		System.out.println("> El Total de la Compra es: " + costo_total);
	}

	void costos()
	{
		System.out.println();
		System.out.println("Costos en " + localidad());
		System.out.println();
		System.out.println("El costo total de Becerros es de " + Costos.calcularBecerros(num_becerros()));
		System.out.println("El costo total de Lecheras es de " + Costos.calcularLecheras(num_lecheras()));
		System.out.println("El costo total de Toros es de " + Costos.calcularToros(num_toros()));
		System.out.println("El costo total del Ganado es de " + (Costos.calcularTotal(num_lecheras(), num_becerros(), num_toros())));
		costo_total = costo_total + Costos.calcularTotal(num_lecheras(), num_becerros(), num_toros());
	}

	void mayor()
	{
		float costototal = (Costos.calcularBecerros(num_becerros()) + Costos.calcularLecheras(num_lecheras()) + Costos.calcularToros(num_toros()));
		
		if (mayortotal < costototal)
			mayortotal = Costos.calcularTotal(num_lecheras(), num_becerros(), num_toros());
	}
	
	static void imprimirMayor()
	{
		System.out.println("\nEl costo mayor es de: " + mayortotal);
	}
	
}
