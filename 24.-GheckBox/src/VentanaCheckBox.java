import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaCheckBox {

	public VentanaCheckBox() {
		
	}
	
	public void casillaVerificacion() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con cuadros de seleccion");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.X_AXIS));
		
		JCheckBox miel	= new JCheckBox();
		JCheckBox chocolate = new JCheckBox();
		JCheckBox chantille = new JCheckBox();
		JCheckBox galleta 	= new JCheckBox();
		
		miel.setText("Miel");
		chocolate.setText("Chocolate");
		chantille.setText("Chantille");
		galleta.setText("Galleta");
		
		JPanel pc1	= new JPanel();
		JPanel pc2	= new JPanel();
		JPanel pc3	= new JPanel();
		JPanel pc4	= new JPanel();
		
		pc1.add(miel);
		pc2.add(chocolate);
		pc3.add(chantille);
		pc4.add(galleta);
		
		ventana.add(pc1);
		ventana.add(pc2);
		ventana.add(pc3);
		ventana.add(pc4);
		
		ventana.setSize(400,400);
		ventana.pack();
		ventana.setVisible(true);
		
	}
}
