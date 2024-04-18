package aulaNove.exemplos.exemploCinco;

import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Conta c1 = new Conta("c123", "Pedro");
		char opc;
		do{
			System.out.println("Bem vindo "+c1.titular);
			System.out.println("Selecione uma opção");
			System.out.println("d - depositar: ");
			System.out.println("s - sacar");
			System.out.println("v - verificar saldo");
			System.out.println("e - sair");
			opc = new Scanner(System.in).next().toLowerCase().charAt(0);
			switch(opc){
				case 'd'->{
					System.out.print("Qual valor: ");
					float valor = new Scanner(System.in).nextFloat();
					c1.depositar(valor);
					System.out.println("Depositado com sucesso!");
				}
				case 's'->{
					System.out.print("Qual valor: ");
					float valor = new Scanner(System.in).nextFloat();
					if(c1.sacar(valor)){
						System.out.println("Saque realizado com sucesso!");
					}
					else{
						System.out.println("Saldo insuficiente!");
					}
				}
				case 'v'->{
					System.out.printf("Seu saldo atual é de R$%.2f\n",c1.saldo);
				}
				case 'e'->{
					System.out.println("Obrigado por ser nosso cliente, sua conta foi " +
									"apagada!");
				}
			}
		}
		while (opc!='e');
	}
}
