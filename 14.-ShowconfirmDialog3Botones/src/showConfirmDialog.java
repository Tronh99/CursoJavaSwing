import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class showConfirmDialog {

	public showConfirmDialog() {
		
	}
	
	public void mensaje3Botones() {
		new JOptionPane();
		int boton01 = JOptionPane.showConfirmDialog(new JFrame(), "Primer evento con JOptionPane");
		
		if (boton01 == 0) {
			System.out.println("Presion Si");
		}
		if (boton01 == 2) {
			System.out.println("Presione cancelar");
		}
		if (boton01 != 0 && boton01 != 2) {
			System.out.println("Presione No");
		}
	}
}
