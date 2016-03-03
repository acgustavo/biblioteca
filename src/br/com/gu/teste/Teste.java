package br.com.gu.teste;

import java.util.Date;

import br.com.gu.entidades.Aluno;
import br.com.gu.entidades.Autor;
import br.com.gu.entidades.Emprestimo;
import br.com.gu.entidades.Livro;

public class Teste {
	public static void main(String[] args) {
				
		//cadastro de autores
		Autor jony = new Autor ("Jony My Rayshon");
		Autor mikeFlay = new Autor ("Mike Fly da Silva");
		
		//cadastro de livros
		Livro bancoDados = new Livro("Banco de dados", "1234567890");
		bancoDados.getAutores().add(jony);
		Livro algoritimos = new Livro("algoritimos", "0123456789");
		algoritimos.getAutores().add(mikeFlay);
		
		//cadastro de alunos
		Aluno gustavo = new Aluno("Gustavo Enrique Cruz Andrade ", "cpf", "ra");
		Aluno joao = new Aluno ("Joao", "cpf", "ra");
		
		// emprestimo
		Emprestimo emp = new Emprestimo();
		emp.setLivro(bancoDados);
		emp.setAluno(gustavo);
		emp.setDataAlugado(new Date());
		emp.setDataEntrega(new Date());
		gustavo.getEmprestimos().add(emp);
		
		// emprestimo2
		Emprestimo emp2 = new Emprestimo();
		emp2.setLivro(algoritimos);
		emp2.setAluno(gustavo);
		emp2.setDataAlugado(new Date());
		emp2.setDataEntrega(new Date());
		gustavo.getEmprestimos().add(emp2);
		
		// emprestimo3
		Emprestimo emp3 = new Emprestimo();
		emp3.setLivro(bancoDados);
		emp3.setAluno(joao);
		emp3.setDataAlugado(new Date());
		emp3.setDataEntrega(new Date());
		joao.getEmprestimos().add(emp3);
		
		// emprestimo4
		Emprestimo emp4 = new Emprestimo();
		emp4.setLivro(algoritimos);
		emp4.setAluno(joao);
		emp4.setDataAlugado(new Date());
		emp4.setDataEntrega(new Date());
		joao.getEmprestimos().add(emp4);
		
		System.out.println("O aluno " + gustavo.getNome() + " alugou o livro " + gustavo.getEmprestimos());
		System.out.println("O aluno " + joao.getNome() + " alugou o livro " + joao.getEmprestimos());

		
	}
}
