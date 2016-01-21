
public class Alumno
{
	private String nombre = new String();
	private int matricula;
	private float calificacion;
	
	public void set_Nombre()
	{
		System.out.println("Introduce el Nombre");
		nombre = Lee.cadena();
	}
	
	public void set_Nombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void set_Matricula()
	{
		System.out.println("Introduce la Matricula");
		matricula = Lee.entero();
	}
	
	public void set_Matricula(int matricula)
	{
		this.matricula = matricula;
	}
	
	public void set_Calificacion()
	{
		System.out.print("Introduce la Calificación: ");
		calificacion = Lee.real();
	}
	
	public void set_Calificacion(float calificacion)
	{
		this.calificacion = calificacion;
	}
	
	public String get_Nombre()
	{
		return nombre;
	}
	
	public int get_Matricula()
	{
		return matricula;
	}
	
	public float get_Calificacion()
	{
		return calificacion;
	}
	
	public void estado()
	{
		System.out.println("\nNombre: \t" + nombre +
				"\nMatricula: \t" + matricula +
				"\nCalificación: \t" + calificacion);
		System.out.println("");
	}
	
}
