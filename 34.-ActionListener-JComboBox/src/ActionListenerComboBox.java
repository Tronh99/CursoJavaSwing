import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ActionListenerComboBox implements ActionListener {
	
	JComboBox<String> combo1;
	JComboBox<String> combo2;
	JTextField caja1;
	JButton boton;
	
	public ActionListenerComboBox() {
		
	}
	
	public void accion() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Ventana con JComboBox");
		ventana.setLayout(new GridLayout(3,1));
		
		JPanel panelCombo1 = new JPanel();
		JPanel panelCombo2 = new JPanel();
		JPanel panelCajas = new JPanel();
		
		boton = new JButton("Agregar");
		caja1 = new JTextField();
		caja1.setColumns(20);
		
		panelCombo1.setLayout(new FlowLayout());
		panelCombo2.setLayout(new FlowLayout());
		panelCajas.setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("Elija sabor");
		String[] sabores = {"Chocolate" , "Fresa", "Frambuesa", "Vainilla"};
		combo1 = new JComboBox<String>(sabores);
		
		JLabel label2 = new JLabel("Combo 2");
		combo2 = new JComboBox<String>();
		
		combo1.addActionListener(this);
		boton.addActionListener(this);
		
		panelCombo1.add(label1);
		panelCombo1.add(combo1);
		
		panelCombo2.add(label2);
		panelCombo2.add(combo2);
		panelCombo2.add(boton);

		panelCajas.add(caja1);
		
		ventana.add(panelCombo1);
		ventana.add(panelCombo2);
		ventana.add(panelCajas);
		
		ventana.setSize(300,300);
		ventana.pack();
		ventana.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent evt) {
		Object accion = evt.getSource();
		if(accion == combo1) {
			String sabor = (String)combo1.getSelectedItem();
			if(sabor =="Chocolate") {
				caja1.setText("Selecciono chocolate");
			}else {
				caja1.setText("");
			}
		}else if(accion == boton) {
			if(caja1.getText().equals("")) {
				combo2.addItem(caja1.getText());
			}
		}
	}

}
