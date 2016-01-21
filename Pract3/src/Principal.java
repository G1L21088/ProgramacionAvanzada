import java.util.*;

public class Principal
{
	public static int menu_principal()
	{
		int opcion = 0;// vriable para leer la opcion
		@SuppressWarnings("resource")
		Scanner ingresar = new Scanner(System.in); //variable para lectura
		while ((opcion <= 0) || (opcion > 4))
		{
			System.out.println("Elige una opcion");
			System.out.println("1> Nuevo Contacto");
			System.out.println("2> Listado");
			System.out.println("3> Telefono");
			System.out.println("4> Salir");
			opcion = ingresar.nextInt();
		}
		return opcion;
	}
	
	public static void main (String[] args)
	{
		Directorio dir2013;
		int opc = -1;
		dir2013 = new Directorio(7);

		dir2013.nuevo("Pedro Antonio","Salazar Lopez","12345678");
		dir2013.nuevo("Lolita","Ayala Lopez","11223344");
		dir2013.nuevo("Alberto","Perez Prado","55667788");
		dir2013.nuevo("Diana","Alvarado Balbuena","44556677");
		dir2013.nuevo("Mariana","Torres Paredes","22334455");
		dir2013.nuevo("Roberto","Muñoz Laguna","33445566");
		dir2013.nuevo("Carlos","Alvarado Balbuena","44556677");
		dir2013.nuevo("José Alberto","Comodoro Robles","66778899");
        dir2013.listado("Lista inicial:  ");

        dir2013.ordenaNombre();
        dir2013.listado("Lista ordenada: ");
        System.out.println("El teléfono de Mariana Torres Paredes es " + dir2013.telefono("Mariana", "Torres Paredes"));

		try
		{
			opc = menu_principal(); //sección protegida
		}
		catch (InputMismatchException e)
		{
			System.out.println("opcion invalida");
		}
		switch(opc)
		{
		case 1:
			System.out.println("Agregar Nuevo Contacto");
			main(args);
			break;
		case 2:
			System.out.println("Listar Contactos");
			main(args);
			break;
		case 3:
			System.out.println("Obtener Teléfono ");
			main(args);
			break;
		case 4:
			System.out.println("FIN DE PROGRAMA :(");
			break;
		default:
			main(args);
			break;
		}
	}
}
