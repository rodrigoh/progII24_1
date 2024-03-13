package aulaQuatro.exemploDoWhile;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota;
		do{
			System.out.print("Digite uma nota entre 0 e 10: ");
			nota = ler.nextInt();
		}
		while(nota<0||nota>10);
		System.out.println("A nota é "+nota);
		//Exemplo com while
		//int nota;
		System.out.print("Digite uma nota entre 0 e 10: ");
		nota = ler.nextInt();

		while(nota<0 || nota>10){
			System.out.print("Nota inválida, ela deve estar entre 0 e 10: ");
			nota = ler.nextInt();
		}
	}
}
