import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class CajasTexto {

	CajasTexto() {
		
	}
	
	public void cajas() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con etiqueta");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		
		JPanel pcaja1 = new JPanel();
		JPanel pcaja2 = new JPanel();
		JPanel pcaja3 = new JPanel();
		JPanel pcaja4 = new JPanel();
		
		pcaja1.setLayout(new FlowLayout());
		pcaja2.setLayout(new FlowLayout());
		pcaja3.setLayout(new FlowLayout());
		pcaja4.setLayout(new FlowLayout());
		
		
		JTextField c1 = new JTextField();
		//c1.setColumns(20);
		c1.setText("Hello");
		
		JTextField c2= new JTextField();
		//c2.setColumns(20);
		c2.setText("Hello");
		
		JTextField c3 = new JTextField();
		//c3.setColumns(20);
		c3.setText("Hello");
		
		JTextField c4 = new JTextField();
		//c4.setColumns(20);
		c4.setText("Hello");
		
		pcaja1.add(c1);
		pcaja2.add(c2);
		pcaja3.add(c3);
		pcaja4.add(c4);
		
		ventana.add(pcaja1);
        ventana.add(pcaja2);
        ventana.add(pcaja3);
        ventana.add(pcaja4);
		
		ventana.pack();
		ventana.setVisible(true);
		
			
	
	}
	
}
