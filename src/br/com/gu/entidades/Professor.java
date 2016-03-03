package br.com.gu.entidades;

public class Professor extends Pessoa {

	private String matricula;

	public Professor(String nome, String cpf, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
