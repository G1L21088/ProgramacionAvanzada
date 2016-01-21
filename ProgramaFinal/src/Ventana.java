import java.awt.event.*;
import javax.swing.*;

public class Ventana
{
	private JFrame frame;
	private JLabel labelInf;
	private JLabel labelPos;
	private JLabel labelVal;
	private JLabel labelSim;
	private JTextArea tAreaNot;
	private JTextArea tAreaRes;
	private JTextField tFieldPos;
	private JTextField tFieldInf;
	private JTextField tFieldSim;
	private JTextField tFieldVal;
	private JButton buttonInf;
	private JButton buttonPos;
	private JButton buttonAgr;
	private JButton buttonRev;
	private JButton buttonFin;
	private ConvInfPos Obj1;
	private Evaluar Obj2;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnAyuda;
	private JMenuItem mntmVersion;
	private JMenuItem mntmEjemplo;
	private JMenuItem mntmSalir;
	private JMenuItem mntmLimpiarTodo;
	private JSeparator separator1;
	private JSeparator separator2;
	
	public Ventana()
	{
		frame = new JFrame();
		tAreaNot = new JTextArea();
		tAreaRes = new JTextArea();
		labelSim = new JLabel("Simbolo: ");
		labelVal = new JLabel("Valor: ");
		labelInf = new JLabel("Expresión Infija: ");
		labelPos = new JLabel("Expresión Postfija: ");
		tFieldInf = new JTextField();
		tFieldPos = new JTextField();
		tFieldSim = new JTextField();
		tFieldVal = new JTextField();
		buttonInf = new JButton("Convertir");
		buttonPos = new JButton("Evaluar");
		buttonAgr = new JButton("Agregar");
		buttonRev = new JButton("Revisar");
		buttonFin = new JButton("Salir");
		menuBar = new JMenuBar();
		separator1 = new JSeparator();
		separator2 = new JSeparator();
		Obj1 = new ConvInfPos();
		Obj2 = new Evaluar();
		mnArchivo = new JMenu("Archivo");
		mnAyuda = new JMenu("Ayuda");
		mntmLimpiarTodo = new JMenuItem("Limpiar todo");
		mntmSalir = new JMenuItem("Salir");
		mntmVersion = new JMenuItem("Versión");
		mntmEjemplo = new JMenuItem("Ejemplo");
		
		carga_ventana();
		carga_acciones();
	}

	private void carga_ventana()
	{
		frame.setVisible(false);
		frame.setSize(400, 520);
		frame.setTitle("Evaluar Expresiones");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(buttonInf);
		frame.getContentPane().add(buttonPos);
		frame.getContentPane().add(buttonRev);
		frame.getContentPane().add(buttonAgr);
		frame.getContentPane().add(tAreaNot);
		frame.getContentPane().add(labelInf);
		frame.getContentPane().add(labelPos);
		frame.getContentPane().add(labelSim);
		frame.getContentPane().add(labelVal);
		frame.getContentPane().add(tFieldPos);
		frame.getContentPane().add(tFieldInf);
		frame.getContentPane().add(tFieldSim);
		frame.getContentPane().add(tFieldVal);
		frame.getContentPane().add(tAreaRes);
		menuBar.add(mnArchivo);
		menuBar.add(mnAyuda);
		mnArchivo.add(mntmLimpiarTodo);
		mnArchivo.add(separator1);
		mnArchivo.add(mntmSalir);
		mnAyuda.add(mntmEjemplo);
		mnAyuda.add(separator2);
		mnAyuda.add(mntmVersion);
		tAreaNot.setBounds(10, 10, 380, 60);
		tAreaNot.setText("Escribe la expresión infija con espacios entre sus elementos.\nEjemplo:\nCorrecto  ( a + b ) ^ 4\nIncorrecto  (a+b)^4");
		labelSim.setBounds(10, 220, 100, 20);
		labelVal.setBounds(210, 220, 100, 20);
		labelInf.setBounds(10, 80, 140, 20);
		labelPos.setBounds(10, 150, 140, 20);
		tFieldPos.setBounds(160, 150, 200, 20);
		tFieldInf.setBounds(160, 80, 200, 20);
		tFieldSim.setBounds(110, 220, 50, 20);
		tFieldVal.setBounds(310, 220, 50, 20);
		tAreaRes.setBounds(10, 310, 380, 140);
		buttonAgr.setBounds(50, 250 , 100, 30);
		buttonRev.setBounds(250, 250 , 100, 30);
		buttonInf.setBounds(200, 110 , 100, 30);
		buttonPos.setBounds(200, 180, 100, 30);
		buttonFin.setBounds(150, 460, 100, 30);
		frame.setVisible(true);
	}
	
