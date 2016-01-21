package juego;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana
{
	private JFrame ventana1;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private ImageIcon icono1;
	private Image imagen1;
	private Toolkit t = Toolkit.getDefaultToolkit();
	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	private JButton boton1;
	private JButton boton2;
	
	public Ventana()
	{
		ventana1 = new JFrame();
		etiqueta1 = new JLabel();
		etiqueta2 = new JLabel();
		icono1 = new ImageIcon();
		boton1 = new JButton();
		ventana();
	}
	
	private JFrame ventana()
	{
		ventana1.setVisible(false);
		ventana1.setSize((d.width/2), (d.height/2) + 40);
		ventana1.setResizable(true);
		ventana1.getContentPane().add(etiqueta1());
		ventana1.getContentPane().add(etiqueta2());
		ventana1.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		ventana1.setTitle("Juego");
		ventana1.getContentPane().setLayout(null);
		ventana1.setLocationRelativeTo(null);
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana1.setVisible(true);
		return ventana1;
	}
	
	private JLabel etiqueta1()
	{
		etiqueta1.setIcon(icono());
		etiqueta1.setLayout(null);
		etiqueta1.setBounds(0, 0, imagen1.getWidth(ventana1), imagen1.getHeight(ventana1));
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setVerticalAlignment(JLabel.CENTER);
		return etiqueta1;
	}
	
	private ImageIcon icono()
	{
		icono1.setImage(imagen("imagenes/peach889x667.jpg"));
		return icono1;
	}
	
	private Image imagen(String name)
	{
		imagen1 = t.getImage(name).getScaledInstance((d.width/2), (d.height/2), Image.SCALE_DEFAULT);
		return imagen1;
	}
	
	private JLabel etiqueta2()
	{
		etiqueta2.setSize((int)d.getWidth()*2, (int)d.getHeight()*2);
		etiqueta2.setLocation(new Point(10, 10));
		etiqueta2.setBackground(Color.BLACK);
		etiqueta2.add(boton1);
		return etiqueta2;
	}

	
	public JButton botonN()
	{		
		boton1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});

		boton1.setText("Nuevo");
		boton1.setSize(100, 100);
		boton1.setFont(new Font("gantz font", Font.PLAIN, 30));
		return boton1;
	}

	public JButton botonP()
	{		
		boton2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});

		boton2.setText("Puntaje");
		boton2.setBounds(57, 85, 100, 50);
		boton2.setFont(new Font("gantz font", Font.PLAIN, 30));
		return boton2;
	}
}
