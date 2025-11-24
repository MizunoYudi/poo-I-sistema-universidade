package model;

import java.util.List;
import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private int codigo;
	private int cargaHoraria;
	private List<Aluno> alunos = new ArrayList<>();
	private Professor professor;
	
	public Disciplina(String nome, int codigo, int cargaHoraria) {
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	/* Removendo setter de alunos temporariamente por questão de segurança,
	 * (garantindo que a lista de alunos não seja sobrescrita por outra lista).
	
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	*/

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
