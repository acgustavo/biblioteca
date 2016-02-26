package br.com.gu.entidades;

public class Livro {

	private long id;
	private String nomeLivro;
	private String autor;
	private String isbn;
	

	public Livro(String nomeLivro, String autor, String isbn) {
		this.autor = autor;
		this.nomeLivro = nomeLivro;
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
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
