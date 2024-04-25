package aulaDez;

public class ContaCorrente {
	String titular;
	String identificador;
	float saldo;
	float limite;
	String senha;

	ContaCorrente(String titular, String identificador, String senha,
								float limite){
		this.identificador = identificador;
		this.titular = titular;
		this.senha = senha;
		this.limite = limite;
	}

	void depositar(float valor){
		saldo+=valor;
	}

	boolean sacar(float valor){
		if(saldo+limite>=valor){
			//saldo = saldo - valor;
			saldo-=valor;
			return true;
		}
		return false;
	}

	String verificaSaldo(){
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
