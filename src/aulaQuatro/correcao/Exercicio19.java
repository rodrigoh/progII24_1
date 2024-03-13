package aulaQuatro.correcao;

import java.util.Scanner;
/*
Escreva um algoritmo que leia o código de uma figura geométrica
(t - triângulo, q - quadrado, c - círculo, r - retângulo). Depois de
escolhida a figura, leia as informações necessárias para calcular a
área da figura correspondente, calcule e escreva o valor da área.
 */
public class Exercicio19 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Selecione uma opção ");
		System.out.println("t para calcular a área de um triângulo");
		System.out.println("q para calcular a área de um quadrado");
		System.out.println("c para calcular a área de um círculo");
		System.out.println("r para calcular a área de um retângulo");
		char opc = ler.next().toLowerCase().charAt(0);
		switch (opc){
			case 't'->{
				System.out.println("Vamos calcular a área do triângulo");
				System.out.print("Qual o valor da base: ");
				float base = ler.nextFloat();
				System.out.print("Qual o valor da altura: ");
				float altura = ler.nextFloat();
				float area = base*altura/2;
				String resultado = String.format("%.2f cm²",area);
				System.out.println("A área vale "+resultado);
			}
			case 'q'->{
				System.out.println("Vamos calcular a área do quadrado");
				System.out.print("Qual o valor do lado: ");
				float lado = ler.nextFloat();
				float area = lado*lado;
				String resultado = String.format("%.2f cm²",area);
				System.out.println("A área vale "+resultado);
			}
			case 'c'->{
				System.out.println("Vamos calcular a área do círculo");
				System.out.print("Qual o valor do raio: ");
				float raio = ler.nextFloat();
				float area = (float)Math.PI*raio*raio;
				String resultado = String.format("%.2f cm²",area);
				System.out.println("A área vale "+resultado);
			}
			case 'r'->{
				System.out.println("Vamos calcular a área do retângulo");
				System.out.print("Qual o valor da base: ");
				float base = ler.nextFloat();
				System.out.print("Qual o valor da altura: ");
				float altura = ler.nextFloat();
				float area = base*altura;
				String resultado = String.format("%.2f cm²",area);
				System.out.println("A área vale "+resultado);
			}
			default -> System.out.println("Opção inválida");
		}
	}
}
