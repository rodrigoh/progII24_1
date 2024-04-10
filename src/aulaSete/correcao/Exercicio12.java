package aulaSete.correcao;

import java.util.Random;

public class Exercicio12 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] cartela = new int[5][5];
		int[] aux = new int[25];
		int cont=0;
		for(int l=0;l<5;l++){
			for(int c=0;c<5;){
				int n = aleatorio.nextInt(1,100);
				boolean novoNumero = true;
				for(int i=0;i<aux.length;i++){
					if(aux[i]==n){
						novoNumero = false;
					}
				}
				if(novoNumero){
					aux[cont] = n;
					cont++;
					cartela[l][c] = n;
					c++;
				}
			}
		}
		System.out.println("\nCartela de bingo gerada...");

		for(int[] linha : cartela){
			for(int valor : linha){
				System.out.printf("%02d ",valor);
			}
			System.out.println();
		}
	}
}
