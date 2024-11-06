import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableScrollPane {

	public JTableScrollPane() {
		
	}
	
	public void tablaMejorada() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("Jtable y contenedor JScrollPane");
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String [][] filascolumnas = {{"Grupo Codesi" , "Entrenamiento", "T.I","22"},
									 {"Angel", "Ramirez", "Diaz", "23"},
									 {"Juan", "Ayala", "Banana", "25"},
									 {"Chabela" , "Catolica", "Apostolica", "100"}
									};
		
		String [] titulo = {"Nombre", "Apellido P", "Apellido M", "Edad"};
		
		JTable tabla = new JTable(filascolumnas, titulo);
		JScrollPane contenedor = new JScrollPane(tabla);
		
		ventana.add(contenedor);
		ventana.pack();
		ventana.setLocation(200,200);
		ventana.setVisible(true);
		
	}
}
