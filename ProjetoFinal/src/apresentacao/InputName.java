package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputName extends JPanel {

	public InputName() {
		
		JTextField inputName = new JTextField();
		inputName.setText("Insira seu nome");
		inputName.setBackground(Color.lightGray);
		inputName.setFont(new Font("arial", Font.BOLD, 40));
		setPreferredSize(new Dimension(10,6));
		add(inputName);
	
	}

}
