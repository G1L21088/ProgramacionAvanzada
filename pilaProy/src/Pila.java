import java.util.ArrayList;

public class Pila<Tipo> implements Stack<Tipo>
{
    private ArrayList<Tipo> pila= new ArrayList<Tipo>();

	public void push(Tipo elem)
	{
		pila.add(elem);
	}

	public void pop()
	{
		if(!pila.isEmpty())
			pila.remove(pila.size() - 1);
		else
			System.out.println("La pila esta vacia");
	}

	public void hazNulaP() 
	{
		pila.clear();
	}

	public Tipo valorTope()
	{
		if(pila.isEmpty())
		{
			System.out.println("La pila esta vacia");
			return null;
		}
		else
			return pila.get(pila.size() - 1);
	}

	public boolean esVaciaP() 
	{
		return pila.isEmpty();
	}
}
