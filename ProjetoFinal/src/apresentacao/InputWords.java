package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputWords extends JPanel {
	
	private JTextField pessoa = new JTextField();
	private JTextField carro = new JTextField();
	private JTextField animal = new JTextField();
	private JTextField objeto = new JTextField();
	private JTextField CidadeEstadoPais = new JTextField();
	private JTextField fruta = new JTextField();
	
	
	public InputWords () {
		setLayout(new GridLayout(3,2));
		pessoa.setText("Pessoa");
		add(pessoa);
		carro.setText("Carro");
		add(carro);
		animal.setText("Animal");
		add(animal);
		objeto.setText("Objeto");
		add(objeto);
		CidadeEstadoPais.setText("cidadeEstadopais");
		add(CidadeEstadoPais);
		fruta.setText("Fruta");
		add(fruta);
		setBackground(Color.BLACK);
	}
	
	
}
