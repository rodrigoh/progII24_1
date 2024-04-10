package aulaSete.correcao;

import java.util.Scanner;

/*
Ler 6 números inteiros para preencher uma matriz D 2x3,
ou seja, com 2 linhas e 3 colunas (considere que não serão
informados valores duplicados). A seguir, ler um número
 inteiro X e escrever uma mensagem indicando se o valor de
 X existe ou não na matriz D
 */
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[2][3];
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[0].length;c++){
				System.out.print("matriz["+l+"]["+c+"]: ");
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.print("Ok, agora informe mais número: ");
		int vx = ler.nextInt();
		boolean achei = false;
		for(int l=0;l< matriz.length;l++) {
			for (int c = 0; c < matriz[0].length; c++) {
				if(vx==matriz[l][c])
					achei = true;
			}
		}
		if(achei)
			System.out.println(vx+" está na matriz");
		else
			System.out.println(vx+" não está na matriz");
	}
}
