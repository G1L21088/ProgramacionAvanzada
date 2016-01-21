
public class Directorio
{
	private Contacto[] lista;
	private int ultimoc; //posición del sigte contacto a insertar
	
	public Directorio (int max)
	{
		int i;
		lista = new Contacto [max];
		for (i=0; i < max; i ++)
			lista [i] = new Contacto ();
		ultimoc = 0;
	}
	
	public void nuevo (String name, String apellido, String tel)
	{
		if (ultimoc < lista.length)
		{
			lista [ultimoc].set_nombre (name);
		    lista [ultimoc].set_apellido (apellido);
		    lista [ultimoc].set_telef (tel);
		    ultimoc ++;
		}else 
			System.out.println("No hay espacio en la agenda, no se pudo insertar a " + name + " " + apellido);
	}

	public void listado (String msje)
	{
		int i;
		System.out.println(msje);
		for (i=0; i < ultimoc; i ++)
			lista [i].estado ();
        System.out.println("");
	}

	public void ordenaNombre ()
	{
		int pos;
		int name_pos;
		String name_completo1;
		String name_completo2;
		
		for (pos = 0; pos < ultimoc - 1; pos ++)
		{
			name_completo1 = lista [pos].get_nombre() + lista [pos].get_nombre();
			name_pos = pos;
			
			for (int i = pos + 1; i < ultimoc; i ++)
			{
				name_completo2 = lista [i].get_nombre() + lista [i].get_nombre();
				if (name_completo2.compareTo(name_completo1) < 0)
				{
					name_completo1 = name_completo2;
					name_pos = i;
					
				}
				intercambiaNombre (name_pos, pos);
			}
		}
	}
	
	public void intercambiaNombre (int i, int j)
	{
		Contacto aux;
		
		aux = lista [i];
		lista [i] = lista [j];
		lista [j] = aux;
	}

	public int BusquedaBinaria (String name, String apellido)
	{
		ordenaNombre();
		int ini = 0;
		int fin = ultimoc;
		int mitad = (int) (ini + fin)/2;
		String name_completo;
		name_completo = new String (name + apellido);
		
		while ((ini <= fin) && (name_completo.compareTo(lista [mitad].get_nombre() + lista [mitad].get_apellido()) != 0))
		{
			if (name_completo.compareTo(lista[mitad].get_nombre() + lista[mitad].get_apellido()) < 0)
				fin = mitad - 1;
			else
				ini = mitad + 1;
			mitad = (int) (ini + fin)/2;
		}
		
		if (ini > fin)
			return ultimoc;
		else
			return mitad;
	}

	public String telefono (String name, String apellido)
	{
		int i;
		i = BusquedaBinaria(name, apellido);
		return lista[i].get_telef();
	}
	
}
