package aulaTres.correcao;
/*
Um motorista de táxi deseja calcular o rendimento de seu
carro na praça. Sabendo-se que o preço do combustível é de
R$ 4,15, escreva um programa para ler: a marcação do odômetro
 (Km) no início do dia, a marcação (Km) no final do dia, o
 número de litros de combustível gasto e o valor total (R$)
 recebido dos passageiros. Calcular e escrever: a média do
 consumo em Km/L e o lucro (líquido) do dia.
 */

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a km no início do dia: ");
		int kmInicial = ler.nextInt();
		System.out.print("Qual a km no final do dia: ");
		int kmFinal = ler.nextInt();
		System.out.print("Qual a quantidade de combustível: ");
		float litros = ler.nextFloat();
		System.out.print("Qual valor recebido dos passageiros: ");
		float valor = ler.nextFloat();
		float distancia = kmFinal-kmInicial;
		float autonomia = distancia/litros;
		float lucro = valor-litros*(float)4.15;
		System.out.printf("Para percorrer %.2f km foram gastos %.2f litros\n",distancia, litros);
		System.out.printf("O que resulta em uma autonomia de %.2f km/l e um lucro de R$%.2f\n",autonomia,lucro);
	}
}
