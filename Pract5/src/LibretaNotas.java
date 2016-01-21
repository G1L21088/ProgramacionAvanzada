import java.util.ArrayList;

public class LibretaNotas
{
	private ArrayList<String> lnotas;
	
	public LibretaNotas()
	{
		lnotas = new ArrayList<String>();
	}
	public void newNota (String nota)
	{
		lnotas.add(nota);
	}
	
	public int getNumNotas()
	{
		int i = lnotas.size();
		return i;
	}
	
	public void muestraLibreta()
	{
		for (int i = 0; i < lnotas.size(); i ++)
			System.out.println(lnotas.get(i));
	}
}
