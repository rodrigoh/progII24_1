package aulaCinco.correcao;

import java.util.Scanner;
/*
Escreva um algoritmo que leia 10 valores e conte quantos deles estão no
intervalo entre 10 e 20. Depois escreva essa informação
 */
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cont=0;
		for(int i=0;i<10;i++){
			System.out.print("Digite um número: ");
			int num = ler.nextInt();
			if(num>10 && num<20){
				cont++;
			}
		}
		System.out.println("Dos números digitados estão entre 10 e 20 "+cont);
	}
}
