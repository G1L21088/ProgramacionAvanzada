
public class Prueba
{
	public static void main(String[] args)
	{
		Perro fido = new Perro("Fido", "Domestico", "Perro", "croquetas");
		Caballo bob = new Caballo("Bob", "Domestico", "Caballo", "hierba");
		Leon leo = new Leon("Kenya", "Salvaje", "León", "cebras");
		
		System.out.print(fido.nombrePropio + " es un " + fido.nombre + " del tipo Animal " + fido.tipo);
		fido.ladra();
		fido.mueveCola();
		fido.come();
		fido.duerme();
		System.out.println();
		
		System.out.print(bob.nombrePropio + " es un " + bob.nombre + " del tipo Animal " + bob.tipo);
		bob.trota();
		bob.relincha();
		bob.come();
		bob.duerme();
		System.out.println();
		
		System.out.print("El " + leo.nombre + " es un Animal del tipo " + leo.tipo + " de la localidad " + leo.localidad );
		leo.ruge();
		leo.desgarra();
		leo.caza();
		leo.come();
		leo.duerme();
		System.out.println();

	}
}
