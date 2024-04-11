package aulaOito.correcao;

import java.util.Locale;
import java.util.Scanner;

/*
Crie uma classe de conversão entre as temperaturas Celsius e Farenheit.
Primeiro o usuário deve escolher se vai entrar com a temperatura em Célsius
 ou Farenheit, depois a conversão escolhida é realizada através de um comando SWITCH.
Se C é a temperatura em Célsius e F em farenheit, as fórmulas de conversão
são:C= 5.(F-32)/9 F= (9.C/5) + 32

 */
public class Exercicio5 {
	static float grausParaFarenheit(float tempC){
		return (9*tempC/5) + 32;
	}
	static float grausParaCelsius(float tempF){
		return 5*(tempF-32)/9;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Tecla c para converter uma temperatura de °F para °C");
		System.out.println("Tecla f para converter uma temperatura de °C para °F");
		char opc = ler.next().toLowerCase().charAt(0);
		switch (opc){
			case 'c'->{
				System.out.print("Digite uma temperatura em °F: ");
				float temp = ler.nextFloat();
				float tempC = grausParaCelsius(temp);
				System.out.println(temp+"°F equivale(m) a "+tempC+"°C");
			}
			case 'f'->{
				System.out.print("Digite uma temperatura em °C: ");
				float temp = ler.nextFloat();
				float tempF = grausParaFarenheit(temp);
				System.out.println(temp+"°C equivale(m) a "+tempF+"°F");
			}
		}

	}
}
