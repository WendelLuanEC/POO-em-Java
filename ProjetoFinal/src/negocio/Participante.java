package negocio;

import java.awt.Insets;

public class Participante {

	private int id;
	private String nome;
	private int pontuacao;
	
	public Participante(int id, String nome, int pontuacao) {
		setId(id);
		setNome(nome);
		setPontuacao(pontuacao);
	}
	
	public Participante() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
