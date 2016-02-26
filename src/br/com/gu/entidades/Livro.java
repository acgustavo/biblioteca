package br.com.gu.entidades;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	private long id;
	private String nomeLivro;
	private String autor;
	private String isbn;
	private List<Emprestimo> emprestimos = new ArrayList<>();

	public Livro(String nomeLivro, String autor, String isbn) {
		this.autor = autor;
		this.nomeLivro = nomeLivro;
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
