package aulaDois;
import java.util.Scanner;
public class ExemploAulaAnterior {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = ler.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = ler.next();
		System.out.print("Entre com sua altura em cm: ");
		int altura = ler.nextInt();
		//comentário
		/*
		trecho de comentário
		 */
		System.out.println("Nome: "+nome+" "+sobrenome+" tem "+altura+"cm de altura");
		System.out.printf("Nome: %s %s tem %dcm de altura\n",nome,sobrenome,altura);
		//Lendo o nome completo
		System.out.print("Digite seu nome completo: ");
		//String nomeCompleto = ler.nextLine();
		String nomeCompleto = new Scanner(System.in).nextLine();

	}
}
