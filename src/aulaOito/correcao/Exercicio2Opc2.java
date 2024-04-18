package aulaOito.correcao;

import java.util.Scanner;

public class Exercicio2Opc2 {
	static int achaMenor(int n1, int n2, int n3){
		int menor = n1;
		if(n2<menor)
			menor = n2;
		if(n3<menor)
			menor = n3;
		return menor;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor para n1: ");
		int n1 = ler.nextInt();
		System.out.print("Digite um valor para n2: ");
		int n2 = ler.nextInt();
		System.out.print("Digite um valor para n3: ");
		int n3 = ler.nextInt();
		int menor = achaMenor(n1,n2,n3);
		System.out.println("O menor número digitado foi "+menor);

	}
}
