package aulaDoze.exemploHerancaBanco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String titular, String identificador,
											 String senha,  float deposito){
		super(titular, identificador, senha);
		depositar(deposito);
	}

	public String verificaSaldo(){
		//return String.format("R$ %.2f",getSaldo());
		return String.format("R$ %.2f",super.getSaldo());
	}
}
