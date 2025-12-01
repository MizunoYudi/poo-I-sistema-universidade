import view.*;
import repository.*;
import java.time.LocalDate;
import controller.*;
import model.*;

public class Main {
	public static void main(String[] args) {
		ProfessorRepository profRep = new ProfessorRepository();
		ProfessorView profVw = new ProfessorView();
		ProfessorController profCtr = new ProfessorController(profRep, profVw);
		AlunoRepository alRep = new AlunoRepository();
		AlunoView alVw = new AlunoView();
		AlunoController alCtr = new AlunoController(alRep, alVw);
		DisciplinaRepository dRep = new DisciplinaRepository();
		DisciplinaView dVw = new DisciplinaView();
		DisciplinaController dCtr = new DisciplinaController(dRep, dVw);
		
		profRep.add(new ProfessorVitalicio("Carlos", "abcd", "Doutorado", 2000, LocalDate.now()));
		alRep.add(new Aluno("Pablo", "123345444"));
		alRep.add(new Aluno("Pababa", "1asdadsa4"));
		
		dCtr.adicionarDisciplina(dVw.lerDadosDisciplinaObrigatoria(), profCtr.buscarPorMatricula());
		dCtr.adicionarDisciplina(dVw.lerDadosDisciplinaEletiva(), profCtr.buscarPorMatricula());
		dCtr.listarDisciplinas();
		alCtr.adcionarDisciplina(dCtr.buscarDisciplinaPorCodigo());
		alCtr.adcionarDisciplina(dCtr.buscarDisciplinaPorCodigo());
		dCtr.listarAlunosDisciplina();
		dCtr.removerDisciplina();
		dCtr.listarDisciplinas();
		
	}
}
