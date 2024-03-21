package aulaCinco.exemplos;

import java.util.Random;

public class ExemploQuatro {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] lista = new int[100];
		for(int i =0;i<lista.length;i++){
			lista[i] = aleatorio.nextInt(100,300);
			System.out.print(lista[i]+" ");
		}
	}
}
