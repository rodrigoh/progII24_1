package aulaDoze.exemploHeranca;

import java.util.Objects;

public class Engenheiro extends Funcionario{
	private String crea;

	public Engenheiro(String nome, String sobrenome, int matricula, String crea) {
		super(nome, sobrenome, matricula);
		this.crea = crea;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}
	
}
