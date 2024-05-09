package aulaOnze.banco;

public class ContaCorrente {
	private String titular;
	private String identificador;
	private float saldo;
	private float limite;
	private String senha;

	public ContaCorrente(String titular, String identificador, String senha,
								float limite){
		this.identificador = identificador;
		this.titular = titular;
		this.senha = senha;
		this.limite = limite;
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

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public boolean sacar(float valor){
		if(saldo+limite>=valor){
			//saldo = saldo - valor;
			saldo-=valor;
			return true;
		}
		return false;
	}

	public String verificaSaldo(){
		String retorno = "O saldo atual da conta "+identificador+" é:\n";
		retorno +="R$"+String.format("%.2f",saldo);
		retorno +="\nLimite disponível: \n";
		if(saldo>0){
			retorno+="R$"+String.format("%.2f",limite);
		}
		else{
			retorno+="R$"+String.format("%.2f",limite+saldo);
		}
		return retorno;
	}
}
