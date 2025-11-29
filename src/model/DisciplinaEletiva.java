package model;

public class DisciplinaEletiva extends Disciplina{
	private int interesse;

	public DisciplinaEletiva(String nome, int codigo, int cargaHoraria) {
		super(nome, codigo, cargaHoraria);
		this.interesse = 0;
	}

	public int getInteresse() {
		return interesse;
	}

	public void setInteresse(int interesse) {
		this.interesse = interesse;
	}
}
