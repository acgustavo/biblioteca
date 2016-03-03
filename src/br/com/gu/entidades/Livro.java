package br.com.gu.entidades;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	private long id;
	private String nomeLivro;
	private String isbn;
	private List<Autor> autores = new ArrayList<>();

	public Livro(String nomeLivro, String isbn) {
		this.nomeLivro = nomeLivro;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	
}
