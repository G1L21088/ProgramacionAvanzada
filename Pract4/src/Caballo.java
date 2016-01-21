
public class Caballo extends AnimalDomestico
{
	public Caballo (String nombrePropio, String tipo, String nombre, String come)
	{
		super(nombrePropio, tipo, nombre, come);
	}
	
	public void trota()
	{
		System.out.print(" TROTA, ");
	}
	
	public void relincha()
	{
		System.out.print(" RELINCHA, ");
	}
	
	public void come()
	{
		System.out.print(" COME " + come + ", ");
	}
	
	public void estado()
	{
		System.out.print(nombrePropio + " es un " + nombre + " del tipo Animal " + tipo);
		trota();
		relincha();
		super.come();
		super.duerme();
		System.out.println();
	}
}
