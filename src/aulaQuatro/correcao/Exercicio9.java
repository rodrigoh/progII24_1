package aulaQuatro.correcao;

import java.util.Scanner;

/*
9) Receba três valores fornecidos pelo usuário que representarão os
lados de um triângulo.
Classifique esse triângulo como:
a) Equilátero: três lados iguais.
b) Isósceles: dois lados iguais.
c) Escaleno: três lados diferentes.
Lembre-se de que, para formar um triângulo, nenhum dos lados pode ser
igual a zero, um lado não pode ser maior do que a soma dos outros
 dois.

 */
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a medida dos três vértices de um triângulo: ");
		System.out.print("a: ");
		int a = ler.nextInt();
		System.out.print("b: ");
		int b = ler.nextInt();
		System.out.print("c: ");
		int c = ler.nextInt();
		if(a>0 && b>0 && c>0 && a<=b+c && b<=a+c && c<=a+b){
			System.out.print("Forma um triângulo ");
			if(a==b && b==c)
				System.out.println("equilátero");
			else if(a==b || a==c || b==c)
				System.out.println("isósceles");
			else
				System.out.println("escaleno");
		}
		else{
			System.out.println("Não forma um triângulo");
		}
	}
}
