package br.com.gu.entidades;

public class Aluno extends Pessoa {

	private String ra;

	public Aluno(String nome, String cpf, String ra) {
		super(nome, cpf);
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

}
