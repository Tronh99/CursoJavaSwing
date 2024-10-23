import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class DemoVentana {
	
	public DemoVentana() {
		
	}
	
	public void pintaJFrame() {
		JFrame Ventana = new JFrame();
		Ventana.setTitle("Primer ventana swing");
		Ventana.setLayout(new FlowLayout());
		
		JButton btn = new JButton();
		btn.setText("Da Click aquí");
		Ventana.add(btn);
		
		JButton btn2 = new JButton();
		btn2.setText("Dale Click aquí");
		Ventana.add(btn2);
		
		JButton btn3 = new JButton();
		btn3.setText("Dale Click aquí");
		Ventana.add(btn3);
		Ventana.setSize(300,300);
		Ventana.setLocation(100,100);
		Ventana.setVisible(true);
	}

}
