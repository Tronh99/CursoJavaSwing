import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

public class DemoJinternalFrame {

	public DemoJinternalFrame() {
		
	}
	
	public void ventanaInterna() {
		JFrame ventana = new JFrame();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setTitle("Ventanas Internas");
		
		JInternalFrame ventanita = new JInternalFrame();
		ventanita.setMaximizable(true);
		ventanita.setResizable(true);
		ventanita.setClosable(true);
		ventanita.setTitle("Ventana interna");
		ventanita.setIconifiable(true);
		
		ventanita.setSize(100,100);
		ventanita.setLocation(50,50);
		ventanita.setVisible(true);
		
		JDesktopPane escritorio = new JDesktopPane();
		ventana.add(ventanita);
		ventana.add(escritorio);
		ventana.setSize(300,300);
		ventana.setVisible(true);
		
	}
	
}
