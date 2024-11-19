import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class VentanaJTabbedPane {

	public VentanaJTabbedPane() {
		
	}
	
	public void pestañas() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Demo de JTabbedPane");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Crear obejto JTabbedPane
		JTabbedPane panelConfichas = new JTabbedPane();
		
		//Establecer panel 1 y agregarlo al obneto JTabbedPanel 
		JLabel etiqueta1 = new JLabel("Panel 1", SwingConstants.CENTER);
		JPanel panel1 = new JPanel();
		panel1.add(etiqueta1);
		panelConfichas.addTab("Ficha 1 ", null, panel1, "Primer panel");
		
		//Establecer panel 2 y agreagarlo al objeto JTabbedPane
		JLabel etiqueta2 = new JLabel("Panel 2", SwingConstants.CENTER);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.add(etiqueta2);
		panelConfichas.addTab("Ficha dos", null, panel2, "Segundo panel");
		
		//Estabalec panel 3 y agregarlo al objeto JTabbedPane
		JLabel etiqueta3 = new JLabel("Panel 3");
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(new JButton("Norte"), BorderLayout.NORTH);
		panel3.add(new JButton("Oeste"), BorderLayout.WEST);
		panel3.add(new JButton("Sur"), BorderLayout.SOUTH);
		panel3.add(new JButton("Este"), BorderLayout.EAST);
		panel3.add(etiqueta3, BorderLayout.CENTER);
		panelConfichas.addTab("Ficha tres", null, panel3, "Tercer panel");
		
		//Agregar objeto JTabbedPane al contenedor
		ventana.getContentPane().add(panelConfichas);
		
		ventana.setSize(250,200);
		ventana.pack();
		ventana.setVisible(true);
	}
	
}
