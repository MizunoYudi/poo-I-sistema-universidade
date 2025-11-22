package model;

import java.time.LocalDate;

public abstract class Professor {
	private String nome;
	private String matricula;
	private String titulacao;
	private double salario;
	private LocalDate dataContrato;
	
	public Professor(String nome, String matricula, String titulacao, double salario, LocalDate dataContrato) {
		this.nome = nome;
		this.matricula = matricula;
		this.titulacao = titulacao;
		this.salario = salario;
		this.dataContrato = dataContrato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}
}
