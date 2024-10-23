import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ejercicio {
	
	public ejercicio() {
		
	}
	
	public void dialogo2Botones() {
		new JOptionPane();
		int boton02 = JOptionPane.showConfirmDialog(new JFrame(), "Segundo evento con JOptionFrame", "Terecer evento mas opciones", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
	}
	
	public void seguridad() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Inicio de sesion.");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel pcaja1 = new JPanel();
		JPanel pcaja2 = new JPanel();
		
		pcaja1.setLayout(new FlowLayout());
		
		JTextField caja1 = new JTextField();
		caja1.setText("Nombre");
		
		JPasswordField caja2 = new JPasswordField();
		caja2.setText("Contraseña");
		
		
		pcaja1.add(caja1);
		pcaja2.add(caja2);
		
		ventana.add(pcaja1);
		ventana.add(pcaja2);
		
		
		ventana.pack();
		ventana.setVisible(true);
		
	}

}
