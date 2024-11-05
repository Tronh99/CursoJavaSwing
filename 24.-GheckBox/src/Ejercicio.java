import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ejercicio {
	
	public Ejercicio() {
		
	}
	
	public void opciones() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Opciones");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,2));
		
		ButtonGroup grupo = new ButtonGroup();
		JRadioButton Java = new JRadioButton("Java");
		JRadioButton Phyton = new JRadioButton("Phyton");
		JRadioButton Net	= new JRadioButton(".Net");
		
		JCheckBox mySql = new JCheckBox("MySql");
		JCheckBox sqlServer = new JCheckBox("SqlServer");
		JCheckBox Posgres = new JCheckBox("Posgres");
		
		JButton btn1 = new JButton();
		btn1.setText("Aceptar");
		
		JButton btn2 = new JButton();
		btn2.setText("Cancelar");
		
		
		Java.setSelected(true);	
		
		grupo.add(Java);
		grupo.add(Phyton);
		grupo.add(Net);
		
		
		panel.add(Java);
		panel.add(mySql);
		panel.add(Phyton);
		panel.add(sqlServer);
		panel.add(Net);
		panel.add(Posgres);
		panel.add(btn1);
		panel.add(btn2);
		
		ventana.add(panel);
		
	
		ventana.setSize(250,250);
		ventana.setVisible(true);
		
		
		
		
	}

}
