import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ventanita extends JInternalFrame {
	

	public ventanita() {
		
		
		setMaximizable(true);
		setResizable(true);
		setClosable(true);
		setTitle("Ventana interna");
		setIconifiable(true);
		
		JFrame ventanaS = new JFrame();
		ventanaS.setTitle("Inicio de sesion.");
		ventanaS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.X_AXIS));
		
		JLabel etiqueta1 = new JLabel();
		JLabel etiqueta2 = new JLabel();
		JLabel etiqueta3 = new JLabel();
		JLabel etiqueta4 = new JLabel();
		JLabel etiqueta5 = new JLabel();
		JLabel etiqueta6 = new JLabel();
		JPanel pcaja1 = new JPanel();
		JPanel pcaja2 = new JPanel();
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		
		
		JRadioButton tres = new JRadioButton("3%");
		JRadioButton cinco = new JRadioButton("5%");
		JRadioButton siete = new JRadioButton("7%");
		JRadioButton nueve	 = new JRadioButton("9%");
		
		tres.setSelected(true);
		
		JPanel pr1 = new JPanel();
		JPanel pr2 = new JPanel();
		JPanel pr3 = new JPanel();
		JPanel pr4 = new JPanel();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8,2));
		
		etiqueta1.setText("Cantidad:");
		etiqueta2.setText("Precio.");
		etiqueta3.setText("Subtotal.");
		etiqueta4.setText("IVA");
		etiqueta5.setText("Descuento");
		etiqueta6.setText("Total");

		
		
		pcaja1.setLayout(new FlowLayout());
		
		JTextField caja1 = new JTextField();
		caja1.setText("      ");
		
		JTextField caja2 = new JTextField();
		caja2.setText("      ");
		
		btn1.setText("Aceptar");
		btn2.setText("Cancelar");
		
		pr1.add(tres);
		pr2.add(cinco);
		pr3.add(siete);
		pr4.add(nueve);
		
		pcaja1.add(caja1);
		pcaja2.add(caja2);
		
		panel.add(etiqueta1);
		panel.add(caja1);
		panel.add(etiqueta2);
		panel.add(caja2);
		panel.add(tres);
		panel.add(cinco);
		panel.add(siete);
		panel.add(nueve);
		panel.add(etiqueta3);
		panel.add(etiqueta4);
		panel.add(etiqueta5);
		panel.add(etiqueta6);
		panel.add(btn1);
		panel.add(btn2);
		
		
		ventanaS.add(panel);
		
		setSize(100,100);
		setLocation(50,50);
	}
}
