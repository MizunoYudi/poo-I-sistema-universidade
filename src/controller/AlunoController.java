package controller;

import model.Aluno;
import view.AlunoView;
import repository.AlunoRepository;

public class AlunoController {
	private AlunoView vw = new AlunoView();
	private AlunoRepository rep = new AlunoRepository();
	
	public AlunoController(AlunoView vw, AlunoRepository rep) {
		this.vw = vw;
		this.rep = rep;
	}
	
	public void adicionarAluno(Aluno al) {
		rep.add(al);
	}
	
	public void listarAlunos() {
		vw.listarAlunos(rep.listar());
	}
	
	public void removerAluno(Aluno al) {
		rep.rmv(al);
	}
	
}
