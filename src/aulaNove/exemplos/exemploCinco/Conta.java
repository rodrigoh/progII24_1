package aulaNove.exemplos.exemploCinco;

public class Conta {
	String titular;
	String identificador;
	float saldo;

	public Conta(String identificador, String titular){
		this.identificador = identificador;
		this.titular = titular;
		saldo = 0;
	}

	void definirTitular(String titular) {
		this.titular = titular;
	}

	boolean sacar(float valor){
		if(saldo >= valor){
			saldo -= valor;
			return true;
		}
		return false;
	}

	void depositar(float valor){
		saldo+=valor;
	}
}
