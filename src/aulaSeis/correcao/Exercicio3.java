package aulaSeis.correcao;

import java.util.Random;

/*Ler um vetor de números, de 10 elementos. Declarar outro
vetor inverso, copiar todos os elementos de números de trás
para frente para o vetor inverso.
 */
public class Exercicio3 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		int[] vetorI = new int[10];

		System.out.println("Dados no vetor...");
		for(int i=0;i< vetor.length;i++){
			vetor[i] = aleatorio.nextInt(30);
			System.out.print(vetor[i]+" ");
		}

		System.out.println("\nInvertendo o vetor...");
		for(int i=0, j=9;i<vetor.length;i++, j--){
			vetorI[i] = vetor[j];
			System.out.print(vetorI[i]+" ");
		}

		System.out.println("\nInvertendo o vetor opc 2...");
		for(int i=0;i<vetor.length;i++){
			vetorI[i] = vetor[9-i];
			System.out.print(vetorI[i]+" ");
		}

	}
}
