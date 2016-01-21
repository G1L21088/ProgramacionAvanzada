
public class Prueba
{
	public static void main(String[] args)
	{
		LibretaNotas ln = new LibretaNotas();
		
		ln.newNota("msje 1");
		ln.newNota("msje 2");
		ln.newNota("msje 3");
		ln.newNota("msje 4");
		
		System.out.println("Numero de Notas= "+ln.getNumNotas());
		ln.muestraLibreta();
	}
}
