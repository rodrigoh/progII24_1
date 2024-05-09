package aulaOnze.exemploAcesso;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String mail;
	private int altura;

	public Pessoa(String nome, String sobrenome, String mail){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.mail = mail;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
//	public void setMail(String mail){
//		this.mail = mail;
//	}
	public void setAltura(int altura){
		this.altura = altura;
	}
	public String getNome(){
		return nome;
	}
	public String getSobrenome(){
		return sobrenome;
	}
	public String getMail(){
		return mail;
	}
	public int getAltura(){
		return altura;
	}

	public String getNomeCompleto(){
		return nome+" "+sobrenome;
	}
}
