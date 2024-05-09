package aulaOnze.exemploHerancaDois;

public class Funcionario extends Pessoa{
	private String setor;

	public Funcionario(String nome, String sobrenome){
		super(nome, sobrenome);
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
