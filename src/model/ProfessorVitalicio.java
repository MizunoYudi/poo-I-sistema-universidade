package model;

import java.time.LocalDate;

public class ProfessorVitalicio extends Professor{	
	public ProfessorVitalicio(String nome, String matricula, String titulacao, double salario, LocalDate dataContrato) {
		super(nome, matricula, titulacao, salario, dataContrato);
	}
	
	@Override
	public double calcularSalario() {
		double salario = getSalario();
		
		if(getTitulacao().equals("DOUTORADO")) {
			salario += salario*20/100;
		}
		
		return salario;
	}
}
