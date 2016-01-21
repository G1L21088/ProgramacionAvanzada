import java.io.BufferedReader;
import java.io.InputStreamReader;

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
			System.out.println("Cadena invalida " + e.getMessage());
		}
		return dato;
	}
	
	public static String cadenaNombre()
	{
		String dato = ("");
		try
		{
			System.out.print("Introduzca el nombre: ");
			InputStreamReader lee = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(lee);
			dato = in.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Cadena invalida " + e.getMessage());
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
			System.out.println("Número invalido " + e.getMessage());
			return -1;
		}
	}
	
	public static int enteroMatriculas()
	{
		try
		{
			System.out.print("Introduzca la matricula: "); 
			return Integer.parseInt(cadena());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Número invalido " + e.getMessage());
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
			System.out.println("Real invalido " + e.getMessage());
			return Float.NaN;
		}
	}
	
}
