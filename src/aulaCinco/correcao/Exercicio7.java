package aulaCinco.correcao;

import java.util.Scanner;

/*
Escreva um algoritmo para ler uma senha. Se o usuário não digitar a
senha correta que é 12345, o algoritmo deve ler novamente, até que
seja a senha correta. O algoritmo deve também contar quantas vezes
o usuário tentou digitar a senha incorreta, ou seja, quantas
tentativas de acerto aconteceram. Escrever essa informação na tela.
 */
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String senhaValida = "12345";
		int contErro = 0;
		System.out.print("Digite sua senha: ");
		String senha = ler.next();
		while(!senhaValida.equals(senha)){
			contErro++;
			System.out.print("Senha incorreta, digite novamente: ");
			senha = ler.next();
		}
		System.out.println("Bem vindo, você errou a senha "+contErro+" vezes");
	}
}
