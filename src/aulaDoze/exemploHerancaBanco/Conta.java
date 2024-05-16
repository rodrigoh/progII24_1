package aulaDoze.exemploHerancaBanco;

public class Conta {
	private String identificador;
	private String titular;
	private float saldo;
	private String senha;

	public Conta(String titular, String identificador,String senha){
		this.identificador = identificador;
		this.titular = titular;
		this.senha = senha;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	public float getSaldo(){
		return saldo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
