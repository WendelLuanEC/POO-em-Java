package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class BoxArmas extends JPanel {

	public BoxArmas() {

		setLayout(new GridLayout(2,3));
		setBackground(Color.LIGHT_GRAY);
//		setLayout(new BorderLayout());
		JComboBox<String> armasMorfel = new JComboBox<String>();
		armasMorfel.addItem("Selecione a arma do Morfel:");
		armasMorfel.addItem("Martelo");
		armasMorfel.addItem("Espada");
		armasMorfel.addItem("Arco e Flecha");
		armasMorfel.addItem("Atiradeira");
		armasMorfel.addItem("Bastão");
		armasMorfel.addItem("Chaco");

		JComboBox<String> armasCopinho = new JComboBox<String>();
		armasCopinho.addItem("Selecione a arma do Copinho:");
		armasCopinho.addItem("Martelo");
		armasCopinho.addItem("Espada");
		armasCopinho.addItem("Arco e Flecha");
		armasCopinho.addItem("Atiradeira");
		armasCopinho.addItem("Bastão");
		armasCopinho.addItem("Chaco");
		
		JComboBox<String> armasCafezito = new JComboBox<String>();
		armasCafezito.addItem("Selecione a arma do Cafezito:");
		armasCafezito.addItem("Martelo");
		armasCafezito.addItem("Espada");
		armasCafezito.addItem("Arco e Flecha");
		armasCafezito.addItem("Atiradeira");
		armasCafezito.addItem("Bastão");
		armasCafezito.addItem("Chaco");
		
		JComboBox<String> armasNeo = new JComboBox<String>();
		armasNeo.addItem("Selecione a arma do Neo:");
		armasNeo.addItem("Martelo");
		armasNeo.addItem("Espada");
		armasNeo.addItem("Arco e Flecha");
		armasNeo.addItem("Atiradeira");
		armasNeo.addItem("Bastão");
		armasNeo.addItem("Chaco");
		
		JComboBox<String> armasOraculo = new JComboBox<String>();
		armasOraculo.addItem("Selecione a arma do Oráculo:");
		armasOraculo.addItem("Martelo");
		armasOraculo.addItem("Espada");
		armasOraculo.addItem("Arco e Flecha");
		armasOraculo.addItem("Atiradeira");
		armasOraculo.addItem("Bastão");
		armasOraculo.addItem("Chaco");

		JComboBox<String> armasTrinity = new JComboBox<String>();
		armasTrinity.addItem("Selecione a arma do Trinity:");
		armasTrinity.addItem("Martelo");
		armasTrinity.addItem("Espada");
		armasTrinity.addItem("Arco e Flecha");
		armasTrinity.addItem("Atiradeira");
		armasTrinity.addItem("Bastão");
		armasTrinity.addItem("Chaco");
		
		add(armasMorfel);
		add(armasCafezito);
		add(armasCopinho);
		add(armasNeo);
		add(armasOraculo);
		add(armasTrinity);
	}

}
