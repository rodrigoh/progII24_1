package aulaQuatorze.exemploAbstrata.slide;

public abstract class Veiculo {
	protected float velocidade;
	public abstract float acelerar();
	public abstract void parar();

	public float obterVelocidade(){
		return velocidade;
	}


}
