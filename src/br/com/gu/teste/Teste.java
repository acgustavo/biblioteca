package br.com.gu.teste;

import br.com.gu.entidades.Aluno;
import br.com.gu.entidades.Emprestimo;
import br.com.gu.entidades.Livro;

public class Teste {
	public static void main(String[] args) {
		
		Livro bancoDados = new Livro("Banco de dados", "autor", "1234567890");
		Livro algoritimos = new Livro("algoritimos", "autor2", "0123456789");
		
		Aluno aluno = new Aluno("Gustavo Enrique", "001001111");

		// emprestimo
		Emprestimo emp = new Emprestimo();

		emp.setLivro(bancoDados);
		emp.setAluno(aluno);
		emp.setDataAlugado(null);
		emp.setDataEntrega(null);
		
		System.out.println("O aluno " + emp.getAluno().getNome() + " alugou o livro " + emp.getLivro().getNomeLivro() + " no dia " + emp.getDataAlugado() + " com previsao de entrega no dia " + emp.getDataEntrega());
	}
}
