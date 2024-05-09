package aulaOnze.banco;

public class ContaPoupanca {
	private String titular;
	private String identificador;
	private float saldo;
	private String senha;

	public ContaPoupanca(String titular, String identificador, String senha,
								float saldo){
		this.titular = titular;
		this.identificador = identificador;
		this.senha = senha;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public float getSaldo() {
		return saldo;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public boolean sacar(float valor){
		if(saldo>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}
}
