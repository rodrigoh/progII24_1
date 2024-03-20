package aulaCinco.correcao;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Uma loja está levantando o valor total de todas as mercadorias em estoque.
Escreva um algoritmo que permita a entrada das seguintes informações:

b) Valor de cada mercadoria.
Ao final imprimir o valor total em estoque e a média de valor das mercadorias

O mesmo exercício anterior, mas agora não será informado o número de mercadorias
em estoque. Então o funcionamento deverá ser da seguinte forma: ler o valor da
mercadoria e perguntar “MAIS MERCADORIAS (S/N)?”. Ao final, imprimir o valor
total em estoque e a média de valor das mercadorias em estoque.

 */
public class Exericio15Opc2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contMercadorias=0;
		String resp;
		float valorTotal=0;
		do{
			System.out.println("Lendo informações da mercadoria "+(contMercadorias+1));
			System.out.print("Qual a quantidade: ");
			int quant = ler.nextInt();
			System.out.print("Qual o valor: ");
			float valor = ler.nextFloat();
			valorTotal+=valor*quant;
			//valorTotal = valorTotal+valor;
			contMercadorias+=quant;
			System.out.print("Tem mais mercadorias? (S = Sim / N = Não) ");
			resp = ler.next().toLowerCase();
		}
		while (resp.equals("s"));
		float valorMedio = valorTotal/contMercadorias;
		System.out.println("Os valores do estoque são:");
		System.out.println("Total R$"+String.format("%.2f",valorTotal));
		System.out.println("Valor médio R$"+String.format("%.2f", valorMedio));
	}
}
