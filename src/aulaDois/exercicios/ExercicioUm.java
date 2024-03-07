package aulaDois.exercicios;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		System.out.print("Digite uma medida em metros: ");
		float metros = new Scanner(System.in).nextFloat();
		float cm = metros*100;
		System.out.printf("%.2f m equivale(m) a %.2f cm\n",metros,cm);
	}
}
