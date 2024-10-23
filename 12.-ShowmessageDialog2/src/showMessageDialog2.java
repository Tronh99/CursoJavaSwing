import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class showMessageDialog2 {
	
	public showMessageDialog2() {
		
	}
	
	public void muestraMensaje2() {
		JOptionPane.showMessageDialog(new JFrame(), "Solo mensaje y titulo", "Mensaje de titulo", JOptionPane.ERROR_MESSAGE);
	}

}
