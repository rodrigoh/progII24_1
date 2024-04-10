package aulaSete.exemplos;

import java.util.Random;

public class Exemplo3 {
	public static String geraMatrizImpressao(int[][] matriz){
		String resultado = "";
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[0].length;c++){
				resultado+=String.format("%02d ",matriz[l][c]);
			}
			resultado+="\n";
		}
		return resultado;
	}
	public static void main(String[] args) {
		Random aleatoria = new Random();
		int[][] ma = new int[4][6];
		int[][] mb = new int[4][6];
		int[][] ms = new int[4][6];
		int[][] md = new int[4][6];
		System.out.println("Dados na matriz A");
		for(int l=0;l<4;l++){
			for(int c=0;c<6;c++){
				ma[l][c] = aleatoria.nextInt(1,50);
			}
		}
		System.out.println(geraMatrizImpressao(ma));
		System.out.println("\nDados na matriz B");
		for(int l=0;l<4;l++){
			for(int c=0;c<6;c++){
				mb[l][c] = aleatoria.nextInt(1,50);
			}
		}
		System.out.println(geraMatrizImpressao(mb));
		System.out.println("\nA soma das matrizes vale: ");
		for(int l=0;l<4;l++) {
			for (int c=0;c<6;c++) {
				ms[l][c] = ma[l][c]+mb[l][c];
				System.out.printf("%02d ",ms[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nA diferença das matrizes vale: ");
		for(int l=0;l<4;l++) {
			for (int c=0;c<6;c++) {
				md[l][c] = ma[l][c]-mb[l][c];
				System.out.printf("%02d ",md[l][c]);
			}
			System.out.println();
		}
	}
}
