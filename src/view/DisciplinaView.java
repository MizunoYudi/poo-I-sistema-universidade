package view;

import java.util.Scanner;
import java.util.List;
import model.Aluno;
import model.Disciplina;
import model.DisciplinaObrigatoria;
import model.DisciplinaEletiva;

public class DisciplinaView {
	private Scanner sc = new Scanner(System.in);
	
	public DisciplinaObrigatoria lerDadosDisciplinaObrigatoria() {
		System.out.print("\n");
		System.out.print("Digite o nome da disciplina: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o codigo da disciplina: ");
		int codigo = sc.nextInt();
		
		
		System.out.print("Digite a carga horaria do curso");
		int cargaHoraria = sc.nextInt();
		
		return new DisciplinaObrigatoria(nome, codigo, cargaHoraria);
	}
	
	public DisciplinaEletiva lerDadosDisciplinaEletiva() {
		System.out.print("\n");
		System.out.print("Digite o nome da disciplina: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o codigo da disciplina: ");
		int codigo = sc.nextInt();
		
		
		System.out.print("Digite a carga horaria do curso");
		int cargaHoraria = sc.nextInt();
		
		return new DisciplinaEletiva(nome, codigo, cargaHoraria);
	}
	
	private void dadosDisciplina(DisciplinaObrigatoria d) {
		System.out.println("Nome: " + d.getNome());
		System.out.println("Codigo: " + d.getCodigo());
		System.out.println("Carga Horaria: " + d.getCargaHoraria());
	}
	
	private void dadosDisciplina(DisciplinaEletiva d) {
		System.out.println("Nome: " + d.getNome());
		System.out.println("Codigo: " + d.getCodigo());
		System.out.println("Carga Horaria: " + d.getCargaHoraria());
		System.out.println("Interesse: " + d.getInteresse());
	}
	
	public void listarDisciplinas(List<Disciplina> disciplinas) {
		for(Disciplina d : disciplinas) {
			if(d instanceof DisciplinaObrigatoria) {
				System.out.println("Disciplina Obrigatoria: ");
				this.dadosDisciplina((DisciplinaObrigatoria) d);
			} else {
				System.out.println("Disciplina Eletiva: ");
				this.dadosDisciplina((DisciplinaEletiva) d);
			}
		}
	}
	
	// Implementacao futura edicao de Disciplinas
	
	public void listarAlunosDisciplina(Disciplina d) {
		System.out.println(String.format("Alunos da disciplina %s: ", d.getNome()));
		for(Aluno a : d.getAlunos()) {
			System.out.println(a.getNome());
		}
	}
	
	public int buscarDisciplina() {
		System.out.print("Digite o codigo da disciplina: ");
		return sc.nextInt();
	}
}
