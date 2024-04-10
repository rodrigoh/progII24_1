package aulaSete.exemplos;

import java.util.Scanner;

/*
Crie um programa que tenha um método para calcular a
média de um aluno que tenha 3 notas. Devolver o resultado
para o método principal e mostrar na tela.
 */
public class Exemplo2 {
	public static float calculaMedia(float n1, float n2, float n3){
		float media = (n1+n2+n3)/3;
		return media;
	}
	public static void mostraStatus(String nome, float media){
		if(media>=8){
			System.out.println(nome+" está aprovado com média "+media);
		}
		else if(media>=5){
			System.out.println(nome+" está em recuperação com média "+media);
		}
		else{
			System.out.println(nome+" está reprovado com média "+media);
		}
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Qual o nome do aluno: ");
			String nome = ler.next();
			System.out.print("Digite a primeira nota: ");
			float n1 = ler.nextFloat();
			System.out.print("Digite a segunda nota: ");
			float n2 = ler.nextFloat();
			System.out.print("Digite a terceira nota: ");
			float n3 = ler.nextFloat();
			float media = calculaMedia(n1, n2, n3);
			mostraStatus(nome, media);
			System.out.print("Tem mais aluno s = sim n = não");
			resp = ler.next().toLowerCase().charAt(0);
		}
		while (resp=='s');
	}
}
