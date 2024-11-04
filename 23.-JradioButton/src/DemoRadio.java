import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DemoRadio {
	
	public DemoRadio() {
		
	}
	
	public void botonRadio() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con botones de Radio");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.X_AXIS));
		
		ButtonGroup grupo = new ButtonGroup();
		JRadioButton java = new JRadioButton("Java");
		JRadioButton net = new JRadioButton(".NET");
		JRadioButton php = new JRadioButton("PHP");
		
		java.setSelected(true);
		
		JPanel pr1 = new JPanel();
		JPanel pr2 = new JPanel();
		JPanel pr3 = new JPanel();
		
		pr1.add(java);
		pr2.add(net);
		pr3.add(php);
		
		ventana.add(pr1);
		ventana.add(pr2);
		ventana.add(pr3);
		
		grupo.add(java);
		grupo.add(net);
		grupo.add(php);
		
		ventana.setSize(400,400);
		ventana.pack();
		ventana.setVisible(true);
	
		
	}

}
