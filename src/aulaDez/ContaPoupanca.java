package aulaDez;

public class ContaPoupanca {
	String titular;
	String identificador;
	float saldo;
	String senha;

	ContaPoupanca(String titular, String identificador, String senha,
								float saldo){
		this.titular = titular;
		this.identificador = identificador;
		this.senha = senha;
		this.saldo = saldo;
	}

	void depositar(float valor){
		saldo+=valor;
	}

	boolean sacar(float valor){
		if(saldo>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}
}
