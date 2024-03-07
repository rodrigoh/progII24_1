package aulaTres.correcao;

import java.util.Scanner;

/*
Escreva um programa para ler as dimensões de uma cozinha
retangular (comprimento, largura e altura), calcular e
escrever a quantidade de caixas de azulejos para se colocar
 em todas as suas paredes. Também deve ser lido um valor
 equivalente a área das Janelas e portas para descontar da
 área total. Cada caixa de azulejos possui 1,5 m2.
 */
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Sobre a cozinha informe:");
		System.out.print("Largura: ");
		float largura = ler.nextFloat();
		System.out.print("Comprimento: ");
		float comprimento = ler.nextFloat();
		System.out.print("Altura: ");
		float altura = ler.nextFloat();
		System.out.print("Área ocupada por aberturas: ");
		float areaAbertura = ler.nextFloat();
		float areaT = (comprimento*altura+largura*altura)*2;
		areaT-=areaAbertura;
		float quantCaixas = areaT/(float)1.5;
		//Math.floot()
		quantCaixas = (float) Math.ceil(quantCaixas);
		System.out.printf("Para cobrir os %.2f m² de parede serão necessárias %.2f " +
						"caixas de azulejos.",areaT,quantCaixas);

	}
}
