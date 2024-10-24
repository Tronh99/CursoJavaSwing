import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ejercicio {
	
	public ejercicio() {
		
	}
	
	public void seguridad() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Inicio de sesion.");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelNorte	= new JPanel();
		JPanel panelCentro	= new JPanel();
		JLabel etiqueta1 = new JLabel();
		JLabel etiqueta2 = new JLabel();
		JLabel etiqueta3 = new JLabel();
		JPanel pcaja1 = new JPanel();
		JPanel pcaja2 = new JPanel();
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		
		
		panelCentro.setLayout(new GridLayout(3,3));
		
		etiqueta1.setText("Inicio de sesion.");
		etiqueta2.setText("Usuario.");
		etiqueta3.setText("Contraseña.");
		
		pcaja1.setLayout(new FlowLayout());
		
		JTextField caja1 = new JTextField();
		caja1.setText("Nombre");
		
		JPasswordField caja2 = new JPasswordField();
		caja2.setText("      ");
		
		btn1.setText("Aceptar");
		btn2.setText("Cancelar");
		
		
		pcaja1.add(caja1);
		pcaja2.add(caja2);
		
		panelNorte.add(etiqueta1);
		panelCentro.add(etiqueta2);
		panelCentro.add(pcaja1);
		panelCentro.add(etiqueta3);
		panelCentro.add(pcaja2);
		panelCentro.add(btn1);
		panelCentro.add(btn2);
		
		
		ventana.add(panelNorte, BorderLayout.NORTH);
		ventana.add(panelCentro, BorderLayout.CENTER);
				
		ventana.pack();
//		ventana.setSize(600,300);
		ventana.setLocation(300, 350);
		ventana.setVisible(true);
		
	}

}
