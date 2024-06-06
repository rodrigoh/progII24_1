package aulaQuatorze.exemploAbstrata;

public class Quadrado extends Figura{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado*lado;
	}

	@Override
	public double calculaPerimetro() {
		return 4*lado;
	}
}
