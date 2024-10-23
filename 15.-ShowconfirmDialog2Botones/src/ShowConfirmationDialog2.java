import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ShowConfirmationDialog2 {
	
	public ShowConfirmationDialog2() {
		
	}
	
	public void dialogo2Botones() {
		new JOptionPane();
		int boton02 = JOptionPane.showConfirmDialog(new JFrame(), "Segundo evento con JOptionFrame", "Terecer evento mas opciones", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
	}
}
