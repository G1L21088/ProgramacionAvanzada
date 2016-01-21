import java.util.ArrayList;

public class Valores
{
	public static ArrayList<Valor> valores;
	
	public Valores()
	{
		valores = new ArrayList<Valor>();
	}
	
	public static void addDato(String simb, String valor)
	{
		if(valores.isEmpty())
			valores.add(new Valor(simb, valor));
		else
		{
			if(existeDato(simb))
			{
				valores.remove(getPos(simb));
				valores.add(new Valor(simb, valor));
			}
			else
			{
				valores.add(new Valor(simb, valor));
			}
		}
	}

	public static int getPos(String simb)
	{
		int i = 0;
		while(simb.compareTo(valores.get(i).getSimb()) != 0)
		{
			i ++;
		}
		return i;
	}

	public static boolean existeDato(String simb)
	{
		boolean r = true;
		int i;
		for(i = 0; i < valores.size(); i ++)
		{
			if(simb.compareTo(valores.get(i).getSimb()) == 0)
			{
				r = true;
			}
			else
			{
				r = false;
			}
		}
		return r;
		
	}
	
	public static String lista()
	{
		String s = "", t = "", r = "";
		int i;
		if(valores.isEmpty())
		{
			s = "No hay valores";
		}
		else
		{
			s = "Los valores guardados son:\n";
			for(i = 0; i < valores.size(); i ++)
			{
				   t += (valores.get(i).getSimb() + " = " + valores.get(i).getValor() + "\n");
			}
			
		}
		r = s + t;
		return r;
	}
	
	public static void clean()
	{
		valores.clear();
	}
}
