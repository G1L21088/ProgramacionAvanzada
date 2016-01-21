
public class THanoi
{
	public static void main(String[] args)
	{
		
	}
	
	public void Hanoi(int N, String Fuente, String Destino, String Auxuliar)
	{
		if(N==1)
			System.out.println("Mueve de " + Fuente + " a " + Destino);
		else
		{
			Hanoi(N - 1, Fuente, Auxuliar, Destino);
			System.out.println("Mueve de " + Fuente + " a " + Destino);
			Hanoi(N - 1, Auxuliar, Destino, Fuente);
		}
	}
}
