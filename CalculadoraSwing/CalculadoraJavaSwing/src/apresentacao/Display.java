package apresentacao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Display extends JPanel  {

	private JLabel label;
		
	public Display() {
		
		label = new JLabel();
		label.setBackground(Color.BLACK);
		label.setFont(new Font("arial", Font.BOLD, 40));
		setBackground(Color.GRAY);
		add(label);
	}
	
	public void setLabel(String texto) {
		label.setText(texto);
	}
}
