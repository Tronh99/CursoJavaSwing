import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaDefaultTableModel {

	public VentanaDefaultTableModel() {
		
	}
	
	public void tablatm() {
		
		JFrame ventana = new JFrame();
		ventana.setTitle("JTable, contenedor JScrollPane y defaulTableModel");
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String [][] filasColumnas = {{"Grupo Codesi", "Entrenamiento", "IT"},
									{"Angel", "Ramirez", "22"},
									{"Gabriela", "Burgos","22"},
									{"Fernando", "Nahual", "22"}
								  };	
		String []  titulo = {"Nombre", "Apellido Pa.", "Edad"};
		
		
//		Crea variable de tipo DEFAULTTABLEMODEL Y LE PASO LOS ARREGLOS
		
		DefaultTableModel dtm = new DefaultTableModel(filasColumnas,titulo);
		
		JTable tabla = new JTable(dtm);
		JScrollPane contenedor = new JScrollPane(tabla);
		
		ventana.add(contenedor);
		ventana.setSize(300,300);
		ventana.pack();
		ventana.setLocation(200,200);
		ventana.setVisible(true);
		
	}
	
}
