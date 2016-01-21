package juego;

import javax.swing.JOptionPane;

public class Puntaje
{
	private static int puntaje;
	
	public Puntaje()
	{
		puntaje = 0;
	}
	
	public void correcto()
	{
		puntaje ++;
		JOptionPane.showMessageDialog(null, "Correcto", "", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void erroneo()
	{
		puntaje --;
		JOptionPane.showMessageDialog(null, "Incorrecto", "", JOptionPane.ERROR_MESSAGE);
	}
	
	public int get_Puntaje()
	{
		return puntaje;
	}

}
