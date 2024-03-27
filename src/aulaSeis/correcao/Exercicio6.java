package aulaSeis.correcao;

import java.util.Scanner;

/*
Ler um vetor C de 10 nomes de pessoas, após pedir que o
usuário digite um nome qualquer de pessoa. Escrever a mensagem
ACHEI, se o nome estiver armazenado no vetor C ou NÃO ACHEI
caso contrário.
 */
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nomes = {"Ana", "Bruno", "Camila", "Daniel", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Julia"};
		System.out.print("Qual nome devo pesquisar na lista: ");
		String nome = ler.next();
		boolean achei = false;
		for(int i=0;i< nomes.length && !achei;i++){
			if(nomes[i].equalsIgnoreCase(nome)){
				achei = true;
			}
		}
		if(achei){
			System.out.println("O nome "+nome+" está na lista");
		}
		else{
			System.out.println("O nome "+nome+" não está na lista");
		}
	}
}
