package aulaQuatorze.exemploAbstrata.slide;

public class Automovel extends Veiculo{
	@Override
	public float acelerar() {
		velocidade+=2;
		System.out.println("Automóvel acelerando...");
		return velocidade;
	}

	@Override
	public void parar() {
		velocidade = 0;
		System.out.println("Automóvel parado");
	}

	public void trocarOleo(float litros){
		System.out.println("Trocando o óleo...");

	}
}
