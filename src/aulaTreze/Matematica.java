package aulaTreze;

public class Matematica {

	public int divide(int n1, int n2){
		if(n2 == 0){
			throw new ArithmeticException("Não é possível dividir por zero");
		}
		return n1/n2;
	}

	public int divideDois(int n1, int n2) throws ArithmeticException{
		return n1/n2;
	}
}
