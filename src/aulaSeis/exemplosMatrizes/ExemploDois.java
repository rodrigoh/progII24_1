package aulaSeis.exemplosMatrizes;

public class ExemploDois {
	public static void main(String[] args) {
		int[][] matriz = {{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
		for(int l=0;l < matriz.length;l++){
			for(int c=0;c<matriz[0].length;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		//Descobrindo o tamanho usando o length
		int quantLinhas = matriz.length;
		System.out.println("A matriz possui "+quantLinhas+" linhas");
		int quantColunas = matriz[0].length;
		System.out.println("A matriz possui "+quantColunas+" colunas");
		//Achando a diagonal principal da matriz
		System.out.println("A diagonal da matriz vale");
		for(int l=0;l < matriz.length;l++) {
			for (int c = 0; c < matriz[0].length; c++) {
				if (l == c)
					System.out.printf("%02d ", matriz[l][c]);
			}
		}
		//Com um for apenas
		System.out.println("\nA diagonal da matriz vale");
		for(int i=0;i < matriz.length;i++){
			System.out.printf("%02d ", matriz[i][i]);
		}
		//Diagonal inversa
		System.out.println("\nDiagonal inversa...");
		for(int l=0;l < matriz.length;l++) {
			for (int c = 0; c < matriz[0].length; c++) {
				if(l+c==matriz.length-1)
					System.out.printf("%02d ", matriz[l][c]);
			}
		}
		//Usando o for simplificado em matrizes
		System.out.println("\nUsando o for simplificado...");
		for(int[] linha:matriz){
			for(int coluna:linha){
				System.out.printf("%02d ", coluna);
			}
			System.out.println();
		}
	}
}
