package br.com.gu.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.gu.entidades.Aluno;
import br.com.gu.entidades.Emprestimo;
import br.com.gu.entidades.Livro;

public class Teste {
	public static void main(String[] args) {
		//cadastro de livros
		Livro bancoDados = new Livro("Banco de dados", "autor", "1234567890");
		Livro algoritimos = new Livro("algoritimos", "autor2", "0123456789");
		//cadastro de alunos
		Aluno aluno = new Aluno("Gustavo Enrique", "001001111");

		// emprestimo
		Emprestimo emp = new Emprestimo();

		emp.setLivro(bancoDados);
		emp.setAluno(aluno);
		emp.setDataAlugado(new Date());
		emp.setDataEntrega(new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("O aluno " + emp.getAluno().getNome() + " alugou o livro " + emp.getLivro().getNomeLivro() + " no dia " + sdf.format(emp.getDataAlugado()) + " com previsao de entrega no dia " + sdf.format(emp.getDataEntrega()));
	}
}
