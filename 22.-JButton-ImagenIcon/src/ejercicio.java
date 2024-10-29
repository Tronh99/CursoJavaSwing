import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;
public class ejercicio {
	
	public ejercicio() {
		
	}
	
	public void seguridad() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Inicio de sesion.");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelNorte	= new JPanel();
		JPanel panelCentro	= new JPanel();
		JPanel panelOeste 	= new JPanel();
		JLabel etiqueta1 = new JLabel();
		JLabel etiqueta2 = new JLabel();
		JLabel etiqueta3 = new JLabel();
		JPanel pcaja1 = new JPanel();
		JPanel pcaja2 = new JPanel();
		
		
		panelCentro.setLayout(new GridLayout(3,3));
		panelOeste.setLayout(new BoxLayout(panelOeste, BoxLayout.Y_AXIS));
		
		etiqueta1.setText("Inicio de sesion.");
		etiqueta2.setText("Usuario.");
		etiqueta3.setText("Contraseña.");
		
		pcaja1.setLayout(new FlowLayout());
		
		JTextField caja1 = new JTextField();
		caja1.setText("Nombre");
		
		JPasswordField caja2 = new JPasswordField();
		caja2.setText("      ");
		

		
		 // Cargar y escalar la primera imagen
        URL laurl1 = this.getClass().getResource("/Imagenes/usuario.png");
        JLabel labelIcon1 = new JLabel();  // Creamos un JLabel para la primera imagen
        if (laurl1 == null) {
            System.out.println("No se encontró la imagen usuario.png");
        } else {
            ImageIcon imageIcon1 = new ImageIcon(laurl1);
            Image image1 = imageIcon1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            labelIcon1.setIcon(new ImageIcon(image1));  // Agregamos la imagen escalada al JLabel
        }

        // Cargar y escalar la segunda imagen
        URL laurl2 = this.getClass().getResource("/Imagenes/candado.png");
        JLabel labelIcon2 = new JLabel();  // Creamos un JLabel para la segunda imagen
        if (laurl2 == null) {
            System.out.println("No se encontró la imagen candado.png");
        } else {
            ImageIcon imageIcon2 = new ImageIcon(laurl2);
            Image image2 = imageIcon2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            labelIcon2.setIcon(new ImageIcon(image2));  // Agregamos la imagen escalada al JLabel
        }
       
   

        URL laurl3 = this.getClass().getResource("/Imagenes/aceptar.png");
		ImageIcon imagen = new ImageIcon(laurl3);
		Image imagenEscalada = imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon imagenFinal = new ImageIcon(imagenEscalada);
		JButton btn1 = new JButton("aceptar", imagenFinal);
		
		 URL laurl4 = this.getClass().getResource("/Imagenes/cancelar.png");
		ImageIcon imagen2 = new ImageIcon(laurl4);
		Image imagenEscalada2 = imagen2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon imagenFinal2 = new ImageIcon(imagenEscalada2);
		JButton btn2 = new JButton("cancelar", imagenFinal2);
        
		
        

		
		pcaja1.add(caja1);
		pcaja2.add(caja2);
		
		panelNorte.add(etiqueta1);
		panelCentro.add(etiqueta2);
		panelCentro.add(pcaja1);
		panelCentro.add(etiqueta3);
		panelCentro.add(pcaja2);
		panelCentro.add(btn1);
		panelCentro.add(btn2);
		panelOeste.add(labelIcon1);  // Agregamos el JLabel con la imagen escalada
        panelOeste.add(labelIcon2);  // Agregamos el JLabel con la imagen escalada
		
		ventana.add(panelNorte, BorderLayout.NORTH);
		ventana.add(panelCentro, BorderLayout.CENTER);
		ventana.add(panelOeste, BorderLayout.WEST);
				
		ventana.pack();
//		ventana.setSize(600,300);
		ventana.setLocation(300, 350);
		ventana.setVisible(true);
		
	}

}
