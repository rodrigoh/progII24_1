package aulaTres.correcao;

import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("N1: ");
		float n1 = ler.nextFloat();
		System.out.print("N2: ");
		float n2 = ler.nextFloat();
		float pot = (float) Math.pow(n1, n2);
		float inv = 1/n1;
		float soma = n2+n1/2;
		float dif = n1-n2;
		float op = n1*-1;
		System.out.printf("%.2f ^ %.2f = %.2f\n",n1,n2,pot);
		System.out.printf("1 / %.2f = %.2f\n",n1,inv);
		System.out.printf("%.2f / %.2f/2 = %.2f\n",n2,n1,soma);
		System.out.printf("%.2f - %.2f/2 = %.2f\n",n1,n2,dif);
		System.out.printf("o oposto de %.2f = %.2f\n",n1,op);
	}
}
