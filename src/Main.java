

import view.*;
import repository.*;
import controller.*;

public class Main {
	public static void main(String[] args) {
		// ProfessorRepository profRep = new ProfessorRepository();
		// ProfessorView profVw = new ProfessorView();
		// ProfessorController profCtr = new ProfessorController(profRep, profVw);
		AlunoRepository alRep = new AlunoRepository();
		AlunoView alVw = new AlunoView();
		AlunoController alCtr = new AlunoController(alRep, alVw);
		
		alCtr.adicionarAluno(alVw.lerDadosAluno());
		alCtr.adicionarAluno(alVw.lerDadosAluno());
		alCtr.listarAlunos();
		alCtr.removerAluno();
		alCtr.listarAlunos();
	}
}
