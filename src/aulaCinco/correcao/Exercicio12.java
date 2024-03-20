package aulaCinco.correcao;

import java.util.Scanner;

/*
Escreva um algoritmo que leia um número e diga se ele é primo ou não.
 */
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		long numero = ler.nextInt();
		int contDiv = 0;
		for(long i=1;i<=numero;i++){
			if(numero%i==0)
				contDiv++;
		}
		if(contDiv==2)
			System.out.println(numero+" é primo");
		else
			System.out.println(numero+" não é primo");
	}
}
