package aulaSete.correcao;
/*
Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal
 e com 0 os demais elementos. Escreva ao final a matriz obtida.
 */
public class Exercicio2 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		//Marcando com 1 a diagonal
		for(int i=0;i< matriz.length;i++){
			matriz[i][i] = 1;
		}
		//Diagonal inverva
		System.out.println("\nDiagonal inversa...");
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[0].length;c++){
				if(l+c==matriz.length-1){
					System.out.print(matriz[l][c]+" ");
				}
			}
		}
		//For simplificado
		System.out.println("\nDados na matriz:");
		for(int[] linha : matriz){
			for(int c : linha){
				System.out.printf("%d ",c);
			}
			System.out.println();
		}
	}
}
