package aulaCinco.exemplos;

import java.util.Random;

public class ExemploTresRandom {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int numero = aleatorio.nextInt();
		float numeroR = aleatorio.nextFloat();
		boolean caraCoroa = aleatorio.nextBoolean();
		System.out.println("Inteiro = "+numero);
		System.out.println("Real = "+numeroR);
		System.out.println("Boolean = "+caraCoroa);
		//Especifica o limite superior
		numero = aleatorio.nextInt(10);
		System.out.println("Inteiro = "+numero);
		//Especifica o limite inferior e superior
		numero = aleatorio.nextInt(50,100);
		System.out.println("Inteiro = "+numero);
	}
}