	private void carga_acciones()
	{
		buttonInf.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(tFieldInf.getText().compareTo("") == 0)
					JOptionPane.showMessageDialog(null, "Por favor escriba una expresión Infija", "ERROR", JOptionPane.ERROR_MESSAGE);
				else
				{
					tAreaRes.setText("La expresión infija es: \n   " + tFieldInf.getText() + "\nLa expresión Postfija es: \n   " +
							Obj1.expresion(tFieldInf.getText()));
					tFieldPos.setText(Obj1.expresion(tFieldInf.getText()));					
				}
			}
		});
		
		buttonPos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(tFieldPos.getText().compareTo("") == 0)
					JOptionPane.showMessageDialog(null, "Por favor escriba una expresión Postfija a evaluar", "ERROR", JOptionPane.ERROR_MESSAGE);
				else
				{
					tAreaRes.setText("El resultado de la expresión Postfija:\n" + tFieldPos.getText() +
							"\nes: " + Obj2.evaluacion(tFieldPos.getText()));
					tFieldPos.setText("");
					tFieldInf.setText("");					
				}
			}
		});

		buttonAgr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(tFieldSim.getText().compareTo("") == 0 || tFieldVal.getText().compareTo("") == 0 )
				{
					JOptionPane.showMessageDialog(null, "No hay valores a insertar", "ERROR", JOptionPane.ERROR_MESSAGE);		
				}
				else
				{
					Valores.addDato(tFieldSim.getText(), tFieldVal.getText());
					tFieldSim.setText("");
					tFieldVal.setText("");
				}
			}
		});

		buttonRev.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, Valores.lista(), "Tabla de Valores", JOptionPane.PLAIN_MESSAGE);
			}
		});

		tFieldSim.addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
				if (tFieldSim.getText().length() == 1)
					e.consume();
				char car = e.getKeyChar();
				if((car<'a' || car>'z') && (car<'A' || car>'Z') )
				{
				   e.consume();
				}
			}

			public void keyPressed(KeyEvent arg0)
			{
				// TODO Auto-generated method stub
			}

			public void keyReleased(KeyEvent arg0)
			{
				// TODO Auto-generated method stub
			}
		});
		
		tFieldVal.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char caracter = e.getKeyChar();
				if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE))
				{
					e.consume();
				}
			}
		});
		
		mntmLimpiarTodo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Valores.clean();
				tFieldPos.setText("");
				tFieldInf.setText("");
				tFieldSim.setText("");
				tFieldVal.setText("");
				tAreaRes.setText("");		
			}
		});
		
		mntmSalir.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Gracias por usar mi programa", "Salida", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
			}
		});
				
		mntmVersion.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				JOptionPane.showMessageDialog(null, "Versión 1.4\nPor G1L21088", "Versión", JOptionPane.INFORMATION_MESSAGE);				
			}
		});
		
		mntmEjemplo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				tFieldInf.setText("2 - 1 * ( 3 / 4 + 2 ) - ( 3 * 7 / 5 ) / 2 ^ 3");				
				tFieldPos.setText("2 1 3 4 / 2 + * - 3 7 * 5 / 2 3 ^ / ");				
			}
		});


	}
}
