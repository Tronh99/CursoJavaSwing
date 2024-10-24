import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.net.URL;

public class ventanaImagen {

	public ventanaImagen() {
		
	}
	
	public void pintaImagen() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con imagen");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		URL laurl = this.getClass().getResource("Imagenes/logo.png");
		if (laurl != null) {
			ImageIcon imageIcon = new ImageIcon(laurl);
			
			ventana.add(new JLabel(imageIcon));
			ventana.setSize(400, 400);
			ventana.setVisible(true);
		} else {
			System.out.println("No se encontro imagen.");
		}
		
	}
	
}
