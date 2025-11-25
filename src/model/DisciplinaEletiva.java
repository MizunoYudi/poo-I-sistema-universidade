package model;

public class DisciplinaEletiva extends Disciplina{
	private int interesse;

	public DisciplinaEletiva(String nome, int codigo, int cargaHoraria, int interesse) {
		super(nome, codigo, cargaHoraria);
		this.interesse = interesse;
	}

	public int getInteresse() {
		return interesse;
	}

	public void setInteresse(int interesse) {
		this.interesse = interesse;
	}
}
