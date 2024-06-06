package aulaQuatorze.javaDoc;

/**
 * Esta classe apresenta métodos para realizar operações matemáticas
 * @author Rodrigo Henrich
 * @version 1.0
 */
public class Operacoes {
	/**
	 * Método projetado para somar dois números
	 * @param v1 primeiro termo da soma
	 * @param v2 segundo termo da soma
	 * @return a soma dos dois valores
	 */
	public int soma(int v1, int v2){
		return v1+v2;
	}

	/**
	 * Método escrito para dividir dois números
	 * @param v1 dividendo
	 * @param v2 divisor
	 * @return a divisão de v1 por v2
	 * @throws IllegalArgumentException caso v2 seja 0
	 */
	public float divide(float v1, float v2){
		if(v2==0){
			throw new IllegalArgumentException("O v2 não pode ser 0");
		}
		return v1/v2;
	}
}
