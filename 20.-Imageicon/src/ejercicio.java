import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;
public class ejercicio {
	
	public ejercicio() {
		
	}
	
	public void seguridad() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Inicio de sesion.");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelNorte	= new JPanel();
		JPanel panelCentro	= new JPanel();
		JPanel panelOeste 	= new JPanel();
		JLabel etiqueta1 = new JLabel();
		JLabel etiqueta2 = new JLabel();
		JLabel etiqueta3 = new JLabel();
		JPanel pcaja1 = new JPanel();
		JPanel pcaja2 = new JPanel();
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		
		
		panelCentro.setLayout(new GridLayout(3,3));
		panelOeste.setLayout(new GridLayout(1,2));
		
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
		
		URL laurl1 = this.getClass().getResource("Imagenes/usuario.png");
		ImageIcon imageIcon1 = new ImageIcon(laurl1);
		Image image1 = imageIcon1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Escalar la imagen
        ImageIcon scaledIcon1 = new ImageIcon(image1);
		URL laurl2 = this.getClass().getResource("Imagenes/candado.png");
		ImageIcon imageIcon2 = new ImageIcon(laurl2);
		
		
		
		pcaja1.add(caja1);
		pcaja2.add(caja2);
		
		panelNorte.add(etiqueta1);
		panelCentro.add(etiqueta2);
		panelCentro.add(pcaja1);
		panelCentro.add(etiqueta3);
		panelCentro.add(pcaja2);
		panelCentro.add(btn1);
		panelCentro.add(btn2);
		panelOeste.add(new JLabel(imageIcon1));
		panelOeste.add(new JLabel(imageIcon2));
		
		ventana.add(panelNorte, BorderLayout.NORTH);
		ventana.add(panelCentro, BorderLayout.CENTER);
		ventana.add(panelOeste, BorderLayout.WEST);
				
		ventana.pack();
		ventana.setSize(600,300);
		ventana.setLocation(300, 350);
		ventana.setVisible(true);
		
	}

}
