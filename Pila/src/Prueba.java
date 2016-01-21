
public class Prueba
{
	private static Pila<String> p;
	
	public static void main(String[] args)
	{
		p = new Pila<String>();
		
		p.pop();
		p.push("Gil");
		System.out.println(p.valor_tope());
		p.push("Ivonne");
		System.out.println(p.valor_tope());
		p.pop();
		System.out.println(p.valor_tope());
		p.haz_nulaP();
		if(p.es_vaciaP())
			System.out.println("Vacia");
		else
			System.out.println("Tiene algo");
		System.out.println(p.valor_tope());

	}
}
