package aulaQuinze.listaGenerica;

public class Lista {
	//adicionar(elemento); - ok
	//adicionar(posição, elemento); - ok
	//obterTamanho(); - ok
	//remove(); - ok
	//remove(posição); - ok
	//remove(elemento);
	//toString(); - ok
	//limpar();
	//pegar(posição); - ok
	//contem(); - ok
	//posicaoDe(elemento); - ok
	//ultimPosicaoDe(elemento);
	//aumentaCapacidade();
	private String[] elementos;
	private int tamanho;

	public Lista(){
		elementos = new String[10];
		tamanho = 0;
	}

	public Lista(int capacidade){
		elementos = new String[capacidade];
		tamanho = 0;
	}

	public void adiciona(String elemento){
		aumentaCapacidade();
		elementos[tamanho] = elemento;
		tamanho++;
	}

	public void adiciona(int posicao, String elemento){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException(posicao+" não é válida");
		//A,B,C,E,F...
		aumentaCapacidade();
		for(int i=tamanho-1;i>=posicao;i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	private void aumentaCapacidade(){
		if(tamanho== elementos.length){
			String aux[] = new String[elementos.length*2];
			for(int i=0;i<tamanho;i++){
				aux[i] = elementos[i];
			}
			elementos = aux;
		}
	}

	public int obterTamanho(){
		return tamanho;
	}

	public String pegar(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException(posicao+" não é válida");
		return elementos[posicao];
	}

	public boolean contem(String elemento){
		for(int i=0;i<tamanho;i++)
			if(elementos[i].equals(elemento))
				return true;
		return false;
	}

	public int posicaoDe(String elemento){
		for(int i=0;i<tamanho;i++)
			if(elementos[i].equals(elemento))
				return i;
		return -1;
	}

	public String remove(){
		if(tamanho>0){
			String elemento = elementos[tamanho-1];
			tamanho--;
			return elemento;
		}
		return null;
	}

	public void remove(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException(posicao+" não é válida");
		for(int i=posicao;i<tamanho-1;i++)
			elementos[i] = elementos[i+1];
		tamanho--;
	}

	@Override
	public String toString(){
		//[1,2,3,4,5,6]
		String retorno = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++)
				retorno+=elementos[i]+", ";
			retorno+=elementos[tamanho-1];
		}
		retorno+="]";
		return retorno;

	}


}
