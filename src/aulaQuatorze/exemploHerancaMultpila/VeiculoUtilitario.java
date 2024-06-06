package aulaQuatorze.exemploHerancaMultpila;

public class VeiculoUtilitario implements VeiculoCarga, VeiculoPasseio{
	@Override
	public void carregar() {
		System.out.println("Carregando...");
	}

	@Override
	public void descarregar() {
		System.out.println("Descarregando");
	}

	@Override
	public void embarcarPassageiro() {
		System.out.println("Embarcando passageiro...");
	}

	@Override
	public void desembarcarPassageiro() {
		System.out.println("Desembarcando...");
	}

	@Override
	public void andar() {
		System.out.println("Veículo andando...");
	}

	@Override
	public void parar() {
		System.out.println("Veículo parado");
	}
}
