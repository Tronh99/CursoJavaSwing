import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;



public class ventana {
	
	public ventana() {
		
	}

	public void VentanaP() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana principal.");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new BorderLayout());
		
		
		JLabel etiqueta1 = new JLabel();
		JLabel etiqueta2 = new JLabel();
		JLabel etiqueta3 = new JLabel();
		JLabel etiqueta4 = new JLabel();
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		etiqueta1.setText("Nombre");
		etiqueta2.setText("Apellido Paterno");
		etiqueta3.setText("Apellido Materno");
		etiqueta4.setText("Edad");
		
		//Agrega etiquetas al panel
		panel.add(etiqueta1);
		panel.add(etiqueta2);
		panel.add(etiqueta3);
		panel.add(etiqueta4);
		
		
		//Crea el escritorio y la ventana interna
		JDesktopPane escritorio = new JDesktopPane();
		ventanita ventanita = new ventanita();
		escritorio.add(ventanita);
		ventanita.setVisible(true);
		
		ventana.add(panel, BorderLayout.NORTH);
		ventana.add(escritorio, BorderLayout.CENTER);
		
		ventana.setSize(300,300);
		ventana.setVisible(true);
		
		
	}
}
