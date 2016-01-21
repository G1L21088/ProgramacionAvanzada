
public class Principal
{
	public static void main(String[] args)
	{
		int i;
		ArrayListEnteros ln = new ArrayListEnteros();
		for(i = 0; i < 15; i ++)
			ln.addOrd((int)(Math.random()*100));		
		
		System.out.println("Total de Números: "+ln.tamEnteros());
		ln.muestraEnteros();
	}
}
