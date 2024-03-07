package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a senha: ");
		String senha = ler.next();
		String senhaValida = "admin";
		if(senha.equals(senhaValida)){
			System.out.println("Bem vindo!");
		}
		else{
			System.out.println("Senha incorreta");
		}
	}
}
