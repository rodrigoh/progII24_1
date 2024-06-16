package aulaDezesseis;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		//Testando se a lista está vazia
		System.out.println("A lista está vazia? "+ nomes.isEmpty());
		//Adicionar elementos
		nomes.add("A");
		nomes.add("C");
		nomes.add("D");
		nomes.add("E");
		nomes.add("F");
		nomes.add(1,"B");
		//Mostrando a lista
		System.out.println(nomes);
		//Verificar se um elemento existe na lista
		System.out.println("A lista contém um 'A'? "+nomes.contains("A"));
		System.out.println("A lista contém um 'T'? "+nomes.contains("T"));
		//Testando se a lista está vazia
		System.out.println("A lista está vazia? "+ nomes.isEmpty());
		//Removendo um elemento pelo elemento
		System.out.println("Estou apagando o elemento 'B': "+nomes.remove("B"));
		System.out.println("Estou apagando o elemento 'T': "+nomes.remove("T"));
		//Remove o elemento pela posição
		System.out.println("Estou apagando o elemento da posição 1: "+nomes.remove(1));
		System.out.println(nomes);
		//Pegando um elemento da lista
		System.out.println("Qual elemento está na posição 1: "+nomes.get(1));
		//Obtendo a posição de um elemento na lista
		System.out.println("O elemento 'D' está na posição "+nomes.indexOf("D"));
		System.out.println("O elemento 'J' está na posição "+nomes.indexOf("J"));
		//Obtendo a posição da última ocorrência de um elemento
		nomes.add("D");
		System.out.println("A ultima ocorrência de 'D' na lista é na posição "+nomes.lastIndexOf("D"));
		System.out.println("A ultima ocorrência de 'A' na lista é na posição "+nomes.lastIndexOf("A"));
		//Descobrindo o tamanho da lista
		System.out.println("A lista tem atualmente "+nomes.size()+" elementos");
		//Ordenando minha lista
		nomes.add("B");
		nomes.add("C");
		System.out.println(nomes);
		nomes.sort(null);
		System.out.println(nomes);
		nomes.clear();
		System.out.println(nomes);
	}
}
