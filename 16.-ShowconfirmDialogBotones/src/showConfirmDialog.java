import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class showConfirmDialog {

	public showConfirmDialog() {
		
	}
	
	public void dialogo2Botones() {
		new JOptionPane();
		int boton3 = JOptionPane.showConfirmDialog(new JFrame(), "Tercer evento con JOption", "Tercer evento mas opciones", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if (boton3 == 0) {
			System.out.println("Presiono si");
		}
		if (boton3 == 1) {
			System.out.println("Presiono no");
		}
	}
	
}
