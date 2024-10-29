import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;

public class VentanaJButtonImagenIcon {
	
	public VentanaJButtonImagenIcon() {
		
	}
	
	public void ImagenBoton() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("JButton con imagen");
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.X_AXIS));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		URL laurl = this.getClass().getResource("/Imagenes/aceptar.png");
		ImageIcon imagen = new ImageIcon(laurl);
		Image imagenEscalada = imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon imagenFinal = new ImageIcon(imagenEscalada);
		JButton btn = new JButton("Java", imagenFinal);
		
		ventana.add(btn);
		ventana.setSize(400,400);
		ventana.pack();
		ventana.setVisible(true);
		
		
	}

}
