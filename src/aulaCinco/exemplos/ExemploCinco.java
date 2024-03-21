package aulaCinco.exemplos;

public class ExemploCinco {
	public static void main(String[] args) {
		int[] lista = {2,10,8,9,4,5};
		String[] nomes = {"Ana", "Pedro", "Jonas", "Betina"};
		System.out.println("O vetor de números: ");
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}
		System.out.println("\nVetor de nomes: ");
		for(String nome: nomes){
			System.out.print(nome+" ");
		}
		System.out.println();
	}
}
