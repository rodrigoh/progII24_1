package aulaDoze.exemploEncapsulamento;

public class Conta {
	private String titular;
	private String identificador;
	private float saldo;

	public Conta(){

	}

	public Conta(String titular){
		this.titular = titular;
	}

	public Conta(String titular, String identificador){
		this.titular = titular;
		this.identificador = identificador;
		saldo = 0;
	}

	public float getSaldo(){
		return saldo;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public void setIdentificador(String identificador){
		this.identificador = identificador;
	}

	public String getTitular(){
		return titular;
	}

	public String getIdentificador(){
		return identificador;
	}

	boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	void depositar(float valor){
		saldo+=valor;
	}
}
