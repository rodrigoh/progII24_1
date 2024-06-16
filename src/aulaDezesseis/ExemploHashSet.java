package aulaDezesseis;

import java.util.HashSet;

public class ExemploHashSet {
	public static void main(String[] args) {
		HashSet<String> listaCompras = new HashSet<>();
		System.out.println("Arroz "+listaCompras.add("Arroz"));
		System.out.println("Feijão "+listaCompras.add("Feijão"));
		System.out.println("Azeite "+listaCompras.add("Azeite"));
		System.out.println("Arroz "+listaCompras.add("Arroz"));
		System.out.println(listaCompras);
		listaCompras.remove("Feijão");
		System.out.println(listaCompras);

;	}
}
