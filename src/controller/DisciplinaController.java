package controller;

import model.Disciplina;
import model.DisciplinaObrigatoria;
import model.DisciplinaEletiva;
import model.Professor;
import model.Aluno;
import view.DisciplinaView;
import repository.DisciplinaRepository;

public class DisciplinaController {
	private DisciplinaRepository rep = new DisciplinaRepository();
	private DisciplinaView vw = new DisciplinaView();
	
	public DisciplinaController(DisciplinaRepository rep, DisciplinaView vw) {
		this.rep = rep;
		this.vw = vw;
	}
	
	public void adicionarDisciplina(Disciplina d, Professor p) {
		if(d instanceof DisciplinaObrigatoria) {
			rep.add((DisciplinaObrigatoria) d);
		} else {
			rep.add((DisciplinaEletiva) d);
		}
		d.setProfessor(p);
	}
	
	public void listarDisciplinas() {
		vw.listarDisciplinas(rep.listar());
	}
	
	public void listarAlunosDisciplina() {
		Disciplina d = rep.getByCodigo(vw.buscarDisciplina());
		vw.listarAlunosDisciplina(d);
	}
	
	public void removerDisciplina() {
		Disciplina d = rep.getByCodigo(vw.buscarDisciplina());
		//Implementar escolha de delecao das disciplinas quando ha alunos e professor matriculados
		rep.rmv(d);
	}
	
	public void adicionarAluno( Aluno a) {
		Disciplina d = buscarDisciplinaPorCodigo();
		d.
	}
	
	public void removerDisciplinaProfessor(Professor p) {
		Disciplina d = rep.getByCodigo(vw.buscarDisciplina());
		if(vw.removerProfessor()) {
			d.setProfessor(null);
		}
	}
	
	public Disciplina buscarDisciplinaPorCodigo() { 
		return rep.getByCodigo(vw.buscarDisciplina());
	}
}
