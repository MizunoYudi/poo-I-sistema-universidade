package controller;

import model.Aluno;
import model.Disciplina;
import view.AlunoView;
import repository.AlunoRepository;

public class AlunoController {
	private AlunoView vw = new AlunoView();
	private AlunoRepository rep = new AlunoRepository();
	
	public AlunoController(AlunoRepository rep, AlunoView vw) {
		this.vw = vw;
		this.rep = rep;
	}
	
	public void adicionarAluno(Aluno al) {
		rep.add(al);
	}
	
	public void adcionarDisciplina(Disciplina d) {
		Aluno a = rep.getByCpf(vw.getCPF());
		rep.addDisciplina(a, d);
	}
	
	public void removerDisciplina(Disciplina d) {
		Aluno a = rep.getByCpf(vw.getCPF());
		rep.rmvDisciplina(a, d);
	}
	
	public void listarAlunos() {
		vw.listarAlunos(rep.listar());
	}
	
	public void removerAluno() {
		Aluno aluno = rep.getByCpf(vw.removerAluno());
		rep.rmv(aluno);
	}
}
