package aulaDoze.exemploHeranca;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private int matricula;

	public Funcionario(String nome, String sobrenome, int matricula) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String obterDados(){
		return nome+" "+sobrenome+" - "+matricula;
	}

	@Override
	public String toString(){
		return nome+" "+sobrenome+" - "+matricula;
	}
}
