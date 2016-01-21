import java.util.*;

public class ListImag
{
	private ArrayList <Imagen> lista;
	private static int i = 0;
	
	public ListImag()
	{
		lista = new ArrayList <Imagen>();
		lista.add(new Imagen("misImagenes/dragon704x528.jpg", 704, 528));
		lista.add(new Imagen("misImagenes/chica720x720.jpg", 720, 720));
		lista.add(new Imagen("misImagenes/gow407x500.jpg", 407, 500));
		lista.add(new Imagen("misImagenes/mob650x365.jpg", 650, 365));
		lista.add(new Imagen("misImagenes/poster400x594.jpg", 400, 594));
	}
		
	public String muestraLista()
	{	
		String s = "";
		for(int j = 0; j < lista.size(); j++)
			s += "Imagen número: " + (j+1) + 
			"\n" + lista.get(j).getName() + 
			"\nDimensiones: " + lista.get(j).getCols() + "x" + lista.get(j).getReng() + "\n";
		return s;
	}

	public String estado()
	{
		return ("Imagen número: " + (i+1) + "\n" + lista.get(i).getName() + 
				"\nDimensiones: " + lista.get(i).getCols() + " x " + lista.get(i).getReng());
	}
	
	public String img_Sgte()
	{
		i = (i + 1)%5;
		return lista.get(i).getName();
	}

	public String img_Prev()
	{
		i = (i - 1 + 5)%5;
		return lista.get(i).getName();
	}
	
	public String img_Actu()
	{
		return lista.get(i).getName();
	}
	
	public int max_ancho()
	{
		int ancho = 0;
		int j = 0;
		while((ancho < lista.get(j).getReng()) && (j < lista.size()))
		{
			ancho = lista.get(j).getReng();
			j ++;
		}
		return ancho;
	}

	public int max_alto()
	{
		int alto = 0;
		int j = 0;
		while((alto < lista.get(j).getReng()) && (j < lista.size()))
		{
			alto = lista.get(j).getReng();
			j ++;
		}
		return alto;
	}
}
