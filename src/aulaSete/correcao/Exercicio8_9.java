package aulaSete.correcao;

import java.util.Random;

/*
8 - Leia uma matriz de 5x5 elementos. Calcule a soma dos
elementos que estão na diagonal principal.

9 -  Calcule a soma dos
elementos que estão acima da diagonal principal.
a soma dos elementos que estão abaixo da diagonal
principal.

 */
public class Exercicio8_9 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];
		int somaAcima = 0;
		int somaAbaixo = 0;
		int somaD = 0;
		for(int l=0;l<5;l++){
			for(int c=0;c<5;c++){
				matriz[l][c] = aleatorio.nextInt(1,100);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		for(int l=0;l<5;l++) {
			for (int c=0;c<5;c++) {
				if(l==c){
					somaD+=matriz[l][c];
				}
				if(l<c){
					somaAcima+=matriz[l][c];
				}
				if(l>c){
					somaAbaixo+=matriz[l][c];
				}

			}
		}
		System.out.println("As somas valem:");
		System.out.println("Elementos da diagonal "+somaD);
		System.out.println("Elementos acima da diagonal "+somaAcima);
		System.out.println("elementos abaixo da diagonal "+somaAbaixo);
	}
}
