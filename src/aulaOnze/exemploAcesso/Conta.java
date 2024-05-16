package aulaOnze.exemploAcesso;

public class Conta {
	public String titular;
	public String identificador;
	private float saldo;
	static String nomeBanco;

	public Conta(String titular, String identificador){
		this.identificador = identificador;
		this.titular = titular;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public String verificaSaldo(){
		return String.format("R$ %.2f",saldo);
	}

	public boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}


}
