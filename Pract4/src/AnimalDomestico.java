
public class AnimalDomestico extends Animal
{
	String nombrePropio;
	
	public AnimalDomestico(String nombrePropio, String tipo, String nombre, String come)
	{
		super(tipo, nombre, come);
		this.nombrePropio = nombrePropio;
	}
	
	public void set_Nombre(String nombrePropio)
	{
		this.nombrePropio = nombrePropio;		
	}
	
	public String get_Nombre()
	{
		return nombrePropio;
	}
	
	public void estado()
	{
		System.out.println();
	}
}
