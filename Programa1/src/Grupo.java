
public class Grupo
{
	private Alumno[] alumnos;
	private static int demanda = 0;
	
	public Grupo()
	{
		System.out.println("¿Dé cuantos alumnos consta el grupo?");
		int max = Lee.entero();
		alumnos = new Alumno[max];
		for (int i = 0; i < max; i ++)
			alumnos[i] = new Alumno();
	}
	
	public Grupo(int max)
	{
		alumnos = new Alumno[max];
		for (int i = 0; i < max; i ++)
			alumnos[i] = new Alumno();		
	}

	public void alta(int matricula, String nombre)
	{
		ord_MatriculaSeleccion();
		if(demanda < alumnos.length)
			if(busquedaBinaria(matricula) == alumnos.length)
			{
				alumnos[demanda].set_Matricula(matricula);
				alumnos[demanda].set_Nombre(nombre);
				demanda ++;				
			}
			else
				System.out.println("ERROR\nMATRICULA YA ASIGNADA\n");
		else
			System.out.println("ERROR\nYA NO HAY CUPO\n");
	}

	public void baja(int matricula)
	{
		int pos;
		int i;
		
		ord_MatriculaSeleccion();
		pos = busquedaBinaria(matricula);
		
		if((pos != alumnos.length) && (demanda > 0))
		{
			i = pos;
			while((i < demanda - 1) && (i != demanda))
			{
				alumnos[i] = alumnos[i +1];
				i ++;
			}
			demanda --;
		}
		else
		{
			System.out.println("La matricula " + matricula + " no esta asignada en este grupo.");
		}
		
	}

	public void calificacion()
	{
		int pos;
		int matricula;
		
		ord_MatriculaSeleccion();		
		matricula = Lee.enteroMatriculas();
		pos = busquedaBinaria(matricula);
		
		if(pos != alumnos.length)
		{
			alumnos[pos].set_Calificacion();
		}
		else
		{	
			System.out.println("No se ha encontrado la matricula " + matricula);
		}
	}
	
	public void promedio()
	{
		int i;
		float promedio = 0;
		float suma = 0;
		
		for(i = 0; i < demanda; i ++)
		{
			suma = suma + alumnos[i].get_Calificacion();
		}
		promedio = suma/demanda;
		System.out.println("El promedio del grupo es de: " + promedio);
	}

	public int busquedaBinaria(int matricula)
	{
		int ini = 0;
		int fin = demanda;
		int pos = (int)(ini + fin)/2;
		
		while((ini <= fin) && (alumnos[pos].get_Matricula()) != matricula)
		{
			if(matricula < alumnos[pos].get_Matricula())
			{
				fin = pos - 1;
			}
			else
			{
				ini = pos + 1;
			}
			pos = (int) (ini + fin)/2;
		}
		
		if(ini > fin)
		{
			return alumnos.length;
		}
		else
		{
			return pos;
		}
	}



	public void ord_NombreBurbuja()
	{
		int superf;
		int nivel;
		
		for(superf = 0; superf < demanda - 1; superf ++)
		{
			for(nivel = demanda - 1; nivel > superf; nivel --)
			{
				if(alumnos[nivel].get_Nombre().compareTo(alumnos[nivel - 1].get_Nombre())
						< alumnos[nivel - 1].get_Nombre().compareTo(alumnos[nivel].get_Nombre()))
					intercambia(nivel, nivel - 1);
			}
		}
	}
	
	public void ord_MatriculaSeleccion()
	{
		int pos;
		int pmin;
		int min;
		int i;
		
		for(pos = 0; pos < demanda - 1; pos ++)
		{
			min = alumnos[pos].get_Matricula();
			pmin = pos;
			
			for(i = pos + 1; i < demanda; i ++)
			{
				if(alumnos[i].get_Matricula() < min)
				{
					min = alumnos[i].get_Matricula();
					pmin = i;
				}
			}
			intercambia(pmin, pos);
		}
	}

	public void ord_CalificacionInsercion()
	{
		int i;
		int fin;
		Alumno aux;
		
		for(fin = 0; fin < demanda - 1; fin ++)
		{
			aux = alumnos[fin + 1];
			i = fin + 1;
			
			while((i > 0) && (aux.get_Calificacion() < alumnos[i - 1].get_Calificacion()))
			{
				alumnos[i] = alumnos[i - 1];
				i --;
			}
			alumnos[i] = aux;
		}
	}
	
	private void intercambia(int i, int j)
	{
		Alumno aux;
		aux = alumnos[i];
		alumnos[i] = alumnos[j];
		alumnos[j] = aux;
	}

	public void lista()
	{
		int i;
		for(i = 0; i < demanda; i ++)
			alumnos[i].estado();
	}


	public void estado()
	{
		int pos;
		int matricula;
		
		ord_MatriculaSeleccion();
		matricula = Lee.enteroMatriculas();
		pos = busquedaBinaria(matricula);
		
		if(pos != alumnos.length)
		{
			alumnos[pos].estado();
		}
		else
		{
			System.out.println("No se ha encontrado la matricula " + matricula);
		}
	}
	
}