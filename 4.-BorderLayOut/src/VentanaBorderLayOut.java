import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class VentanaBorderLayOut {
	
	public VentanaBorderLayOut() {
		
	}
	
	public void LayoutBorderLayout() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con BorderLayOut");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Comando para hacer funcionar la "X" de cerrar la ventana.	
		
		JButton btn1 = new JButton();
		btn1.setText("Dale click aquí");
		
		JButton btn2 = new JButton();
		btn2.setText("Dale click aquí");
		
		JButton btn3 = new JButton();
		btn3.setText("Dale click aquí");
	
		JButton btn4 = new JButton();
		btn4.setText("Dale click aquí");
		
		JButton btn5 = new JButton();
		btn5.setText("Dale click aquí");
		
		ventana.add(btn1, BorderLayout.NORTH);
		ventana.add(btn2, BorderLayout.SOUTH);
		ventana.add(btn3, BorderLayout.CENTER);
		ventana.add(btn4, BorderLayout.EAST);
		ventana.add(btn5, BorderLayout.WEST);
		
		ventana.setSize(600,300);					
		ventana.setLocation(300,300);
		ventana.pack();												//.pack es para ajustar la ventana a los botones
		ventana.setVisible(true);
			
		
	}

}
