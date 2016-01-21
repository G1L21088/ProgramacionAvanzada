import java.util.ArrayList;

public class Alumno
{
	private ArrayList<String> alumnonom;
	private ArrayList<Integer> alumnomat;
	private ArrayList<Float> alumnocal;
	
	public void set_Nombre()
	{
		System.out.println("Introduce el Nombre");
		alumnonom.add(Lee.cadena());
	}
	
	public void set_Matricula()
	{
		System.out.println("Introduce la Matricula");
		alumnomat.add(Lee.entero());
	}
	
	public void set_Calificacion()
	{
		System.out.print("Introduce la Calificación: ");
		alumnocal.add(Lee.real());
	}
	
	public String get_Nombre(int index)
	{
		return alumnonom.get(index);
	}
	
	public int get_Matricula(int index)
	{
		return alumnomat.get(index);
	}
	
	public float get_Calificacion(int index)
	{
		return alumnocal.get(index);
	}
	
	public void estado(int index)
	{
		System.out.println("\nNombre: \t" + alumnonom.get(index) +
				"\nMatricula: \t" + alumnomat.get(index) +
				"\nCalificación: \t" + alumnocal.get(index));
		System.out.println("");
	}
	
}
