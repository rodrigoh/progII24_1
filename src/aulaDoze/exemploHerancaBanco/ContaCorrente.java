package aulaDoze.exemploHerancaBanco;

public class ContaCorrente extends Conta{
	private float limite;

	public ContaCorrente(String titular, String identificador, String senha,
											 float limiteInicial){
		super(titular,identificador,senha);
		limite = limiteInicial;
	}

	@Override
	public boolean sacar(float valor){
		if(getSaldo()+limite>=valor){
			sacar(valor);
			return true;
		}
		return false;
	}

	String verificaSaldo(){
		String retorno = "O saldo atual da conta "+getIdentificador()+" é:\n";
		retorno +="R$"+String.format("%.2f",getSaldo());
		retorno +="\nLimite disponível: \n";
		if(getSaldo()>0){
			retorno+="R$"+String.format("%.2f",limite);
		}
		else{
			retorno+="R$"+String.format("%.2f",limite+getSaldo());
		}
		return retorno;
	}

}
