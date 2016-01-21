import java.util.*;

public class Prueba
{
	public static void main(String[] args)
	{
		String expresion;  //para capturar de teclado la expresion en infija
		StringTokenizer st;  //para separar los tokens que hay en la expresion dada
		LinkedList<String> L = new LinkedList<String>(); //se guardan aqui los tokens obtenidos
		ConvInfijaPosfija Obj = new ConvInfijaPosfija(); //objeto para convertir de infija a posfija
		
		System.out.println("Escribe una expresion en infija separando cada token con espacio: ");
		//expresion = Lee.cadena();
		expresion = "( a + b * c ) ^ ( 2 + 3 )";
		//expresion = "( ( x ^ z ) / ( 2 * 3 ) ) ^ 3";
		//expresion = "( x * y ) + z * ( ( ( s - k ) ^ 9 ) / ( h / 2 ) )";
		System.out.println("Expresion dada: " + expresion);

		st = new StringTokenizer(expresion);
		
		while(st.hasMoreTokens())
		{
		   L.add(st.nextToken()); //se obtienen los tokens y se insertan en la lista ligada
		   System.out.println("Token: " + L.get(L.size()-1));
		}
		Obj.convierte(L); // se invoca al convertidor, por ahora no devuleve nada, solo despliega el resultado
	}
}
