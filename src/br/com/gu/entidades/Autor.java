package br.com.gu.entidades;

public class Autor {

	private long id;
	private String autor;
	
	public Autor(String autor) {
		this.autor = autor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
