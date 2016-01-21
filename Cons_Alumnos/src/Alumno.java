import java.util.*;

public class Alumno
{
	private String nombre = new String();
	private int matricula;
	private float calificacion;
	static Scanner in = new Scanner (System.in);
	
	public void set_Nombre ()
	{
		System.out.println("Nombre");
		nombre = in.next();
	}
	
	public void set_Matricula ()
	{
		System.out.println("Matricula");
		matricula = in.nextInt();
	}
	
	public void set_Calificacion ()
	{
		System.out.println("Calificación");
		calificacion = in.nextFloat();
	}
	
	public void set_Nombre (String nombre)
	{
		this.nombre = nombre;
	}
	
	public void set_Matricula (int matricula)
	{
		this.matricula = matricula;
	}
	
	public void set_Calificacion (float calificacion)
	{
		this.calificacion = calificacion;
	}
	
	public String get_Nombre ()
	{
		return (nombre);
	}
	
	public int get_Matricula ()
	{
		return (matricula);
	}
	
	public float get_Calificacion ()
	{
		return (calificacion);
	}
	
	public void estado ()
	{
		System.out.println("Nombre: \t" + nombre + "\nMatricula: \t" + matricula + "\nCalificación: \t" + calificacion);
		System.out.println("");
	}
	
}
