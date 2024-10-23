import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;


public class Jlabel {

	
	public Jlabel() {
		
	}
	
	public void etiquetas() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con etiqueta");
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel etiqueta1 = new JLabel();
		etiqueta1.setText("Nombre");
		
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setText("Apellido paterno");
		
		JLabel etiqueta3 = new JLabel();
		etiqueta3.setText("Apellido materno");
		
		ventana.add(etiqueta1);
		ventana.add(etiqueta2);
		ventana.add(etiqueta3);
		
		ventana.pack();
		ventana.setVisible(true);
		
	}
}
