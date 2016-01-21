import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AbreVentana
{
    private JFrame ventana;
    private JLabel etiqueta;
    private ImageIcon icono;
    private Image imagen;
    private Toolkit t = Toolkit.getDefaultToolkit();
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    public AbreVentana()
    {
    	//Creo la ventana (el Frame)
    	ventana = new JFrame();       
    	//creo una etiqueta para poner la imagen
    	etiqueta = new JLabel();
    	//digo en cuantos renglones y columnas se organiza mi ventana
		ventana.setLayout(new GridLayout(2,1));
    	//Creo la clase que mantiene la imagen
    	icono = new ImageIcon();
    	//Creo el boton
    	boton1 = new JButton("No.1");
    	boton2 = new JButton("No.2");
    	boton3 = new JButton("No.3");
    	boton4 = new JButton("Fin");
    	
    	carga_img("misImagenes/imagen400x400.jpg",525,400);

    	boton1.addActionListener(new ActionListener()
    	{
			public void actionPerformed(ActionEvent evento)
			{
		    	carga_img("misImagenes/imagen400x400.jpg",525,400);				
			}
		});
    	
    	boton2.addActionListener(new ActionListener()
    	{
			public void actionPerformed(ActionEvent evento)
			{
		    	carga_img("misImagenes/flor400x300.jpg",525,400);				
			}
		});
    	
    	boton3.addActionListener(new ActionListener()
    	{
			public void actionPerformed(ActionEvent evento)
			{
		    	carga_img("misImagenes/Jpg519x391.jpg",525,400);				
			}
		});
    	boton4.addActionListener(new ActionListener()
    	{
			public void actionPerformed(ActionEvent evento)
			{
		    	ventana.dispose();				
			}
		});
    }
    
    public void carga_img(String name,int cols,int rengs)
    {
 	    	
	    	ventana.setVisible(false);
//----	    	
	    	//Defino tamaño de la ventana que mantiene la imagen y los botones
	    	ventana.setSize(cols,rengs + 80);
 
	    	imagen = null;
	    	//Inicializo la imagen que se va a cargar
	        imagen = t.getImage (name);
	    	icono.setImage(imagen);

	    	//Creo la etiqueta con la imagen
	    	etiqueta.setIcon(icono);
	    	//Defino posición de inicio y el tamano de la etiqueta, ancho y alto
	    	etiqueta.setBounds(0,0, cols, rengs);
	    	etiqueta.setHorizontalAlignment(JLabel.CENTER);
	    	etiqueta.setVerticalAlignment(JLabel.CENTER);
	    	
	    	//Defino posición de inicio y el tamano del botón1, ancho y alto
	    	boton1.setBounds(0, rengs, (int)(cols/4),50);
	    	boton2.setBounds((int)(cols/4), rengs, (int)(cols/4),50);
	    	boton3.setBounds(((int)(cols/4) * 2), rengs, (int)(cols/4),50);
	    	boton4.setBounds(((int)(cols/4) * 3), rengs, (int)(cols/4),50);
	    	
//-------	    	
	    	//Indico yo administrare como se insertan los componentes en la ventana (null)
	    	ventana.getContentPane().setLayout(null);

			//Agrego mi etiqueta y los botones
	    	ventana.getContentPane().add(etiqueta);
	    	ventana.getContentPane().add(boton1);
	    	ventana.getContentPane().add(boton2);
	    	ventana.getContentPane().add(boton3);
	    	ventana.getContentPane().add(boton4);

	    	//Muestro la ventana
	    	ventana.setVisible(true);
	    }
}
