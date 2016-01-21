
public class Articulo
{

	private int codigo;
	private String nombre;
	private int existencia;

	public Articulo(int codigo, String nombre, int existencia)
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.existencia = existencia;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setExistencia(int existencia)
	{
		this.existencia = existencia;
	}

	public int getCodigo()
	{
		return codigo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public int getExistencia()
	{
		return existencia;
	}
}
