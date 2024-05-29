package aulaTreze;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			System.out.print("Digite o primeiro número: ");
			int n1 = ler.nextInt();
			System.out.print("Digite o segundo número: ");
			int n2 = ler.nextInt();

			int resp = n1 / n2;

			System.out.println(resp);
		}
		catch (InputMismatchException erro){
			System.out.println("Os valores de n1 e n2 precisam ser números");
		}
		catch (ArithmeticException erro){
			System.out.println("Não é possível dividir por zero!");
		}
		finally {
			System.out.println("Eu sempre ocorro!");
		}
	}
}
