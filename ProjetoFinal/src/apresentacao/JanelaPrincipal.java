package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame {

	public JanelaPrincipal() {

		organizador();
		setSize(600, 400);
		setTitle("ADEDONHA.EXE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(Color.BLACK);

	}

	public void organizador() {
		setLayout(new GridLayout(4, 1));

		InputName name = new InputName();
		add(name);

		LabelPrincipal labelPrincipal = new LabelPrincipal();
		add(labelPrincipal);

		InputWords inputWords = new InputWords();
		add(inputWords);

		Botao button = new Botao("Enviar", Color.BLACK);
		add(button);

	}

	public static void main(String[] args) {
		new JanelaPrincipal();
	}

}
