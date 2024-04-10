package aulaSete.exemplos;

import java.util.Random;

public class Exemplo4 {
	public static int somaVetor(int[] vetor){
		int soma=0;
		for(int i=0;i<vetor.length;i++){
			soma = soma+vetor[i];
		}
		return soma;
	}

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] lista = new int[5];
		for(int i=0;i<lista.length;i++){
			lista[i] = aleatorio.nextInt(10);
			System.out.print(lista[i]+" ");
		}
		//Chamando o método criado
		int soma = somaVetor(lista);
		System.out.println("\nA soma dos elementos da lista vale "+soma);
	}
}
