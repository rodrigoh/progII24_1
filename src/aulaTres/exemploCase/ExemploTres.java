package aulaTres.exemploCase;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a senha: ");
		String senha = ler.next();
		switch (senha){
			case "admin"-> System.out.println("Bem vindo");
			case "user"-> System.out.println("Bem vindo usuário");
			default -> System.out.println("Informações inválidas");
		}
	}
}
