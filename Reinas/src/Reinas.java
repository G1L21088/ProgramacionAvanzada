public class Reinas
{
	private int [][] tablero;
	private int columnas;
	private int renglones;

	public Reinas(int x)
	{
		int i, j;
		columnas = x;
		renglones = x;
		tablero = new int [columnas][renglones];
		
		for(i = 0; i < columnas; i ++)
			for(j = 0; j < renglones; j ++)
				tablero [i][j] = 0;
	}

	public boolean backTrack(int numreina)
	{
		int opc = 1;
		boolean exito = false;
		
		do
		{
			if(!es_comida(opc - 1, numreina - 1))
			{
				tablero [opc - 1][numreina - 1] = numreina;
				if(numreina == renglones)
				{
					exito = true;
					muestra_Tablero();
				}
				else
				{
					exito = backTrack(numreina + 1);
					if(exito == false)
					{
						tablero[opc - 1][numreina - 1] = 0;
					}
				}
			}
			opc ++;	
		}
		while((opc <= columnas) && (exito == false));
		return exito;
	}

	private boolean es_comida(int col, int reng)
	{
		boolean bnd = false;
		int i, j;
		
		for(i = reng - 1; (i >= 0) && (bnd == false); i --)
		{
			if(tablero[col][i] != 0)
				bnd =true;
		}
		
		if(bnd == false)
		{
			j = col + 1;
			for(i = reng - 1; (i >= 0) && (bnd == false) && ( j < columnas); i--)
			{
				if(tablero[j][i] != 0)
					bnd = true;
				j ++;
			}
		}

		if(bnd == false)
		{
			j = col - 1;
			for(i = reng - 1; (i >= 0) && (bnd == false) && ( j >= 0); i--)
			{
				if(tablero[j][i] != 0)
					bnd = true;
				j --;
			}
		}
		return bnd;
	}
		
	private void muestra_Tablero()
	{
		int i, j;
		for(i = 0; i < columnas; i ++)
		{
			System.out.println();
			for(j = 0; j < renglones; j ++)
			{
				System.out.print(tablero [j][i] + " | ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Reinas r;
		
		r = new Reinas(4);
		if(!r.backTrack(1))
		{
			System.out.println("NO TIENE SOLUCIÓN");
		}
	}

}
