package view;

import model.ProfessorVitalicio;
import model.ProfessorSubstituto;
import model.Professor;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;

public class ProfessorView {
	private Scanner sc = new Scanner(System.in);
		
	public ProfessorVitalicio lerDadosProfessorVitalicio(){
		System.out.print("\n");
		System.out.print("Digite o nome:");
		String nome = sc.nextLine();
		
		System.out.print("Digite a matricula: ");
		String matricula = sc.nextLine();
		
		System.out.print("Digite a titulacao: ");
		String titulacao = sc.nextLine();
		
		System.out.print("Digite o salario: ");
		double salario = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite a data do contrato na seguinte ordem: ");
		System.out.print("Dia: ");
		int dia = Integer.parseInt(sc.nextLine());
		
		System.out.print("Mes: ");
		int mes = Integer.parseInt(sc.nextLine());
		
		System.out.print("Ano: ");
		int ano = Integer.parseInt(sc.nextLine());
		
		LocalDate dataContrato = LocalDate.of(ano, mes, dia);
		
		return new ProfessorVitalicio(nome, matricula, titulacao, salario, dataContrato);
	}
	
	public ProfessorSubstituto lerDadosProfessorSubstituto(){
		System.out.print("\n");
		System.out.print("Digite o nome:");
		String nome = sc.nextLine();
		
		System.out.print("Digite a matricula: ");
		String matricula = sc.nextLine();
		
		System.out.print("Digite a titulacao: ");
		String titulacao = sc.nextLine();
		
		System.out.println("Digite a data do contrato na seguinte ordem: ");
		System.out.print("Dia: ");
		int diaIni = Integer.parseInt(sc.nextLine());
		
		System.out.print("Mes: ");
		int mesIni = Integer.parseInt(sc.nextLine());
		
		System.out.print("Ano: ");
		int anoIni = Integer.parseInt(sc.nextLine());
		
		LocalDate dataIniContrato = LocalDate.of(anoIni, mesIni, diaIni);
		
		System.out.print("Horas/Aulas dadas: ");
		int horasAula = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite a data do final do contrato na seguinte ordem: ");
		System.out.print("Dia: ");
		int diaFim = Integer.parseInt(sc.nextLine());
		
		System.out.print("Mes: ");
		int mesFim = Integer.parseInt(sc.nextLine());
		
		System.out.print("Ano: ");
		int anoFim = Integer.parseInt(sc.nextLine());
		
		LocalDate dataFimContrato = LocalDate.of(anoFim, mesFim, diaFim);
		
		return new ProfessorSubstituto(nome, matricula, titulacao, (double) 80, dataIniContrato, horasAula, dataFimContrato);
	}
	
	private void DadosProf(ProfessorVitalicio prof) {
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Matricula: " + prof.getMatricula());
		System.out.println("Titulacao:  " + prof.getTitulacao());
		System.out.println("Salario: " + prof.calcularSalario());
		System.out.println("Data Contrato: " + prof.getDataContrato());
	}
	
	private void DadosProf(ProfessorSubstituto prof) {
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Matricula: " + prof.getMatricula());
		System.out.println("Titulacao:  " + prof.getTitulacao());
		System.out.println("Salario: " + prof.calcularSalario());
		System.out.println("Horas/Aulas dadas: " + prof.getHorasAulas());
		System.out.println("Data de Inicio do Contrato: " + prof.getDataContrato());
		System.out.println("Data de Final do Contrato: " + prof.getDataFinalContrato());
		
	}
	
	public void listarProfessores(List<Professor> profs) {
		System.out.println("Professores: ");
		for(Professor prof : profs) {
			System.out.print("\n");
			if(prof instanceof ProfessorVitalicio) {
				System.out.println("Professore Vitalício: ");
				this.DadosProf((ProfessorVitalicio) prof);
			} else {
				System.out.println("Professor Substituo: ");
				this.DadosProf((ProfessorSubstituto) prof);
			}
		}
	}
	
	/* 
		Implementacao futura - Edicao de professores
		public String informarMatricula() {
		System.out.print("Informe a matricula do professor: ");
		return sc.nextLine();
	} 
	*/
	
	public String removerProfessor() {
		System.out.print("Digite a matricula do professor que deseja remover: ");
		return sc.nextLine();
	}
	
	public String exibirSalario() {
		System.out.print("Digite a matricula do professor que deseja consultar o salario: ");
		return sc.nextLine();
	}
}
