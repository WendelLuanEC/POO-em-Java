package apresentacao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxArquivos extends JPanel {

	public BoxArquivos() {
		
		
		setLayout(new FlowLayout());
		setSize(60,70);
//		JLabel label= new JLabel();
//		label.setText("Escolha os arquivos de entrada:");
//		add(label);

		setBackground(Color.LIGHT_GRAY);
		
		JLabel labelArquivos = new JLabel("Escolha os arquivos de entrada");
		add(labelArquivos);
		
		JComboBox<String> jogador1 = new JComboBox<String>();
		jogador1.addItem("Arquivo jogador 1");
		jogador1.addItem("BF_1");
		jogador1.addItem("BF_2");
		jogador1.addItem("BF_5");
		jogador1.addItem("BF_10");
		jogador1.addItem("BF_30");
		jogador1.addItem("BF_50");
		jogador1.addItem("BF_100");
		jogador1.addItem("BF_150");
		jogador1.addItem("BF_200");
		jogador1.addItem("BF_500");
		jogador1.addItem("BF_1000");
//		jogador1.setSize(20, 10);

		add(jogador1);

		JComboBox<String> jogador2 = new JComboBox<String>();
		jogador2.addItem("Arquivo jogador 2");
		jogador2.addItem("BF_1");
		jogador2.addItem("BF_2");
		jogador2.addItem("BF_5");
		jogador2.addItem("BF_10");
		jogador2.addItem("BF_30");
		jogador2.addItem("BF_50");
		jogador2.addItem("BF_100");
		jogador2.addItem("BF_150");
		jogador2.addItem("BF_200");
		jogador2.addItem("BF_500");
		jogador2.addItem("BF_1000");
//		jogador2.setSize(20, 10);
		add(jogador2);
		
		
		
		
	}
}
