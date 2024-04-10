package aulaSete.exemplos;

import java.util.Scanner;

public class Exemplo1 {

	public static int soma(int v1, int v2){
		int r = v1+v2;
		return r;
	}
	public static int soma(int v1, int v2, int v3){
		return v1+v2+v3;
	}

	public static String soma(String s1, String s2){
		return s1+" "+s2;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n1 = ler.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = ler.nextInt();
		int resultado = soma(n1,n2);
		System.out.println(n1+" + "+n2+" = "+resultado);

	}
	//outras funções
}
