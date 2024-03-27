package aulaSeis.correcao;

import java.util.Scanner;
/*
Ler dois vetores, A e B com um número variável de conteúdo
(números) (no máximo 10). O programa deve solicitar antes
da leitura dos vetores a quantidade de dados a serem lidos
(1 a 10), os dois vetores terão o mesmo número de elementos.
Gerar um terceiro vetor chamado Soma (de no máximo 10
elementos) que seja a soma dos dados do vetor A com os do
vetor B.
 */
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanho;
		do {
			System.out.print("Digite um número entre 1 e 10: ");
			tamanho = ler.nextInt();
		}
		while(tamanho<1 || tamanho>10);
		int[] vetorA = new int[tamanho];
		int[] vetorB = new int[tamanho];
		int[] soma = new int[tamanho];
		for(int i=0;i< vetorA.length;i++){
			System.out.print("vetorA["+i+"]: ");
			vetorA[i] = ler.nextInt();
		}
		System.out.println("-------------");
		for(int i=0;i< vetorB.length;i++){
			System.out.print("vetorB["+i+"]: ");
			vetorB[i] = ler.nextInt();
		}
		System.out.println("Soma dos vetores:");
		for(int i=0;i<soma.length;i++){
			soma[i] = vetorA[i]+vetorB[i];
			System.out.println(vetorA[i]+" + "+vetorB[i]+" = "+soma[i]);
		}
	}
}
