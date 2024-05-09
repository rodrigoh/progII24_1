package aulaOnze.exemploHerancaDois;

public class Professor extends Pessoa{
	private String formacao;
	private String curso;

	public Professor(String nome, String sobrenome){
		super(nome,sobrenome);
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
