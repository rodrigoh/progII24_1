package aulaCinco.correcao;

import java.util.Scanner;

/*
Escreva um algoritmo que leia três notas de um aluno e
calcule sua média. Ao final do algoritmo pergunte se
deseja efetuar o cálculo para mais algum aluno. Se o
usuário receber digitar S, leia novamente as três notas
até que o usuário responda não.

 */
public class Exercicio6OpcString {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String resp;
		do{
			System.out.print("Digite a primeira nota do aluno: ");
			float n1 = ler.nextFloat();
			System.out.print("Digite a segunda nota do aluno: ");
			float n2 = ler.nextFloat();
			System.out.print("Digite a terceira nota do aluno: ");
			float n3 = ler.nextFloat();
			float media = (n1+n2+n3)/3;
			System.out.println("A média do aluno é "+String.format("%.2f", media));
			System.out.print("Tem mais alunos (S - Sim / N - Não) ");
			resp = ler.next().toLowerCase();
		}
		while(resp.equals("s"));
	}
}
