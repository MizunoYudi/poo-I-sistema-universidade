package repository;

import model.Aluno;
import model.Disciplina;
import java.util.List;
import java.util.ArrayList;

public class AlunoRepository {
	private List<Aluno> alunos = new ArrayList<>();
	
	public void add(Aluno al) {
		if(getByCpf(al.getCpf()) == null) {
			alunos.add(al);			
		} else {
			//Implementar Erro
		}
	}
	
	public void rmv(Aluno al) {
		alunos.remove(al);
	}
	
	public Aluno getByCpf(String cpf) {
		for(Aluno a : alunos) {
			if(a.getCpf().equals(cpf)) {
				return a;
			}
		}
		return null;
	}
	
	public List<Aluno> listar(){
		return alunos;
	}
	
	public void addDisciplina(Aluno al, Disciplina d) {
		al.getDisciplinas().add(d);
	}
	
	public void rmvDisciplina(Aluno al, Disciplina d) {
		al.getDisciplinas().remove(d);
	}
}
