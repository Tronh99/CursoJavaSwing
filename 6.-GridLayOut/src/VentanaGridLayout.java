import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class VentanaGridLayout {
	
	public VentanaGridLayout() {
		
	}
	
	public void layoutGridLayout() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con GridLayout");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		JButton btn1 = new JButton();
		btn1.setText("Boton1");
		
		JButton btn2 = new JButton();
		btn2.setText("Boton2");
		
		JButton btn3 = new JButton();
		btn3.setText("Boton2");
		
		JButton btn4 = new JButton();
		btn4.setText("Boton2");
		
		JButton btn5 = new JButton();
		btn5.setText("Boton2");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		ventana.add(panel);
		ventana.setSize(600,300);
		ventana.setLocation(100,100);
		ventana.pack();
		ventana.setVisible(true);
	}

}
