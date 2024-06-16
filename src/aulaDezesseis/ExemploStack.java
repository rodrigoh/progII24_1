package aulaDezesseis;

import java.util.Stack;

public class ExemploStack {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		pilha.push("base da pilha");
		pilha.push("elemento 1");
		pilha.push("elemento 2");
		pilha.push("topo");
		System.out.println(pilha.peek());
		System.out.println(pilha);
		System.out.println(pilha.pop());
		System.out.println(pilha);


	}
}
