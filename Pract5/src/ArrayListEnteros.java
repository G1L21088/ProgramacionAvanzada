import java.util.ArrayList;

public class ArrayListEnteros
{
	private ArrayList<Integer> lenteros;
	
	public ArrayListEnteros()
	{
		lenteros = new ArrayList<Integer>();
	}

	public void addOrd(int e)
	{
		if(isEmptyEnteros() != true)
		{
			addOrdenado(e);
		}
		else
		{
			newEntero(e);
		}
	}
	
	public void addOrdenado(int e)
	{
		int i = 0;
		while((i < tamEnteros()) && (posEnteros(i) < e))
		{	
			i ++;
		}
		newEnteroPos(i, e);
	}
	
	public void muestraEnteros()
	{
		for (int i = 0; i < lenteros.size(); i ++)
			System.out.println(lenteros.get(i));
	}
	
	public void newEntero(int e)
	{
		lenteros.add(e);	
	}
	
	public void newEnteroPos(int index, int element)
	{
		lenteros.add(index, element);
	}
	
	public int tamEnteros()
	{
		int i = lenteros.size();
		return i;
	}
	
	public int posEnteros(int index)
	{
		int i =	lenteros.get(index);
		return i;
	}
	
	public void removeIndexEnteros(int index)
	{
		lenteros.remove(index);
	}
	
	public void removeObjectEnteros(int o)
	{
		lenteros.remove(o);
	}
	
	public int indexOfEnteros(int o)
	{
		int i = lenteros.indexOf(o);
		return i;
	}
	
	public void setEnteros(int index, int element)
	{
		lenteros.set(index, element);
	}
	
	public boolean isEmptyEnteros()
	{
		return lenteros.isEmpty();
	}
	
	public void clearEnteros()
	{
		lenteros.clear();
	}
}
