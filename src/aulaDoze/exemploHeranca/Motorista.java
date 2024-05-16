package aulaDoze.exemploHeranca;

public class Motorista extends Funcionario{
	private String cnh;

	public Motorista(String nome, String sobrenome, int matricula) {
		super(nome, sobrenome, matricula);
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public String obterDados(){
		//Caso queira chamar o método obterDados da classe pai
		//String retorno = super.obterDados();
		String retorno = "";
		retorno += "Nome: "+getNome()+" "+getSobrenome();
		retorno += "\nMatricula: "+getMatricula();
		retorno += "\nCNH: "+cnh;
		return retorno;
	}
}
