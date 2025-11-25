package repository;

import model.Disciplina;
import model.Aluno;
import java.util.List;
import java.util.ArrayList;

public class DisciplinaRepository {
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public void add(Disciplina d) {
		if(getByCodigo(d.getCodigo()) == null) {
			disciplinas.add(d);			
		} else {
			// Implementar Erro
		}
	}
	
	public void rmv(Disciplina d) {
		disciplinas.remove(d);
	}
	
	public Disciplina getByCodigo(int cod) {
		for(Disciplina d : disciplinas) {
			if(d.getCodigo() == cod) {
				return d;
			}
		}
		return null;
	}
	
	// Implementar edicao de disciplina
	
	public List<Disciplina> listar(){
		return disciplinas;
	}
	
	public List<Aluno> listarAlunos(Disciplina d){
		return d.getAlunos();
	}
}
