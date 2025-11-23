package repository;

import model.Professor;
import java.util.List;
import java.util.ArrayList;

public class ProfessorRepository {
	private List<Professor> professores = new ArrayList<>();
	
	public void add(Professor prof) {
		if(getByMatricula(prof.getMatricula()) == null) {
			professores.add(prof);			
		} else {
			//Implementar Erro
		}
	}
	
	public void rmv(Professor prof) {
		professores.remove(prof);
	}
	
	public Professor getByMatricula(String matricula) {
		for(Professor prof : professores) {
			if(prof.getMatricula().equals(matricula)) {
				return prof;
			}
		}
		return null;
	}
	
	public List<Professor> listar(){
		return professores;
	}
}
