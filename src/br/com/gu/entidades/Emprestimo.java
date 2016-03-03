package br.com.gu.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emprestimo {
	private long id;
	private Date dataAlugado;
	private Date dataEntrega;
	private Aluno aluno;
	private Livro livro;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataAlugado() {
		return dataAlugado;
	}

	public void setDataAlugado(Date dataAlugado) {
		this.dataAlugado = dataAlugado;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	@SuppressWarnings("deprecation")
	public void setDataEntrega(Date dataEntrega) {
		dataEntrega.setDate(dataEntrega.getDate() + 7);
		this.dataEntrega = dataEntrega;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	@Override
	public String toString() {
		return (livro.getNomeLivro() + " - " + sdf.format(dataAlugado) + " - " + sdf.format(dataEntrega)) ;
	}

}