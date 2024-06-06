package aulaQuinze.listaGenerica;

public class Teste {
	public static void main(String[] args) {
		Lista l1 = new Lista(3);
		System.out.println("O tamanho da lista é "+l1.obterTamanho());
		System.out.println(l1);
		l1.adiciona("A");
		l1.adiciona("B");
		l1.adiciona("C");
		l1.adiciona("D");
		l1.adiciona("E");
		l1.adiciona("F");
		l1.adiciona("G");
		l1.adiciona("H");
		System.out.println(l1);
		System.out.println("Removendo o elemento "+l1.remove());
		System.out.println(l1);
		l1.adiciona("T");
		System.out.println(l1);
		System.out.println("O elemento E está na posição "+l1.posicaoDe("E"));
		l1.remove(4);
		System.out.println(l1);
		l1.adiciona(4,"E");
		System.out.println(l1);

	}
}
