import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.net.URL;

public class ActionListenerJToolbar {
	
	public ActionListenerJToolbar() {
		

	}
	
	public void barra() {
		
		JFrame frame = new JFrame("Ventana con barra de herramientas");
		JToolBar toolbar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
		URL url1 = this.getClass().getResource("/src/Imagenes/cut.png");
		JButton cutbutton = new JButton(new ImageIcon(url1));
		cutbutton.setToolTipText("Agregar un registro a la base de datos");
		
		toolbar.add(cutbutton);
		URL url2 = this.getClass().getResource("/src/Imagenes/copy.png");
		JButton copybutton = new JButton(new ImageIcon(url2));
		toolbar.add(copybutton);
		URL url3 = this.getClass().getResource("/src/Imagenes/paste.png");
		JButton pastebutton = new JButton(new ImageIcon(url3));
		toolbar.add(pastebutton);
		
		frame.getContentPane().add(toolbar, BorderLayout.NORTH);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	

}
