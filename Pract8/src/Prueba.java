
public class Prueba
{
	public static void main(String[] args)
	{
		ListaArticulos L;
		L = new ListaArticulos();
		int i;
		int codigo;
		String nom_base;
		int existencia;
		
		
		for(i = 0;i < 16; i ++)
		{
			 nom_base = "Articulo " + ((int)(Math.random()*100));
			 codigo = (int)(Math.random()*50);
			 existencia = ((int)(Math.random()*80))+20;
			 L.nuevo(codigo,nom_base,existencia);
		}

		L.muestra();
		L.OrdenarPorClave();
		L.muestra();
		L.OrdenarPorNombre();
		L.muestra();
		L.OrdenarPorExistencia();
		L.muestra();
	}
}
