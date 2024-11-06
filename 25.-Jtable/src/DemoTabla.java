import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

public class DemoTabla {

	public DemoTabla() {
		
	}
	
	public void Tablas() {
		JFrame ventana = new JFrame("Ventana con JTable");
			ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			String [] [] arreglouno = {{"Steve Jobs", "Apple", "$500000"},
									{"Carlos Slim", "Amercia Movil", "$600000"},
									{"Bill Gates", "Microsoft", "$700000"}};
			
			String [] arreglodos =	{"Persona", "Empresa", "Valor Dolar"};
			
			JTable tabla = new JTable(arreglouno, arreglodos);
			
			ventana.add(tabla);
			ventana.setSize(250,250);
			ventana.pack();
			ventana.setVisible(true);
			
	}
	
}
