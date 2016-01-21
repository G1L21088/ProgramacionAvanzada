
public class Principal
{

	public static void main(String[] args)
	{
		Ganado ganCH = new Ganado();
		Ganado ganSIN = new Ganado();
		
		ganCH.ini_localidad("Chiapas");
		ganCH.compra(100, Ganado.BECERROS);
		ganCH.compra(500, Ganado.LECHERAS);
		ganCH.compra(50, Ganado.TOROS);
		ganCH.estado();
		ganCH.costos();
		ganCH.mayor();

		ganSIN.ini_localidad("Sinaloa");
		ganSIN.compra(200, Ganado.BECERROS);
		ganSIN.compra(300, Ganado.LECHERAS);
		ganSIN.compra(150, Ganado.TOROS);
		ganSIN.estado();
		ganSIN.costos();
		ganSIN.mayor();

		Ganado.totales();
		Ganado.imprimirMayor();
	}

}
