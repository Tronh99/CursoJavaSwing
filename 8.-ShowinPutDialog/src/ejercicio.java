import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ejercicio {

	public ejercicio() {
		
	}
	
	public void entrada() {
		

		new JOptionPane();
		String IdProducto = JOptionPane.showInputDialog(new JFrame(), "Introduce Id del producto");
		System.out.println(IdProducto);
		
		new JOptionPane();
		String descrip = JOptionPane.showInputDialog(new JFrame(), "Introduce una descripcion");
		System.out.println(descrip);
		
		new JOptionPane();
		String cant = JOptionPane.showInputDialog(new JFrame(), "Introduce la cantidad del prudcuto");
		System.out.println(cant);
		int can = Integer.parseInt(cant);
		
		new JOptionPane();
		String pres = JOptionPane.showInputDialog(new JFrame(), "Introduce el precio");
		System.out.println(pres);
		float presio = Float.parseFloat(pres);
		
		
		double subtotal = can * presio;
		double Iva = subtotal * 0.16;
		double total = subtotal + Iva;
		
		System.out.println("IdProducto: " + IdProducto);
		System.out.println("Descripcion: " + descrip);
		System.out.println("Cantitdad: " + can);
		System.out.println("Precio: " + presio);
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Iva: " + Iva);
		System.out.println("Total: " + total);
		
		
	}
	
}

