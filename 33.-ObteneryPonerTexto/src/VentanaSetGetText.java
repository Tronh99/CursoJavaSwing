import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaSetGetText implements ActionListener{
	
	JFrame ventana;
	JTextField caja1;
	JTextField caja2;
	JButton botonPoner;
	JButton botonObtener;
	
	String mensaje;
	
	public VentanaSetGetText() {
		
	}
	
	public void getsetTexto() {
//		Porpiedades de la ventana
		ventana = new JFrame();
		ventana.setLayout(new GridLayout(3,1));
		ventana.setTitle("Ventana con ActionListener");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		caja1 = new JTextField();
		caja2 = new JTextField();
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		
		JPanel panelObtener = new JPanel();
		panelObtener.setLayout(new FlowLayout());
		
		JPanel panelPoner = new JPanel();
		panelPoner.setLayout(new FlowLayout());
		
		JLabel ObtnerTexto = new JLabel("Obtner Texto");
		JLabel PonerTexto = new JLabel("Poner Texto");
		
		botonPoner = new JButton("Poner");
		botonObtener = new JButton("Obtner");
		caja1 = new JTextField();
		caja2 = new JTextField();
		
//		Asignamos un ancho de 20 a cada caja de texto
		caja1.setColumns(20);
		caja2.setColumns(20);
		
//		Agregamos el Listener al boton
		botonPoner.addActionListener(this);
		botonObtener.addActionListener(this);
		
//		Deshabilitar el boton ´Boton poner´
		botonPoner.setEnabled(false);
		
		panelBotones.add(botonPoner);
		panelBotones.add(botonObtener);
		
		panelObtener.add(ObtnerTexto);
		panelObtener.add(caja2);
		
		panelPoner.add(PonerTexto);
		panelPoner.add(caja1);
		
//		Agrego los paneles a la ventana Principal
		ventana.add(panelBotones);
		ventana.add(panelObtener);
		ventana.add(panelPoner);
		ventana.setSize(300,300);
		ventana.setLocation(300,300);
		ventana.pack();
		ventana.setVisible(true);
	}	
		public void actionPerformed(ActionEvent evt) {
			JButton boton = (JButton)evt.getSource();
			if(boton == botonPoner) {
				caja1.setText(mensaje);
			}else if(boton == botonObtener) {
//				Obtengo el bontenido de la caja de texto y lo asigno a la variable mensaje
				mensaje = caja2.getText();
//				Habilito el boton ´botnPoner´
				JOptionPane.showMessageDialog(ventana, mensaje);
			}
		}

}

