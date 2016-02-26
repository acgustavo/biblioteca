package br.com.gu.entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private long id;
	private String nome;
	private String ra;
	private List<Emprestimo> emprestimos = new ArrayList<>();

	public Aluno(String nome, String ra) {
		this.nome = nome;
		this.ra = ra;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
}
