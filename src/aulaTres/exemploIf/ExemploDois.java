package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.print("Idade: ");
		idade = ler.nextInt();
		if(idade==0)
			System.out.println("Idade inválida");
		else if(idade<10)
			System.out.println("Categoria infantil A");
		else if(idade<13) {
			System.out.println("Categoria infantil B");
			System.out.println("...");
		}
		else if(idade<40){
			System.out.println("Categoria adulto");
		}
		else{
			System.out.println("Categoria terceira idade");
		}
	}
}
