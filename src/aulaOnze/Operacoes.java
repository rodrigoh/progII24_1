package aulaOnze;

import java.util.Scanner;

public class Operacoes {

	public static int somaNumero(int n1, int n2){
		return n1+n2;
	}

	public static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return  ler.nextLine();
	}

	public static int leNumeroInt(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextInt();
	}
}
