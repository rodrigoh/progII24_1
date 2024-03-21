package aulaCinco.exemplos;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Vetor de 10 posições com índices de 0 a 9
		//Vetores de número são inicializados com 0's automaticamente
		int[] lista = new int[10];
//		lista[0] = 1;
//		lista[1] = 2;
		for(int i = 0;i<10;i++){
			System.out.print("Digite um valor para lista["+i+"]: ");
			lista[i] = ler.nextInt();
		}
		System.out.println("\nDados no vetor...");
		for (int i = 0;i<10;i++){
			System.out.print(lista[i]+" ");
		}
		System.out.println();
	}
}
