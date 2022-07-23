package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import negocio.Memoria;

public class Calculadora extends JFrame {
	
	
	public Calculadora() {			
		
		organizador();
		setSize(300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void organizador() {
		setLayout(new BorderLayout());
		Display display = new Display();
		Memoria memoria=  new Memoria();
		
		display.setPreferredSize(new Dimension(200,60));		
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado(memoria, display);
		add(teclado, BorderLayout.CENTER);
		
	}
	
	
	public static void main(String[] args) {
		new Calculadora();
	}

}
