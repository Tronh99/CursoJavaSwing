import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import java.net.URL;


public class VentanaMenu {
	
	public VentanaMenu() {
		
	}
	
	public void menu() {
		JFrame ventana = new JFrame();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setTitle("Ventanan con menu");
		
		JMenuItem guardar;
		
		// Crear un menu
		JMenu menuArchivo = new JMenu("Archivo");
		JMenu subMenu = new JMenu("SubMenu");
		
		//
		URL url1 = getClass().getResource("/Imagenes/new.png");
		URL url2 = getClass().getResource("/Imagenes/open.png");
		URL url3 = getClass().getResource("/Imagenes/exit.png");

		JMenuItem nuevo = (url1 != null) ? new JMenuItem("Nuevo", new ImageIcon(url1)) : new JMenuItem("Nuevo");
		JMenuItem abrir = (url2 != null) ? new JMenuItem("Abrir", new ImageIcon(url2)) : new JMenuItem("Abrir");
		JMenuItem salir = (url3 != null) ? new JMenuItem("Salir", new ImageIcon(url3)) : new JMenuItem("Salir");
		guardar = new JMenuItem("Guardar");
		
		//Crear elmentos de tipo RadioMenu
		JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Boton de Radio 1");
		JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Boton de Radio 2");
		radio1.setSelected(true);
		//Crear BottonGroup para agrupar los JRadioMenu
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radio1);
		grupo.add(radio2);
		
		//Crear elementos de tipo CheckBocMenu
		JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Casilla 1");
		JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Casilla 2");
		
		//Agrego elementos al menu
		menuArchivo.add(nuevo);
		menuArchivo.add(abrir);
		menuArchivo.add(guardar);
//		menuArchivo.addSeparador();
		
		//Agregar elementos JRadioButton al Menu
		menuArchivo.add(radio1);
		menuArchivo.add(radio2);
//		menuArchivo.addSeparador();
		
		//Agregar elementos JCheckMenu al menu
		menuArchivo.add(check1);
		menuArchivo.add(check2);
//		menuArchivo.addSeparador();
		
		//Crear Items para el Submenu
		URL url4 = getClass().getResource("/Imagenes/delete.png");
		JMenuItem sub1 = new JMenuItem("Submenu 1", new ImageIcon(url4));
		JMenuItem sub2 = new JMenuItem("Submenu 2");
		JMenuItem sub3 = new JMenuItem("Submenu 3");
		
		//Agreagar Items al submenu
		subMenu.add(sub1);
		subMenu.add(sub2);
//		subMenu.addSeparador();
		subMenu.add(sub3);
		
		//Agregar submenu al Menu principal
		menuArchivo.add(subMenu);
//		menuArchivo.addSeparador();
		menuArchivo.add(salir);
		
		//Crea la barra de menus
		JMenuBar barra = new JMenuBar();
		
		// Agraga los menus a la barra de menues
		barra.add(menuArchivo);
		
		//Agreagar la barra de menues al contenedor
		ventana.setJMenuBar(barra);
		
		ventana.setSize(300,300);
		ventana.setVisible(true);
		
		
		
				
		
	}

}
