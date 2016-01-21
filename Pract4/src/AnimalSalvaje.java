
public class AnimalSalvaje extends Animal
{
	String localidad;
	
	public AnimalSalvaje(String localidad, String tipo, String nombre, String come)
	{
		super(tipo, nombre, come);
		this.localidad = localidad;
	}
	
	public void set_Localidad (String localidad)
	{
		this.localidad = localidad;
	}
	
	public String get_Localidad()
	{
		return localidad;
	}
	
	public void caza()
	{
		System.out.print(" CAZA, ");
	}
}
