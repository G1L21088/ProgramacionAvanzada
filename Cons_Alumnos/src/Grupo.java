import java.util.*;

public class Grupo
{
	private Alumno [] elementos;
	private static int demanda = 0;
	static Scanner in = new Scanner(System.in);

	public Grupo ()
	{
		System.out.println("¿Dé cuantos alumnos consta el grupo?");
		int max = in.nextInt();
		
		elementos = new Alumno [max];
		
		for (int i = 0; i < max; i ++)
			elementos [i] = new Alumno();
	}
	
	public void alta ()
	{
		if (demanda < elementos.length)
		{
			elementos [demanda].set_Matricula();
			elementos [demanda].set_Nombre();
			elementos [demanda].set_Calificacion();
			demanda ++;
		} else 
			System.out.println("ERROR\nYa no hay cupo\n");
	}

	public void alta (String nombre, int matricula, float calificacion)
	{
		if (demanda < elementos.length)
		{
			elementos [demanda].set_Matricula(matricula);
			elementos [demanda].set_Nombre(nombre);
			elementos [demanda].set_Calificacion(calificacion);
			demanda ++;
		} else 
			System.out.println("ERROR\nYa no hay cupo\n");
	}
	
	public void lista ()
	{
		for (int i = 0; i < demanda; i ++)
			elementos [i].estado();
	}
	
	public int busqueda (int matricula)
	{
		int i = 0;
		
		while ((i < (demanda)) && (elementos [i].get_Matricula() != matricula))
			
			i ++;
		
		return i;
	}
	
	public void calificacion ()
	{
		int pos;
		int matricula;
		
		System.out.println("Matricula");
		matricula = in.nextInt();
		
		pos = busqueda (matricula);
		
		if (pos < demanda)
		{
			elementos [pos].set_Calificacion();
		}
		else
		{
			System.out.println("ERROR\nEl alumno no esta matriculado en este grupo\n");
		}
	}
	
	private void intercambia(int i, int j)
	{
		Alumno aux = new Alumno();
		
		aux = elementos [i];
		elementos [i] = elementos [j];
		elementos [j] = aux;
	}
	
	public void ord_Calificacion()
	{
		int i;
		int j;
		for(i = 0; i < demanda; i ++)
			for(j = 0; demanda > j; j ++)
				if(elementos[i].get_Calificacion() < elementos[j].get_Calificacion())
					intercambia(i, j);
	}

	public void ord_Matricula()
	{
		int i;
		int j;
		for(i = 0; i < demanda; i ++)
			for(j = 0; demanda > j; j ++)
				if(elementos[i].get_Matricula() < elementos[j].get_Matricula())
					intercambia(i, j);
	}

	public void ord_Nombre()
	{
		int i;
		int j;
		for(i = 0; i < demanda; i ++)
			for(j = 0; demanda > j; j ++)
				if(elementos[i].get_Nombre().compareTo(elementos[j].get_Nombre()) < elementos[j].get_Nombre().compareTo(elementos[i].get_Nombre()))
					intercambia(i, j);
	}
	
	public void estado()
	{
		int pos;
		int matricula;
		
		System.out.println("Matricula");
		matricula = in.nextInt();
		
		pos = busqueda (matricula);
		
		if (pos < demanda)
		{
			elementos [pos].estado();
		}
		else
		{
			System.out.println("ERROR\nEl alumno no esta matriculado en este grupo\n");
		}
	}
	
	public void promedio()
	{
		float suma = 0;
		float promedio = 0;
		int i;
		
		for (i = 0; i < demanda; i++)
		{
			suma = suma + (elementos[i].get_Calificacion());
		}
		
		promedio = (suma/demanda);
		
		System.out.println("El salón tiene un maximo de " + elementos.length + " alumnos\nDonde se han inscrito " + demanda + " alumnos\nPor lo tanto el grupo tiene un promedio de tiene un promedio de " + promedio);
	}

	public void baja()
	{
		int i;
		int pos;
		int matricula;

		System.out.println("Matricula");
		matricula = in.nextInt();
		
		pos = busqueda (matricula);
		i = pos;
		
		while ((i < demanda - 1) && (pos != demanda))
		{
			elementos [i] = elementos [i + 1];
			i ++;
		}
		demanda --;
	}
	
	public void ordBurbuja ()
	{
		
	}
	
	public void ordInsercion ()
	{
		
	}
	
	public void ordSeleccion ()
	{
		
	}
	
}
