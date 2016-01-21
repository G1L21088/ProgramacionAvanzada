import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Presentacion
{
	private JFrame ventana;
	private JLabel etiqueta;
	private ImageIcon icono;
	private Image imagen;
	private JButton botonPrevio;
	private JButton botonEstado;
	private JButton botonSiguiente;
	private JButton botonFin;
	private Toolkit t = Toolkit.getDefaultToolkit();
	private ListImag l;
	
	public Presentacion()
	{
		ventana = new JFrame();
		etiqueta = new JLabel();
		icono = new ImageIcon();
		botonPrevio = new JButton("Anterior");
		botonEstado = new JButton("Estado");
		botonSiguiente = new JButton("Siguiente");
		botonFin = new JButton("Salir");
		l = new ListImag();
		
		carga_ventana("misImagenes/dragon704x528.jpg", l.max_alto(), l.max_ancho());

		botonPrevio.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				carga_ventana(l.img_Prev(), l.max_ancho(), l.max_alto());
			}
		});
		
		botonSiguiente.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				carga_ventana(l.img_Sgte(), l.max_ancho(), l.max_alto());
			}
		});

		botonFin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, l.muestraLista(), "Lista", JOptionPane.PLAIN_MESSAGE);
				ventana.dispose();
			}
		});

		botonEstado.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, l.estado(), "Estado", 1);
			}
		});
	}

	private void carga_ventana(String name, int alto, int ancho)
	{
		ventana.setVisible(false);
		ventana.setSize(ancho + 100, alto + 20);
		ventana.setResizable(false);
		ventana.setTitle(name);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		ventana.getContentPane().add(botonPrevio);
		ventana.getContentPane().add(botonSiguiente);
		ventana.getContentPane().add(botonEstado);
		ventana.getContentPane().add(botonFin);
		ventana.getContentPane().add(etiqueta);
		imagen = etiq(name);
		icono.setImage(imagen);
		etiqueta.setIcon(icono);
		etiqueta.setBounds(0, 0, ancho, alto);
		etiqueta.setHorizontalAlignment(JLabel.CENTER);
		etiqueta.setVerticalAlignment(JLabel.CENTER);
    	botonPrevio.setBounds(ancho, 0 , 100,((int)(alto/4)));
		botonPrevio.setFont(new Font("Meera", Font.BOLD, 12));
    	botonEstado.setBounds(ancho, ((int)(alto/4)), 100, ((int)(alto/4)));
		botonEstado.setFont(new Font("Meera", Font.BOLD, 12));
		botonSiguiente.setBounds(ancho, ((int)(alto/4) * 2), 100, ((int)(alto/4)));
		botonSiguiente.setFont(new Font("Meera", Font.BOLD, 12));
		botonFin.setBounds(ancho, ((int)(alto/4) * 3), 100, ((int)(alto/4)));
		botonFin.setFont(new Font("Meera", Font.BOLD, 12));
		ventana.setVisible(true);
	}
	
	private Image etiq(String name)
	{
		return t.getImage(name);
	}
}
