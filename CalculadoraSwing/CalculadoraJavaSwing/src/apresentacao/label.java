package apresentacao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class label extends JPanel{
	
	public label(String texto, Color cor) {
		JLabel label = new JLabel();
		label.setText(texto);
		setBackground(cor);
		setFont(new Font("arial", Font.PLAIN, 20));
	}
	
}
