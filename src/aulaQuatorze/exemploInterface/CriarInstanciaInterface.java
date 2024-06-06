package aulaQuatorze.exemploInterface;

public class CriarInstanciaInterface {
	public static void main(String[] args) {
		Lista l1 = new Vetor();
		l1.adiciona(1);
		l1.obterElemento();
		l1.remove();
		//O método obterLista existe apenas na classe Vetor e não na Interface Lista
		//l1.obterLista();
	}
}
