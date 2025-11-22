package controller;

import repository.ProfessorRepository;
import view.ProfessorView;
import model.Professor;
import model.ProfessorVitalicio;
import model.ProfessorSubstituto;

public class ProfessorController {
	private ProfessorRepository rep;
	private ProfessorView vw;
	
	public ProfessorController(ProfessorRepository rep, ProfessorView vw) {
		this.rep = rep;
		this.vw = vw;
	}
	
	public void adicionarProfessor(Professor prof) {
		if(prof instanceof ProfessorVitalicio) {
			rep.add((ProfessorVitalicio)prof);
		} else {
			rep.add((ProfessorSubstituto)prof);
		}
	}
	
	public void listarProfessores() {
		vw.listarProfessores(rep.listar());
	}
	
	public void removerProfessor() {
		Professor prof = rep.getByMatricula(vw.removerProfessor());
		rep.rmv(prof);
	}
	
	public void exibirSalario() {
		Professor prof = rep.getByMatricula(vw.removerProfessor());
		System.out.print(prof.getSalario());
	}
}
