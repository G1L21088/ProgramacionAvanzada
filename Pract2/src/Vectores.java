
public class Vectores
{
	public static  int [] sumaV(int [] V1, int [] V2)
	{
		int [] suma = new int[V1.length];
		int i;
		
		for(i = 0; i < V1.length; i ++)
			suma [i] = V1[i] + V2[i];

		return suma;
	}
	
	public static int prodV(int [] V1, int [] V2)
	{
		int producto = 0;
		int i;
		
		for(i = 0; i < V1.length; i ++)
				producto = producto + (V1[i] * V2[i]);

		return producto;
	}

}
