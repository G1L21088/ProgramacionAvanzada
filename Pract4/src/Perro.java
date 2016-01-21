
public class Perro extends AnimalDomestico
{
	public Perro (String nombrePropio, String tipo, String nombre, String come)
	{
		super(nombrePropio, tipo, nombre, come);
	}
	
	public void ladra()
	{
		System.out.print(" LADRA, ");
	}
	
	public void mueveCola()
	{
		System.out.print(" MUEVE LA COLA, ");
	}
	
	public void come()
	{
		System.out.print(" COME " + come + ", ");
	}
	
	public void estado()
	{
		System.out.print(nombrePropio + " es un " + nombre + " del tipo Animal " + tipo);
		ladra();
		mueveCola();
		super.come();
		super.duerme();
		System.out.println();
	}
}
