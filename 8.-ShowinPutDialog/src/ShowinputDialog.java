import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ShowinputDialog {

	public ShowinputDialog() {
		
	}
	
	public void entrada() {
		new JOptionPane();
		String entrada = JOptionPane.showInputDialog(new JFrame(), "Introduce tu nombre");
		System.out.println(entrada);
//		entrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
