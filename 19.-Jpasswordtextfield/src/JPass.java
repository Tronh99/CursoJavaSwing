import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class JPass {

	public JPass() {
		
	}
	
	public void seguridad() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con caja de texto password");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel pcaja1 = new JPanel();
		JPanel pcaja2 = new JPanel();
		JPanel pcaja3 = new JPanel();
	
		JPasswordField caja1 = new JPasswordField();
		caja1.setText("Caja 1");
		
		JPasswordField caja2 = new JPasswordField();
		caja2.setText("Caja 2");
		
		JPasswordField caja3 = new JPasswordField();
		caja3.setText("Caja 3");
		
		pcaja1.add(caja1);
		pcaja2.add(caja2);
		pcaja3.add(caja3);
		
		ventana.add(pcaja1);
		ventana.add(pcaja2);
		ventana.add(pcaja3);
		
		ventana.pack();
		ventana.setVisible(true);
		
	}
	
}
