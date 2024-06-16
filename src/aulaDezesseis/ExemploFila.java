package aulaDezesseis;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("A");
		fila.add("B");
		fila.add("C");
		fila.add("D");
		System.out.println(fila);
		System.out.println("Quem é o próximo? "+fila.peek());
		System.out.println("Atendendo o elemento "+fila.poll());
		System.out.println(fila);
	}
}
