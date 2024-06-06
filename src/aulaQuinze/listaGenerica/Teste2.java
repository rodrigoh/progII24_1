package aulaQuinze.listaGenerica;

public class Teste2 {
	public static void main(String[] args) {
		Lista<Integer> l2 = new Lista<>(10);
		l2.adiciona(1);
		l2.adiciona(2);
		l2.adiciona(4);
		l2.adiciona(5);
		l2.adiciona(10);
		System.out.println(l2);

	}
}
