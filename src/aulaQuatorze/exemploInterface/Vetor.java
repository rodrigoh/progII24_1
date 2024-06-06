package aulaQuatorze.exemploInterface;

public class Vetor implements Lista{
	private int[] elementos = new int[10];
	int tamanho = 0;

	@Override
	public void adiciona(int elemento) {
		elementos[tamanho] = elemento;
		tamanho++;
	}

	@Override
	public int remove() {
		int elemento = elementos[tamanho-1];
		tamanho--;
		return elemento;
	}

	@Override
	public int obterElemento() {
		return elementos[tamanho-1];
	}

	public int obterTamanho(){
		return tamanho;
	}

	public String obterLista(){
		String retorno = "Dados na lista\n";
		if(tamanho>0){
			for(int i=0;i<tamanho;i++){
				retorno+=elementos[i]+" ";
			}
		}
		else{
			retorno+="{}";
		}
		return retorno;
	}
}
