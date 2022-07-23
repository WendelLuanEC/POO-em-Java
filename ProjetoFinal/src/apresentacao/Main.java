package apresentacao;

import java.util.ArrayList;

import negocio.Categoria;
import negocio.Participante;
import persistencia.CategoriaDAO;
import persistencia.ParticipanteDAO;

public class Main {

	public static void main(String[] args) {

		// Insere uma nova Categoria
//		Participante Luan = new Participante();
//		Categoria p2 = new Categoria();
		CategoriaDAO dao = new CategoriaDAO();
//		p2.setPessoa("Wendel Luan");
//		p2.setCarro("");
//		p2.setCidadeEstadoPais("");
//		p2.setFruta("");
//		p2.setAnimal("");
//		p2.setObjeto("");
//		p2.setParticipante(Luan);
//		
//		if (dao.inserir(p2)) {
//			System.out.println("Cadatro realizado");
//		} else {
//			System.out.println("operaco nao realizada");
//		}

		// Atualiza os dados
//		dao.update(p2, 9);

		// Deletar categoria
		ParticipanteDAO daoP = new ParticipanteDAO();
		if (daoP.deletar(4)) {
			System.out.println("Cadatro realizado");
		} else {
			System.out.println("operaco nao realizada");
		}
		

//		 Listar Categorias
//		for (Categoria p : dao.listar()) {
//			System.out.println("pessoa: " + p.getPessoa() + " carro: " + p.getCarro() + " cidadeEstadoPais: "
//					+ p.getCidadeEstadoPais() + "fruta: " + p.getFruta() + "objeto: " + p.getObjeto() + "animal: "
//					+ p.getAnimal() + "id participante: " + p.getParticipante());
//		}

//		Participante p1 = new Participante();
//		ParticipanteDAO dao1 = new ParticipanteDAO();

//		 inserir um participante
//		Participante p1 = new Participante();
//		p1.setNome("Wendel Luan");
//		p1.setPontuacao(0);
//
//		if (dao1.inserir(p1)) {
//			System.out.println("Cadatro realizado");
//		} else {
//			System.out.println("operaco nao realizada");
//		}

//		StartGame game = new StartGame();

	}

}
