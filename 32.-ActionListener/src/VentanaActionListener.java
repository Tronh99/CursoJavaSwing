import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaActionListener implements ActionListener{
	
	JFrame ventana;
	private JButton boton;

	public VentanaActionListener() {
		
	}
	
	public void accionesBotones() {
		ventana = new JFrame();
		ventana.setLayout(new FlowLayout());
		ventana.setTitle("Ventana con AccionListener");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton boton = new JButton("Click");
//		Agregamos el Escuchador al boton
		
		boton.addActionListener(this);
		ventana.add(boton);
		ventana.setSize(300,300);
		ventana.setLocation(300,300);
		ventana.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent evt) {
		boton = (JButton) evt.getSource();
		if(boton == boton) {
			JOptionPane.showMessageDialog(ventana, "mensaje");
		}
	}
}
