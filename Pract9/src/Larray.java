import java.util.*;

public class Larray
{
	ArrayList<Integer> L = new ArrayList<Integer>();
	
	public void add_numbers_Last(int num)// Se insertan num números al final de la lista
	{
		int i;
		for(i = 0; i < num; i ++)
			L.add(i + 1);
	}
	public void add_numbers_First(int num)// Se insertan num números al inicio de la lista
	{
		int i;
		for(i = 0; i < num; i ++)
			L.add(0, (i + 1));
	}
	public void add_numbers_Medium(int num)// Se insertan num números en la posición de en medio de la lista
	{
		int i, p;
		for(i = 0; i < num; i ++)
		{
			p = (int)(L.size())/2;
			L.add(p, (i + 1));
		}
	}
	public void remove_numbers_Last(int num)// Se eliminan num números del final de la lista
	{
		int i;
		for(i = 0; i < num; i ++)
			L.remove(L.size() - 1);
	}
	public void remove_numbers_First(int num)//: Se eliminan num números del inicio de la lista
	{
		int i;
		for(i = 0; i < num; i ++)
			L.remove(0);
	}
	public void remove_numbers_Medium(int num)//: Se eliminan num números de la posición de en medio de la lista
	{
		int i, p;
		for(i = 0; i < num; i ++)
		{
			p = (int)(L.size())/2;
			L.remove(p);
		}
	}

	public void despliega()
	{
		ListIterator<Integer> itr = L.listIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + ", ");
		}
	}

	public void despliegaReversa()
	{
		ListIterator<Integer> itr = L.listIterator(L.size());
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous() + ", ");
		}
	}
}
