package view;

import model.Aluno;
import java.util.Scanner;
import java.util.List;

public class AlunoView {
	private Scanner sc = new Scanner(System.in);
	
	public Aluno lerDadosAluno() {
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o CPF: ");
		String cpf = sc.nextLine();
		
		return new Aluno(nome, cpf);
	}
	
	private void dadosAluno(Aluno al) {
		System.out.print("Nome: " + al.getNome());
		System.out.print("CPF: " + al.getCpf());
	}
	
	public void listarAlunos(List<Aluno> alunos) {
		for(Aluno a : alunos) {
			dadosAluno(a);
		}
	}
}
