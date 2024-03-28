package aulaSeis.exemplosMatrizes;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[][] nome = new tipo[n_linhas][n_colunas]
		int[][] matriz = new int[4][5];
		for(int l=0;l<4;l++){
			for(int c=0;c<5;c++){
				System.out.print("Matriz["+l+"]["+c+"]: ");
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.println("\nDados na matriz...");
		for(int l=0;l<4;l++){
			for(int c=0;c<5;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
	}
}
