import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class ejercicio {
	
	public ejercicio() {
		
	}
	
	public void empleados() {
		
		JFrame ventana = new JFrame("Empleados");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridLayout(3,3));
		
			JLabel etiquetaNom = new JLabel();
			JLabel etiquetaSueldo = new JLabel();
			JLabel etiquetaDepartamento = new JLabel();
			
			etiquetaNom.setText("Nombre: ");
			etiquetaSueldo.setText("Sueldo: ");
			etiquetaDepartamento.setText("Departamento");
			
			
			JTextField cajaNom = new JTextField();
			cajaNom.setText("      ");
			
			JTextField canaSuel = new JTextField();
			canaSuel.setText("     ");
			
			JButton btnaceptar = new JButton();
			btnaceptar.setText("Agregar");
			
			JButton btneliminar = new JButton();
			btneliminar.setText("Eliminar");
			
			String [] departamento = {"Sistemas", "Contabilidad" , "Marketing", "Gfe"};
			JComboBox<String> departamentos = new JComboBox<String> (departamento);
			
			String [] [] arreglouno = {{"Steve Jobs", "Apple", "$500000"},
					{"Carlos Slim", "Amercia Movil", "$600000"},
					{"Bill Gates", "Microsoft", "$700000"}};

			String [] arreglodos =	{"Persona", "Empresa", "Valor Dolar"};
			JTable tabla = new JTable(arreglouno, arreglodos);

			
			panel.add(etiquetaNom);
			panel.add(cajaNom);
			panel.add(btnaceptar);
			panel.add(etiquetaSueldo);
			panel.add(canaSuel);
			panel.add(btneliminar);
			panel.add(etiquetaDepartamento);
			panel.add(departamentos);
						
			ventana.add(panel, BorderLayout.NORTH);
			ventana.add(tabla, BorderLayout.SOUTH);
			
			ventana.pack();
			ventana.setVisible(true);	
			
	}

}
