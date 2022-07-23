package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaJogo<JTextFiel> extends JFrame {

	public String nomeJogador1, nomeJogador2;

	public JanelaJogo() {

		organizador();
		setTitle("Batalha do Morfel O Retorno");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
//		setBackground(Color.black);
//		pack();
	}

	public void organizador() {
		setLayout(new GridLayout(4, 1));

		entradaNomes inputNomes = new entradaNomes();
		add(inputNomes);

		BoxArquivos arquivosEntrada = new BoxArquivos();
		add(arquivosEntrada);

		BoxArmas armas = new BoxArmas();
		add(armas);

		Botao start = new Botao("Iniciar Jogo", Color.LIGHT_GRAY);
		start.setSize(20, 10);
		add(start, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		JanelaJogo j = new JanelaJogo();
	}

}
