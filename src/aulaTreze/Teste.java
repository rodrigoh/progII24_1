package aulaTreze;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			System.out.print("Digite o primeiro número: ");
			int n1 = ler.nextInt();
			System.out.print("Digite o segundo número: ");
			int n2 = ler.nextInt();
			Matematica m1 = new Matematica();
			m1.divide(n1,n2);
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}
	}
}
