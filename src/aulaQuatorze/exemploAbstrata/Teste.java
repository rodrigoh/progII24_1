package aulaQuatorze.exemploAbstrata;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Quadrado q1 = new Quadrado();

		q1.setNomeFigura("Quadrado");
		System.out.print("Digite o valor do lado ");
		double lado = ler.nextDouble();
		q1.setLado(lado);
		q1.setNomeFigura("Quadrado");
		System.out.println("O "+q1.getNomeFigura()+" tem área de "+q1.calculaArea());
		System.out.println("O quadrado tem perímetro "+q1.calculaPerimetro());

		Circulo c1 = new Circulo();
		System.out.print("Qual o valor do raio: ");
		double raio = ler.nextDouble();
		c1.setRaio(raio);
		System.out.println("O círculo tem área de "+c1.calculaArea());
		System.out.println("O círculo tem perímetro de "+c1.calculaPerimetro());

	}
}
