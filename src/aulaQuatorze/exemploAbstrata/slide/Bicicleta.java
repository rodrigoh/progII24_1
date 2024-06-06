package aulaQuatorze.exemploAbstrata.slide;

public class Bicicleta extends Veiculo{
	@Override
	public float acelerar() {
		velocidade++;
		System.out.println("Bicicleta acelerando...");
		return velocidade;
	}

	@Override
	public void parar() {
		velocidade = 0;
		System.out.println("Bicicleta parada!");
	}
}
