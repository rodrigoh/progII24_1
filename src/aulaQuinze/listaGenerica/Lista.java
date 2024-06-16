package aulaQuinze.listaGenerica;

/**
 * Classe que representa uma lista com tipo genérico como os ArrayList
 * @param <T> tipo genérico da classe
 * @since 1
 * @author Rodrigo Henrich
 * @see java.util.ArrayList
 */
public class Lista<T> {
	//adicionar(elemento); - ok
	//adicionar(posição, elemento); - ok
	//obterTamanho(); - ok
	//remove(); - ok
	//remove(posição); - ok
	//remove(elemento); - ok
	//toString(); - ok
	//limpar(); - ok
	//pegar(posição); - ok
	//contem(); - ok
	//posicaoDe(elemento); - ok
	//ultimPosicaoDe(elemento); - ok
	//aumentaCapacidade(); - ok
	private T[] elementos;
	private int tamanho;

	public Lista(){
		elementos = (T[]) new Object[10];
		tamanho = 0;
	}

	public Lista(int capacidade){
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	/**
	 * Método que adiciona um elemento no final da lista
	 * @param elemento elemento a ser adicionado
	 */
	public void adiciona(T elemento){
		aumentaCapacidade();
		elementos[tamanho] = elemento;
		tamanho++;
	}

	/**
	 * Método que adiciona um elemento em qualquer posição da lista
	 * @param posicao posição onde será adicionado o elemento
	 * @param elemento elemento que será adicionado
	 * @throws IllegalArgumentException caso a posição seja inválida
	 */
	public void adiciona(int posicao, T elemento){
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
			T aux[] = (T[]) new Object[elementos.length*2];
			for(int i=0;i<tamanho;i++){
				aux[i] = elementos[i];
			}
			elementos = aux;
		}
	}

	/**
	 * Devolve o tamanho atual da lista
	 * @return inteiro contendo o tamanho da lista
	 */
	public int obterTamanho(){
		return tamanho;
	}

	/**
	 * Apaga todos os elementos da lista
	 */
	public void limpar(){
		tamanho = 0;
	}

	/**
	 * Obtém um elemento de determinada posição da lista
	 * @param posicao que deseja pegar
	 * @return elemento que está na posição desejada
	 * @throws IllegalArgumentException caso a posição não seja válida
	 */
	public T pegar(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException(posicao+" não é válida");
		return elementos[posicao];
	}

	/**
	 * Verifica se um elemento existe ou não lista
	 * @param elemento elemento que estou procurando
	 * @return true se o elemento existir na lista ou false se não
	 */
	public boolean contem(T elemento){
		for(int i=0;i<tamanho;i++)
			if(elementos[i].equals(elemento))
				return true;
		return false;
	}

	public int posicaoDe(T elemento){
		for(int i=0;i<tamanho;i++)
			if(elementos[i].equals(elemento))
				return i;
		return -1;
	}

	/**
	 * Realiza uma busca pelo elemento na lista, tem o mesmo comportamento do
	 * posicaoDe(), caso não existam elementos repetidos
	 * @param elemento elemento que se está procurando
	 * @return a posição da última ocorrência de elemento na lista
	 */
	public int ultimaPosicaoDe(T elemento){
		int posicao = -1;
		for(int i=0;i<tamanho;i++){
			if(elementos[i].equals(elemento))
				posicao = i;
		}
		return posicao;
	}

	public T remove(){
		if(tamanho>0){
			T elemento = elementos[tamanho-1];
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

	public void remove(T elemento){
		int posicao = posicaoDe(elemento);
		remove(posicao);
	}

	public boolean estaVazia(){
		return tamanho==0;
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
