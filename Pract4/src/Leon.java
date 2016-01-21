
public class Leon extends AnimalSalvaje
{
	public Leon (String localidad, String tipo, String nombre, String come)
	{
		super(localidad, tipo, nombre, come);
	}
	
	public void ruge()
	{
		System.out.print(" RUGE, ");
	}
	
	public void desgarra()
	{
		System.out.print(" DESGARRA, ");
	}
	
	public void come()
	{
		System.out.print(" COME " + come + ", ");
	}
	
	public void estado()
	{
		System.out.print("El " + nombre + " es un Animal del tipo " + tipo + " de la localidad " + localidad );
		ruge();
		desgarra();
		super.caza();
		super.come();
		super.duerme();
		System.out.println();
	}
}
