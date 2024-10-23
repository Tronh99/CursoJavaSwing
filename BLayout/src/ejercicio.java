import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ejercicio {
	
	public ejercicio() {
		
	}
	
		public void BoxGridLayout() {
	
	JFrame ventana = new JFrame();
	ventana.setTitle("GRID-BORDER-LAYOUT");
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panelNorte	= new JPanel();
	JPanel panelSur		= new JPanel();
	JPanel panelCentro	= new JPanel();
	JPanel panelEste	= new JPanel();
	JPanel panelOeste	= new JPanel();
	
	panelCentro.setLayout(new GridLayout(3,2));
	
	JButton btn1 = new JButton();
	btn1.setText("Boton Norte 1");

	JButton btn2 = new JButton();
	btn2.setText("Boton Norte 2");
	
	JButton btn3 = new JButton();
	btn3.setText("Boton Norte 3");
	
	JButton btn4 = new JButton();
	btn4.setText("Boton Sur 1");
	
	JButton btn5 = new JButton();
	btn5.setText("Boton Sur 2");
	
	JButton btn6 = new JButton();
	btn6.setText("Boton Sur 3");
	
	JButton btn7 = new JButton();
	btn7.setText("Boton Sur 4");
	
	JButton btnc1 = new JButton();
	btnc1.setText("Boton1");
	
	JButton btnc2 = new JButton();
	btnc2.setText("Boton2");
	
	JButton btnc3 = new JButton();
	btnc3.setText("Boton2");
	
	JButton btnc4 = new JButton();
	btnc4.setText("Boton2");
	
	JButton btnc5 = new JButton();
	btnc5.setText("Boton2");
	
	JButton btn9 = new JButton();
	btn9.setText("Boton Este 1");
	
	JButton btn10 = new JButton();
	btn10.setText("Boton Oeste 1");
	
	
	panelNorte.add(btn1);
	panelNorte.add(btn2);
	panelNorte.add(btn3);
	
	panelSur.add(btn4);
	panelSur.add(btn5);
	panelSur.add(btn6);
	panelSur.add(btn7);
	
	panelCentro.add(btnc1);
	panelCentro.add(btnc2);
	panelCentro.add(btnc3);
	panelCentro.add(btnc4);
	panelCentro.add(btnc5);
	
	panelEste.add(btn9);
	
	panelOeste.add(btn10);
	
	ventana.add(panelNorte, BorderLayout.NORTH);
	ventana.add(panelSur, BorderLayout.SOUTH);
	ventana.add(panelCentro, BorderLayout.CENTER);
	ventana.add(panelEste, BorderLayout.EAST);
	ventana.add(panelOeste, BorderLayout.WEST);
	
	ventana.setSize(600,300);
	ventana.setLocation(300, 350);
	ventana.pack();
	ventana.setVisible(true);
		}


}
