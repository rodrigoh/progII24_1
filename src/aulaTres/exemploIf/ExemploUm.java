package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float nota;
		System.out.print("Digite a nota: ");
		nota = ler.nextFloat();

		if(nota>=0 && nota<=10){
			System.out.println("A nota "+nota+" é válida");
		}else{
			System.out.println("A nota não é válida...");
		}

	}
}
