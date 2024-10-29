import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class VentanaComboBox {
	
	public VentanaComboBox() {
		
	}
	
	public void listaDesplegable() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con JComboBox");
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.X_AXIS));
		
		String [] sabores = {"chocolate", "fres" , "frambueza", "vainilla"};
		JComboBox<String> combo = new JComboBox<String> (sabores);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Elije sabor");
		
		panel.add(label);
		panel.add(combo);
		
		ventana.add(panel);
		ventana.pack();
		ventana.setVisible(true);
		
		
	}

}
