package aulaSeis.correcao;

import java.util.Random;
import java.util.Scanner;

/*
Ler um vetor de 10 elementos inteiros. Após isto, imprimir
na tela os 10 valores lidos e o usuário poderá escolher um
destes valores para ser excluído do vetor. Ler o valor
escolhido e eliminá-lo do vetor. No momento da exclusão
todos os valores posteriores ao valor escolhido deverão
ser reorganizados (movidos uma posição para esquerda) a
fim de que o vetor resultante não fique com um espaço
em branco. Imprimir o novo vetor.
 */
public class Exemplo11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		int tamanho = vetor.length;
		System.out.println("\nDados no vetor\n");
		for(int i=0;i<tamanho;i++){
			vetor[i] = aleatorio.nextInt(20);
			System.out.print(vetor[i]+" ");
		}
		//Escolhendo o número para remover
		System.out.print("\nDos número acima qual deseja remover: ");
		int remover = ler.nextInt();
		//Pesquisando na lista pelo número
		int posicao = -1;
		for(int i=0;i<tamanho;i++){
			if(vetor[i]==remover)
				posicao = i;
		}
		//Remover o elemento
		if(posicao>=0){
			for(int i=posicao;i<tamanho-1;i++){
				vetor[i] = vetor[i+1];
			}
			tamanho--;
			System.out.println("\nDados no vetor...");
			for(int i=0;i<tamanho;i++){
				System.out.print(vetor[i]+" ");
			}
		}
		else{
			System.out.println(remover+" não está no vetor");
		}
	}
}
