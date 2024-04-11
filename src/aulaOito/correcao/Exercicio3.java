package aulaOito.correcao;

import java.util.Random;

public class Exercicio3 {
	static int dado(){
		Random aleatorio = new Random();
		//Sorteia entre 1 e 6 aleatorio.nextInt(6)+1;
		return aleatorio.nextInt(1,7);
	}

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println(dado());
		}
	}
}
