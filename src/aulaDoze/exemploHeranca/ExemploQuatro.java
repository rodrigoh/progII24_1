package aulaDoze.exemploHeranca;

public class ExemploQuatro {
	private String nome;
	private String sobrenome;

	public ExemploQuatro(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString(){
		return nome+" "+sobrenome;
	}

}
