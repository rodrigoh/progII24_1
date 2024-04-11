package aulaOito.correcao;

import java.util.Scanner;

public class Exercicio1 {
	static float calculaDelta(float a, float b, float c){
		return (float)Math.pow(b,2)-4*a*c;
	}

	static float calculaX(float a, float b, float d, char op){
		if(op=='+'){
			float x = (-b+(float)Math.sqrt(d))/(2*a);
			return x;
		}
		else{
			float x = (-b-(float)Math.sqrt(d))/(2*a);
			return x;
		}
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Dada a equação ax² + bx + c = 0, informe:");
		System.out.print("a: ");
		float a = ler.nextFloat();
		System.out.print("b: ");
		float b = ler.nextFloat();
		System.out.print("c: ");
		float c = ler.nextFloat();
		if(a > 0){
			float delta = calculaDelta(a,b,c);
			if(delta > 0){
				float x1 = calculaX(a,b,delta,'+');
				float x2 = calculaX(a,b,delta,'-');
				System.out.println("As raízes da equação são");
				System.out.println("x' = "+x1);
				System.out.println("x'' = "+x2);
			}
			else{
				System.out.println("Esta equação não possui raízes no conjunto dos reais");
			}
		}
		else{
			System.out.println("Os valores informados não formam uma equação do segundo grau");
		}

	}
}
