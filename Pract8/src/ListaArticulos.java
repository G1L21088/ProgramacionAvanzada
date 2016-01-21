import java.util.ArrayList;


public class ListaArticulos
{
	private ArrayList <Articulo> L = new ArrayList <Articulo>();

	public void nuevo(int codigo, String nombre, int existencia)
	{
		L.add(new Articulo(codigo, nombre, existencia));
	}
	
	public void muestra()
	{
		int i;
		System.out.println("Codigo\tNombre\t\tExistencia");
		for(i = 0; i < L.size(); i ++)
		{
			System.out.println(L.get(i).getCodigo() + "\t" + 
							L.get(i).getNombre() + "\t" + 
							L.get(i).getExistencia());
		}
	}
	
	public void OrdenarPorClave()
	{
		mergeSort(0, L.size() - 1);
	}
	
	public void OrdenarPorNombre()
	{
		quickSortN(0, L.size() - 1);
	}
	
	public void OrdenarPorExistencia()
	{
		quickSortE(0, L.size() - 1);
	}
	
	private void mergeSort(int ini, int fin)
	{
		int mitad;
		
		if(ini < fin)
		{
			mitad = (int)(ini + fin)/2;
			mergeSort(ini, mitad);
			mergeSort(mitad + 1, fin);
			Intercala(ini, mitad, fin);
		}
	
	}
	
	private void Intercala(int ini, int mitad, int fin)
	{
		int i, j, k, h;
		ArrayList <Articulo> B = new ArrayList <Articulo>();
		
		i = ini;
		j = mitad + 1;
		k = 0;
		
		while(i <= mitad && j <= fin)
		{
			if(L.get(i).getCodigo() <= L.get(j).getCodigo())
			{
				B.add(k, L.get(i));
				i ++;
			}
			else
			{
				B.add(k, L.get(j));
				j ++;
			}
			k ++;
		}
		if(i > mitad)
		{
			for(h = j; h <= fin; h ++)
			{
				B.add(k, L.get(h));
				k ++;
			}
		}
		else
		{
			for(h = i; h <= mitad; h ++)
			{
				B.add(k, L.get(h));
				k ++;
			}
		}
		
		k = 0;
		for(h = ini; h <= fin; h ++)
		{
			L.set(h, B.get(k));
			k ++;
		}
	}
	
	private void quickSortE(int ini, int fin)
	{
		int pos_j;
		
		if(ini < fin)
		{
			pos_j = particionaE(ini, fin);
			quickSortE(ini, pos_j - 1);
			quickSortE(pos_j + 1, fin);
		}
	}
	
	private int particionaE(int ini, int fin)
	{
		int i;
		int j;
		int pivote;
		
		i = ini + 1;
		j = fin;
		pivote = L.get(ini).getExistencia();
		
		while(i <= j)
		{
			while((L.get(i).getExistencia() <= pivote) && (i <= j))
			{
				i ++;
			}
			while(L.get(j).getExistencia() > pivote)
			{
				j --;
			}
			if(i < j)
			{
				intercambia(i, j);
			}
		}
		intercambia(j, ini);		
		return j;
	}
	
	private void intercambia(int a, int b)
	{
		Articulo aux;	
		
		aux = L.get(a);
		L.set(a, L.get(b));
		L.set(b, aux);
	}
	
	
	private void quickSortN(int ini, int fin)
	{
		int pos_j;
		
		if(ini < fin)
		{
			pos_j = particionaN(ini, fin);
			quickSortN(ini, pos_j - 1);
			quickSortN(pos_j + 1, fin);
		}
	}
	
	private int particionaN(int ini, int fin)
	{
		int i;
		int j;
		String pivote;
		
		i = ini + 1;
		j = fin;
		pivote = L.get(ini).getNombre();
		
		while(i <= j)
		{
			while((L.get(i).getNombre().compareTo(pivote) <= pivote.compareTo(L.get(i).getNombre())) && (i <= j))
			{
				i ++;
			}
			while(L.get(j).getNombre().compareTo(pivote) > pivote.compareTo(L.get(j).getNombre()))
			{
				j --;
			}
			if(i < j)
			{
				intercambia(i, j);
			}
		}
		intercambia(j, ini);		
		return j;
	}

}
