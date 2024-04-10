package aulaSete.correcao;

import java.util.Random;

/*
Ler duas matrizes, A 4x6 e B 4x6, e criar:
a) uma matriz S que seja a soma de A e B (A+B)
b) uma matriz D que seja a diferença de A e B (A-B)
 Escrever as matrizes S e D
 */
public class Exercicio5 {
	public static void main(String[] args) {
		Random aleatoria = new Random();
		int[][] ma = new int[4][6];
		int[][] mb = new int[4][6];
		int[][] ms = new int[4][6];
		int[][] md = new int[4][6];
		System.out.println("Dados na matriz A");
		for(int l=0;l<4;l++){
			for(int c=0;c<6;c++){
				ma[l][c] = aleatoria.nextInt(1,50);
				System.out.printf("%02d ",ma[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nDados na matriz B");
		for(int l=0;l<4;l++){
			for(int c=0;c<6;c++){
				mb[l][c] = aleatoria.nextInt(1,50);
				System.out.printf("%02d ",mb[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nA soma das matrizes vale: ");
		for(int l=0;l<4;l++) {
			for (int c=0;c<6;c++) {
				ms[l][c] = ma[l][c]+mb[l][c];
				System.out.printf("%02d ",ms[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nA diferença das matrizes vale: ");
		for(int l=0;l<4;l++) {
			for (int c=0;c<6;c++) {
				md[l][c] = ma[l][c]-mb[l][c];
				System.out.printf("%02d ",md[l][c]);
			}
			System.out.println();
		}
	}
}
