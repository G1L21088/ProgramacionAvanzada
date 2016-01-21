import java.util.ArrayList;

public class Pila<tipo> implements Stack<tipo>
{
	private ArrayList<tipo> L = new ArrayList<tipo>();
	
	public void haz_nulaP()//deja la pila sin elementos
	{
		L.clear();
	}

	public boolean es_vaciaP()//devuelve true si es vacia o false en caso contrario
	{
		return L.isEmpty();
	}

	public void push(tipo elem)//inserta un elemento en el tope de la pila
	{
		L.add(elem);
	}

	public void pop()//elimina el elemento del tope
	{
		if(!L.isEmpty())
			L.remove(L.size() - 1);
		else
			System.out.println("La pila esta vacia");
	}

	public tipo valor_tope()//devuelve una copia del elemento del tope
	{
		if(L.isEmpty())
		{
			System.out.println("La pila esta vacia");
			return null;
		}
		else
			return L.get(L.size() - 1);
	}
}
