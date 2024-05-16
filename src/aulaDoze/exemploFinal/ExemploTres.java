package aulaDoze.exemploFinal;

public class ExemploTres{

	public float soma(float n1, float n2){
		return n1+n2;
	}

	public float soma(float[] lista){
		float soma = 0;
		for(int i=0;i<lista.length;i++){
			soma+=lista[i];
		}
		return soma;
	}

	public String soma(String s1, String s2){
		return s1+" "+s2;
	}

}
