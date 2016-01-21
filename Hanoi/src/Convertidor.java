import java.util.ArrayList;

public class Convertidor
{
	ArrayList<Character> L;
	{
		L = new ArrayList<Character>();
		L.add('0');
		L.add('1');
		L.add('2');
		L.add('3');
		L.add('4');
		L.add('5');
		L.add('6');
		L.add('7');
		L.add('8');
		L.add('9');
		L.add('A');
		L.add('B');
		L.add('C');
		L.add('D');
		L.add('E');
		L.add('F');
	}
	
	public void decimal_N_ario(int N, int base)
	{
		
		if(N < base)
			System.out.print(" " + L.get(N));
		else
		{
			int residuo = N % base;
			decimal_N_ario((int)(N/base), base);
			System.out.print(" " + L.get(residuo));
		}
	}
	
	public static void main(String[] args)
	{
		Convertidor c;
		c = new Convertidor();
		c.decimal_N_ario(256, 2);
		System.out.println("");
		c.decimal_N_ario(256, 8);
		System.out.println("");
		c.decimal_N_ario(256, 16);
		System.out.println("");
		c.decimal_N_ario(256, 12);
	}
}
