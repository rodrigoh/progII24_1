package aulaTres.correcao;

import java.util.Scanner;
/*
Uma equipe de Fórmula 1 deseja calcular o número mínimo de litros que deverá
colocar no tanque de seu carro para que ele possa percorrer um determinado número
de voltas até o primeiro reabastecimento. Escreva um programa que leia o
comprimento da pista (em metros), o número total de voltas a serem percorridas
no grande prêmio, o número de reabastecimentos desejados e o consumo de
combustível do carro (em Km/L). Calcular e escrever o número mínimo de
litros necessários para percorrer até o primeiro reabastecimento.
Observação: Considere que o número de voltas entre os reabastecimentos é o mesmo.
 */
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o comprimento da pista em metros: ");
		float comprimento = ler.nextFloat()/1000;
		System.out.print("Qual a quantidade de voltas do GP: ");
		int nVoltas = ler.nextInt();
		System.out.print("Qual o número de abastecimentos: ");
		int abastece = ler.nextInt();
		System.out.print("Qual a autonomia do carro: ");
		float autonomia = ler.nextFloat();
		float distancia = comprimento*nVoltas;
		float quantLitros = distancia/autonomia;
		float qLitrosAbast = quantLitros/abastece;
		System.out.printf("Para percorrer %.2f km do GP serão usados %.2f litros de combustível\n",distancia,quantLitros);
		System.out.printf("A cada abastecimento serão necessários %.2f litros\n",qLitrosAbast);

	}
}
