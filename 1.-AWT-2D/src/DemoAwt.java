import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;

public class DemoAwt {
 
	
	
	public DemoAwt() {
		Frame frame = new Frame();
		frame.setSize(300,300);
		Button boton = new Button("Click");
		frame.add(boton);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
 }
	
	
}
