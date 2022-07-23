package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabelPrincipal extends JPanel {

	private JLabel label;
	private JTextField labelNome;

	public LabelPrincipal() {

		label = new JLabel();
		label.setBackground(Color.BLACK);
		label.setFont(new Font("arial", Font.BOLD, 40));
		label.setText("A letra sorteada foi: " + "");
		setPreferredSize(new Dimension(10,6));
		add(label);
	}

	public void setLabel(String texto) {
		label.setText(texto);
	}

}
