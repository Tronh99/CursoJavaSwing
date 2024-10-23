import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowinputDialog3 {
	
	public ShowinputDialog3() {
		
	}
	
	public void entrada() {
	new JOptionPane();
	String entrada = JOptionPane.showInputDialog(new JFrame(), "Introduce tu nombre", "Cuadro de entrada por teclado", 
													JOptionPane.INFORMATION_MESSAGE);
	
	System.out.println(entrada);
	}

}
