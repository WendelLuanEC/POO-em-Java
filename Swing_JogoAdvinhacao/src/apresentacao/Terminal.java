package apresentacao;

import negocio.JogoAdivinhacao;

public class Terminal {


	public static void main(String[] args) {

		JogoAdivinhacao j = new JogoAdivinhacao();
		
		for (int i = 0; i <100; i++) {
			System.out.println(j.jogada(i));
		
		}
	
	}
			
}
