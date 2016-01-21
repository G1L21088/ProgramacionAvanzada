package juego;

import java.awt.EventQueue;

public class Juego
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					new Ventana();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
