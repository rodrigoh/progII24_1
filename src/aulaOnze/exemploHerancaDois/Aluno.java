package aulaOnze.exemploHerancaDois;

public class Aluno extends Pessoa{
	private String matricula;

	public Aluno(String nome, String sobrenome, String matricula){
		super(nome,sobrenome);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
