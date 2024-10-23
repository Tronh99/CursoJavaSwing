import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class JPANEL {
	
	public JPANEL() {
		
	}
	
	public void panel() {
		
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con BorderLayOut");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelNorte	= new JPanel();
		JPanel panelSur		= new JPanel();
		JPanel panelCentro	= new JPanel();
		JPanel panelEste	= new JPanel();
		JPanel panelOeste	= new JPanel();
		
		JButton btn1 = new JButton();
		btn1.setText("Dale click al boton1");
		
		JButton btn2 = new JButton();
		btn2.setText("Dale click al boton2");
		
		JButton btn3 = new JButton();
		btn3.setText("Dale click al boton3");
		
		JButton btn4 = new JButton();
		btn4.setText("Dale click al boton4");
		
		JButton btn5 = new JButton();
		btn5.setText("Dale chicl al boton5");
		
		panelNorte.add(btn1);
		panelSur.add(btn2);
		panelCentro.add(btn3);
		panelEste.add(btn4);
		panelOeste.add(btn5);
		
		ventana.add(panelNorte, BorderLayout.NORTH);
		ventana.add(panelSur, BorderLayout.SOUTH);
		ventana.add(panelCentro, BorderLayout.CENTER);
		ventana.add(panelEste, BorderLayout.EAST);
		ventana.add(panelOeste, BorderLayout.WEST);
		
		ventana.setSize(600,300);
		ventana.setLocation(300,300);
		ventana.pack();
		ventana.setVisible(true);
	}

}