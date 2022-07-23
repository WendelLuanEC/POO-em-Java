package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class entradaNomes extends JPanel {

	public entradaNomes() {
		
		setLayout(new FlowLayout());
		
//		JLabel label = new JLabel();
//		label.setText("Insira o nome dos jogadores abaixo");
//		add(label, BorderLayout.NORTH);
		setFont(new Font("arial", Font.TYPE1_FONT, 40));
		setBackground(Color.LIGHT_GRAY);
		JTextField entrada1 = new JTextField(20);
		entrada1.setText("Insira o nome do jogador 1");
		entrada1.setSize(20, 10);
		add(entrada1);

		JTextField entrada2 = new JTextField(20);
		entrada2.setText("Insira o nome do jogador 2");
		entrada2.setSize(20, 10);
		add(entrada2);
		
		
	}

}
