
public class Hanoi
{
	int p = 0;

	public int hanoi(int N, String F, String D, String A)
	{
		p ++;
		if(N==1)
			System.out.println("Mueve de " + F + " a " + D);
		else
		{
			hanoi(N - 1, F, A, D);
			System.out.println("Mueve de " + F + " a " + D);
			hanoi(N - 1, A, D, F);
		}
		return p;
	}
	
	public void pasos_Hanoi(int N)
	{
		String F = "Fuente";
		String D = "Destino";
		String A = "Auxiliar";
		int p = hanoi(N, F, D, A);
		System.out.println("Número total de pasos: " + p + " para " + N + " piezas.");
	}
	
	public static void main(String[] args)
	{
		Hanoi h;
		h = new Hanoi();
		h.pasos_Hanoi(20);
	}
}
