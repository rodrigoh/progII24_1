package aulaSete.correcao;

import java.util.Random;

/*
Carregar uma matriz SOMA 4x4, calcular e escrever as
seguintes somas:
a) da linha 3 (posição 2)
b) da coluna 2 (posição 1)
c) de todos os elementos da matriz
 */
public class Exercicio3 {
	public static void main(String[] args) {
		Random aleatorio =  new Random();
		int[][] soma = new int[4][4];
		int somaL = 0;
		int somaC = 0;
		for(int l=0;l<4;l++){
			for(int c=0;c<4;c++){
				soma[l][c] =aleatorio.nextInt(1, 40);
				if(l==2){
					somaL+=soma[l][c];
				}
				if(c==1){
					somaC+=soma[l][c];
				}
				System.out.printf("%02d ",soma[l][c]);
			}
			System.out.println();
		}
		System.out.println("A soma dos elementos da linha 3 vale "+somaL);
		System.out.println("A soma dos elementos da coluna 2 vale "+somaC);

	}
}
