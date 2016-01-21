import java.util.*;

public class Lligada
{
	LinkedList<Integer> L = new LinkedList<Integer>();

	public void add_numbers_Last(int num)// Se insertan num números al final de la lista
	{
		int i;
		for(i = 0; i < num; i ++)
			L.addLast(i + 1);
	}
	public void add_numbers_First(int num)// Se insertan num números al inicio de la lista
	{
		int i;
		for(i = 0; i < num; i ++)
			L.addFirst(i + 1);
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
			L.removeLast();
	}
	public void remove_numbers_First(int num)//: Se eliminan num números del inicio de la lista
	{
		int i;
		for(i = 0; i < num; i ++)
			L.removeFirst();
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
