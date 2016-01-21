import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Lee
{
   public static String cadena()
   {
      try
      {
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader in = new BufferedReader(isr);
         return in.readLine();
      }
      catch(IOException e)
      {
          System.err.print("Error: " + e.getMessage ());
		  return "";
      }
   }
   
   public static int entero()
   {
      try
      {
         return Integer.parseInt(cadena ());
      }
      catch(NumberFormatException e)
      {
        System.out.println("Error: "+ e.getMessage());
        throw new NumberFormatException("Entero Invalido");
        //return 0;
      }
   }
   
   public static long entlargo()
   {
      try
      {
         return Long.parseLong(cadena ());
      }
      catch(Exception e)
      {
         System.err.print("Error: " + e.getMessage());
         return 0l;
      }
   }
   public static float real()
   {
      try
      {
         return (new Float(cadena())).floatValue();
      }
      catch(Exception e)
      {
          System.err.print("Error: " + e.getMessage());
         return Float.NaN;
      }
   }
   
   public static double realdoble()
   {
      try
      {
         return(new Double(cadena ())).doubleValue();
      }
      catch(Exception e)
      {
          System.err.print("Error: " + e.getMessage());
         return Double.NaN;
      }
   }
   public static char carac()
   {
	   char c = '\0';
	   try
	   {
		   c= (char)System.in.read();
		   return c;
	   }
	   catch(IOException e) 
	   {
	       System.err.print("Error: " + e.getMessage());
		   return c;
	   }
   }
/*	public static void main(String[] args) {
		int Entero;
		float num;
		String linea;
		
		//linea=cadena();
		num= real();
		System.out.println("num= " + num);
		/*
		try {
		Entero= entero();
		}
		catch (Exception e ){
		  	
		}
		System.out.println("Fin programa");
	}*/
}
