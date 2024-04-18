package aulaOito.correcao;

import java.util.Random;

public class Exercicio4 {
	static int dado(){
		Random aleatorio = new Random();
		//Sorteia entre 1 e 6 aleatorio.nextInt(6)+1;
		return aleatorio.nextInt(0,6);
	}

	public static void main(String[] args) {
		//Cada posição do vetor representa uma face do dado 0 = 1 e 5 = 6
		int[] lancamentos = new int[6];
		int maximo = 1000000;
		for(int i=0;i<maximo;i++){
			int face = dado();
			lancamentos[face]++;
		}
		for(int i=0;i<6;i++){
			float percentualFace = lancamentos[i]/(float)maximo*100;
			System.out.println("A face "+(i+1)+" do dado for sorteada "+lancamentos[i]+" vezes");
			System.out.println("O que representa "+String.format("%.2f",percentualFace)+" % do total");
		}
	}
}
