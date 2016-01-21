import java.util.ArrayList;

public class ListaRec
{
	ArrayList<Integer> L;

	public ListaRec()
	{
		L = new ArrayList<Integer>();
		int i;
		for(i = 0; i < 20; i ++)
			L.add((int)(i));
			//L.add((int)(Math.random() * 10));
	}
	public void despliega_rec(int i)
	{
		if(i < L.size())
		{
			System.out.print(" " + L.get(i));
			despliega_rec(i + 1);
		}
	}
	
	public void despliega_rec_invertido(int i)
	{
		if(i < L.size())
		{
			despliega_rec_invertido(i + 1);
			System.out.print(" " + L.get(i));
		}
	}

	public int suma_rec(int i)
	{	
		int j;
		if(i < L.size())
		{
			j = suma_rec(i + 1);
			j = j + L.get(i);
		}
		else
			j = 0;
		return j;
	}
	

	public static void main(String[] args)
	{
		ListaRec r;
		r = new ListaRec();
		int res;
		
		r.despliega_rec(0);
		System.out.println();
		r.despliega_rec_invertido(0);
		System.out.println();
		res = r.suma_rec(0);
		System.out.println("La suma del arreglo es: " + res);
	}
}
