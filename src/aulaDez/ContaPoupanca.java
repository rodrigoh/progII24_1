package aulaDez;

public class ContaPoupanca {
	String titular;
	String identificador;
	float saldo;

	ContaPoupanca(){

	}

	ContaPoupanca(String identificador, float saldo){
		this.identificador = identificador;
		this.saldo = saldo;
	}

	ContaPoupanca(String titular, String identificador, float saldo){
		this.titular = titular;
		this.identificador = identificador;
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
