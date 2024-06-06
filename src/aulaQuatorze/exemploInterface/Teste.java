package aulaQuatorze.exemploInterface;

public class Teste {
	public static void main(String[] args) {
		Vetor v1 = new Vetor();
		v1.adiciona(1);
		v1.adiciona(2);
		System.out.println(v1.obterLista());
		System.out.println("O tamanho da lista é "+v1.obterTamanho());
		System.out.println(v1.remove());
		System.out.println(v1.obterLista());
		System.out.println("O tamanho da lista é "+v1.obterTamanho());
	}
}
