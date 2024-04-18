package aulaOito.correcao;

public class ExemploSomaVetor {
	static int somaVetor(int[] vetor){
		int soma =0;
		for(int i=0;i<vetor.length;i++){
			soma+=vetor[i];
		}
		return soma;
	}

	public static void main(String[] args) {
		int[] lista = {1,2,5,7,9,10};
		int soma = somaVetor(lista);
		System.out.println("A soma dos números no vetor vale: "+soma);
	}
}
