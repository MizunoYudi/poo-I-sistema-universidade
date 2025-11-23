package repository;

import model.Aluno;
import java.util.List;
import java.util.ArrayList;

public class AlunoRepository {
	private List<Aluno> alunos = new ArrayList<>();
	
	public void add(Aluno al) {
		alunos.add(al);
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
}
