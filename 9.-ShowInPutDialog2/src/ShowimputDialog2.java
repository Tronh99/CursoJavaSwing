import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ShowimputDialog2 {
	
	public ShowimputDialog2() {
		
	}
	
	public void entradaCompuesta() {
		new JOptionPane();
		String entrada = JOptionPane.showInputDialog(new JFrame(), "Introduce tu nombre", "Aqui escribe tu nombre");
		System.out.println(entrada);
		
		
	}

}
