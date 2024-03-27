package aulaSeis.correcao;

import java.util.Random;

/*
Declarar um vetor números com 20 elementos, gerar valores
inteiros para ele aleatoriamente. Declare outros dois vetores,
par e impar. No vetor par armazenar todos os elementos pares
do vetor números. No vetor ímpar armazenar todos os elementos
ímpares de números. Imprima os dois vetores.
 */
public class Exercicio5 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int contP = 0;
		int contI = 0;
		for(int i=0;i< vetor.length;i++){
			vetor[i] = aleatorio.nextInt(40);
			System.out.print(vetor[i]+" ");
			if(vetor[i]%2==0){
				par[contP] = vetor[i];
				contP++;
			}
			else{
				impar[contI] = vetor[i];
				contI++;
			}
		}
		System.out.println("\nVetor de pares...");
		for(int i=0;i<contP;i++){
			System.out.print(par[i]+" ");
		}
		System.out.println("\nVetor de impares...");
		for(int i=0;i<contI;i++){
			System.out.print(impar[i]+" ");
		}
	}
}
