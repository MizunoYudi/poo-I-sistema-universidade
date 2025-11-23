package view;

import model.Aluno;
import java.util.Scanner;
import java.util.List;

public class AlunoView {
	private Scanner sc = new Scanner(System.in);
	
	public Aluno lerDadosAluno() {
		System.out.print("\n");
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o CPF: ");
		String cpf = sc.nextLine();
		
		return new Aluno(nome, cpf);
	}
	
	private void dadosAluno(Aluno al) {
		System.out.println("Nome: " + al.getNome());
		System.out.println("CPF: " + al.getCpf());
		System.out.print("\n");
	}
	
	public void listarAlunos(List<Aluno> alunos) {
		System.out.println("\nAlunos: ");
		for(Aluno a : alunos) {
			dadosAluno(a);
		}
	}
	
	public String removerAluno() {
		System.out.print("Digite o CPF do aluno: ");
		return sc.nextLine();
	}
}
