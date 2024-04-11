package aulaOito.correcao;

import java.util.Random;

public class Exercicio4Opc {
	static int dado(){
		Random aleatorio = new Random();
		//Sorteia entre 1 e 6 aleatorio.nextInt(6)+1;
		return aleatorio.nextInt(1,7);
	}

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		int f6 = 0;
		int maximo = 1000000;
		for(int i=0;i<maximo;i++){
			int face = dado();
			if(face == 1)
				f1++;
			else if(face == 2)
				f2++;
			else if(face == 3)
				f3++;
			else if(face == 4)
				f4++;
			else if(face == 5)
				f5++;
			else if(face == 6)
				f6++;
		}

		float pf1 = f1/(float)maximo*100;
		System.out.println("A face 1 do dado for sorteada "+f1+" vezes");
		System.out.println("O que representa "+String.format("%.2f",pf1)+" % do total");

		float pf2 = f2/(float)maximo*100;
		System.out.println("A face 2 do dado for sorteada "+f2+" vezes");
		System.out.println("O que representa "+String.format("%.2f",pf2)+" % do total");

		float pf3 = f3/(float)maximo*100;
		System.out.println("A face 3 do dado for sorteada "+f3+" vezes");
		System.out.println("O que representa "+String.format("%.2f",pf3)+" % do total");

		float pf4 = f4/(float)maximo*100;
		System.out.println("A face 4 do dado for sorteada "+f4+" vezes");
		System.out.println("O que representa "+String.format("%.2f",pf4)+" % do total");

		float pf5 = f5/(float)maximo*100;
		System.out.println("A face 5 do dado for sorteada "+f5+" vezes");
		System.out.println("O que representa "+String.format("%.2f",pf5)+" % do total");

		float pf6 = f6/(float)maximo*100;
		System.out.println("A face 6 do dado for sorteada "+f6+" vezes");
		System.out.println("O que representa "+String.format("%.2f",pf6)+" % do total");
	}
}
