package model;

import java.time.LocalDate;

public class ProfessorSubstituto extends Professor{
	private int horasAulas;
	private LocalDate dataFinalContrato;

	public ProfessorSubstituto(String nome, String matricula, String titulacao, double salario,
			LocalDate dataContrato, int horasAulas, LocalDate dataFinalContrato) {
		super(nome, matricula, titulacao, salario, dataContrato);
		this.horasAulas = horasAulas;
		this.dataFinalContrato = dataFinalContrato;
	}
	
	@Override
	public double calcularSalario() {
		return getSalario() * horasAulas;
	}

	public int getHorasAulas() {
		return horasAulas;
	}

	public void setHorasAulas(int horasAulas) {
		this.horasAulas = horasAulas;
	}

	public LocalDate getDataFinalContrato() {
		return dataFinalContrato;
	}

	public void setDataFinalContrato(LocalDate dataFinalContrato) {
		this.dataFinalContrato = dataFinalContrato;
	}
}
