
public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Listclass arrayl=new Listclass();
		System.out.println();
		arrayl.newfin('a');
		arrayl.newfin(' ');
		arrayl.newfin('s');
		arrayl.newfin(' ');
		arrayl.newfin('e');
		arrayl.newfin(' ');
		arrayl.newfin('f');
		arrayl.newfin(' ');
		arrayl.newfin('b');
		arrayl.newfin(' ');
		arrayl.newfin('a');
		arrayl.estado();
		System.out.println(arrayl.cuentaespacios());
		arrayl.quitarespacios();
		arrayl.estado();
	}

}
