package model;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String cpf;
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
}
