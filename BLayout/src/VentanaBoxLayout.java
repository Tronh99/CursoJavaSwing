import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;


public class VentanaBoxLayout {
	
	public VentanaBoxLayout() {
			
		}
	
	public void layoutBoxLayout() {
		JFrame ventana = new JFrame();
		
		JPanel panel = new JPanel();
		ventana.setTitle("Ventana con BoxLayout");
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JButton btn1 = new JButton();
		btn1.setText("Click aquí");
		
		JButton btn2 = new JButton();
		btn2.setText("Click aquí");
		
		JButton btn3 = new JButton();
		btn3.setText("Click aquí");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		ventana.add(panel);
		ventana.setSize(600,300);
		ventana.setLocation(250,250);
		ventana.setVisible(true);
			
	}

}
