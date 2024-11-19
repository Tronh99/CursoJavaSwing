import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class ejercicio {

	public ejercicio() {
		
	}
	
public void pestañas() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Demo de JTabbedPane");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Crear obejto JTabbedPane
		JTabbedPane panelConfichas = new JTabbedPane();
		
		//Establecer panel 1 y agregarlo al obneto JTabbedPanel 
		JLabel etiqueta1 = new JLabel("Data entry", SwingConstants.CENTER);
		JPanel panel1 = new JPanel();
		panel1.add(etiqueta1);
		panelConfichas.addTab("Data entry", null, panel1, "Primer panel");
		
		//Establecer panel 2 y agreagarlo al objeto JTabbedPane
		JLabel etiqueta2 = new JLabel("Recodrd", SwingConstants.CENTER);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.add(etiqueta2);
		panelConfichas.addTab("Records", null, panel2, "Segundo panel");
		
		//Agregar objeto JTabbedPane al contenedor
		ventana.getContentPane().add(panelConfichas);
		
		ventana.setSize(250,200);
		ventana.pack();
		ventana.setVisible(true);
	}

	
}
