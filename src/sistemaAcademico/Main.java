package sistemaAcademico;

import view.*;
import repository.*;
import controller.*;

public class Main {
	public static void main(String[] args) {
		ProfessorRepository profRep = new ProfessorRepository();
		ProfessorView profVw = new ProfessorView();
		ProfessorController profCtr = new ProfessorController(profRep, profVw);
		
		profCtr.adicionarProfessor(profVw.lerDadosProfessorSubstituto());
		System.out.println("\n");
		profCtr.adicionarProfessor(profVw.lerDadosProfessorVitalicio());
		System.out.println("\n");
		profCtr.adicionarProfessor(profVw.lerDadosProfessorVitalicio());
		System.out.println("\n");
		profCtr.listarProfessores();
		profCtr.removerProfessor();
		System.out.println("\n");
		profCtr.listarProfessores();
	}
}
