
public class Costos
{
	static float costolechera = 18000;
	static float costobecerro = 15000;
	static float costotoro = 12000;

	static float calcularBecerros (int num_becerros)
	{
		float costo;
		costo = num_becerros * costobecerro;
		return costo;
	}

	static float calcularLecheras (int num_lecheras)
	{
		float costo;
		costo = num_lecheras * costolechera;
		return costo;
	}

	static float calcularToros (int num_toros)
	{
		float costo;
		costo = num_toros * costotoro;
		return costo;
	}

	static float calcularTotal (int num_lecheras, int num_becerros, int num_toros)
	{
		float costo;
		costo = calcularLecheras(num_lecheras) + calcularBecerros(num_becerros) + calcularToros(num_toros); 
		return costo;
	}

	
}
