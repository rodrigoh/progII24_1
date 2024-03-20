package aulaCinco.correcao;

import java.util.Scanner;

/*
Escreva um algoritmo que leia um número calcule e imprima a tabuada dele
(1 a 10)
 */
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 10: ");
		int num = ler.nextInt();

		for(int i = 1;i<=10;i++){
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}
