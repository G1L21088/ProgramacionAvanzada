
public class Animal
{
	String tipo;
	String nombre;
	String come;
	
	public Animal(String tipo, String nombre, String come)
	{
		this.tipo = tipo;
		this.nombre = nombre;
		this.come = come;
	}
	
	public void set_Tipo(String tipo)
	{
		this.tipo = tipo;
	}
	
	public void set_Nombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String get_Tipo()
	{
		return tipo;
	}
	
	public String get_Nombre()
	{
		return nombre;
	}
	
	public void set_Come(String come)
	{
		this.come = come;
	}
	
	public String get_Come()
	{
		return come;
	}
	
	
	public void come()
	{
		System.out.print(" COME ");
	}
	
	public void duerme()
	{
		System.out.print("y DUERME.");
	}
	
}
