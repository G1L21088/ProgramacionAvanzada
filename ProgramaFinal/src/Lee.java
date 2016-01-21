import java.io.*;

public class Lee
{
	
	public static String cadena()
	{
		String dato = ("");
		try
		{
			InputStreamReader lee = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(lee);
			dato = in.readLine();
		}
		catch(Exception e)
		{
			System.err.println("Cadena invalida " + e.getMessage());
		}
		return dato;
	}
	
	public static int entero()
	{
		try
		{
			return Integer.parseInt(cadena());
		}
		catch(NumberFormatException e)
		{
			System.err.println("Número invalido " + e.getMessage());
			return -1;
		}
	}

	public static float real()
	{
		try
		{
			return (new Float(cadena()).floatValue());
		}
		catch (Exception e)
		{
			System.err.println("Real invalido " + e.getMessage());
			return Float.NaN;
		}
	}
	
}
