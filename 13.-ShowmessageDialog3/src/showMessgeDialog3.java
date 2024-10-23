import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class showMessgeDialog3 {

	public showMessgeDialog3() {
		
	}
	
	public void muestraMensaje3() {
		JOptionPane.showMessageDialog(new JFrame(), "Mensaje con mas opciones", "Grupo Codesi", JOptionPane.WARNING_MESSAGE, null);
	}
}
