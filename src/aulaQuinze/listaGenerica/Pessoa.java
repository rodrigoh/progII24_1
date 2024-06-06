package aulaQuinze.listaGenerica;

public class Pessoa {
	private String nome;
	private String eMail;

	public Pessoa(String nome, String eMail) {
		this.nome = nome;
		this.eMail = eMail;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "nome=" + nome +", eMail=" + eMail;
	}
}
