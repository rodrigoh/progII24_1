package aulaCinco.exemplos;

import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		int[] lista = new int[10];
		Scanner ler = new Scanner(System.in);
		//Descobrindo o tamanho de um vetor;
		int tam = lista.length;
		System.out.println("O tamanho do vetor é "+tam);
		for(int i=0;i<lista.length;i++){
			System.out.print("Digite um valor para vetor["+i+"]: ");
			lista[i] = ler.nextInt();
		}
		//for simplificado ou para cada
		for(int valor:lista){
			System.out.print(valor+" ");
		}
	}
}
