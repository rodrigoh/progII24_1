package aulaTreze;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		//Valor precisa ser maior que 0 e menor que 9
		Scanner ler = new Scanner(System.in);
		int valor = 0;
		do {
			try {
				System.out.print("Digite um número: ");
				valor = ler.nextInt();
			}
			catch (InputMismatchException e) {
				ler.next();
				System.out.println("Ops! preciso de um número");
			}
		}
		while (valor < 0 || valor > 9);
	}
}
