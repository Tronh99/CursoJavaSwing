import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class ventanasFlowLayOut {
	
	public ventanasFlowLayOut() {
		
	}
	
	public void layoutFlowLayout() {
		JFrame Ventana = new JFrame();
		Ventana.setTitle("Ventana con FlowLayOut");
		Ventana.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton();
		btn1.setText("Dale Click aquí");
		
		JButton btn2 = new JButton();
		btn2.setText("Dale Click aquí");
		
		JButton btn3 = new JButton();
		btn3.setText("Dale click aquí");
		
		Ventana.add(btn1);
		Ventana.add(btn2);
		Ventana.add(btn3);
		
		Ventana.setSize(200,250|0);
		Ventana.setLocation(700,250);
		Ventana.setVisible(true);
		
	}

}
