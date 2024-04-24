package aulaDez;

import java.util.Random;
import java.util.Scanner;

public class Banco {

	public static ContaCorrente cadastraContaCorrente(){
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.print("Qual o nome do titular: ");
		String titular = ler.next();
		String identificador = "a"+aleatorio.nextInt(10000);
		System.out.print("Qual o limite inicial: ");
		float limite = ler.nextFloat();
		return new ContaCorrente(titular,identificador,limite);
	}

	public static ContaPoupanca cadastraContaPoupanca(){
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.print("Qual o nome do titular: ");
		String titular = ler.next();
		String identificador = "b"+aleatorio.nextInt(10000);
		System.out.print("Qual o deposito inicial: ");
		float deposito = ler.nextFloat();
		return new ContaPoupanca(titular,identificador,deposito);
	}

	public static ContaCorrente acessaContaCorente(ContaCorrente conta){
		Scanner ler = new Scanner(System.in);
		String resp;
		do{
			System.out.println("\n\nAcessando a conta "+conta.identificador);
			System.out.println("d - depositar");
			System.out.println("s - saldo");
			System.out.println("r - realizar um saque");
			System.out.println("e - sair");
			resp = ler.next();
			switch (resp){
				case "d"->{
					System.out.print("Qual valor deseja depositar: ");
					float valor = ler.nextFloat();
					conta.depositar(valor);
					System.out.println("Deposito realizado");
				}
				case "s"->{
					System.out.println(conta.verificaSaldo());
				}
				case "r"->{
					System.out.print("Qual valor deseja sacar: ");
					float valor = ler.nextFloat();
					if(conta.sacar(valor)){
						System.out.println("Saque realizado");
					}
					else{
						System.out.println("Seu saldo não é suficiente");
					}
				}
			}
		}
		while (!resp.equals("e"));
		return conta;
	}

	public static ContaPoupanca acessaContaPoupanca(ContaPoupanca conta){
		Scanner ler = new Scanner(System.in);
		String resp;
		do{
			System.out.println("\n\nAcessando a conta "+conta.identificador);
			System.out.println("d - depositar");
			System.out.println("s - saldo");
			System.out.println("r - realizar um saque");
			System.out.println("e - sair");
			resp = ler.next();
			switch (resp){
				case "d"->{
					System.out.print("Qual valor deseja depositar: ");
					float valor = ler.nextFloat();
					conta.depositar(valor);
					System.out.println("Deposito realizado");
				}
				case "s"->{
					System.out.println("Seu saldo é de "+String.format("%.2f",conta.saldo));
				}
				case "r"->{
					System.out.print("Qual valor deseja sacar: ");
					float valor = ler.nextFloat();
					if(conta.sacar(valor)){
						System.out.println("Saque realizado");
					}
					else{
						System.out.println("Seu saldo não é suficiente");
					}
				}
			}
		}
		while (!resp.equals("e"));
		return conta;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaCorrente[] listaContaC = new ContaCorrente[10];
		ContaPoupanca[] listaContaP = new ContaPoupanca[10];
		int icc = 0;
		int icp = 0;
		String resp;
		do{
			System.out.println("Bem vindo ao banco InfoBank");
			System.out.println("cp - criar uma conta poupança");
			System.out.println("cc - criar uma conta corrente");
			System.out.println("ap - acessar uma conta poupança");
			System.out.println("ac - acessar uma conta corrente");
			System.out.println("s - sair");
			resp = ler.next();
			switch (resp){
				case "cp"->{
					listaContaP[icp] = cadastraContaPoupanca();
					System.out.println("Conta cadastrada com identificador "+
									listaContaP[icp].identificador);
					icp++;
				}
				case "cc"->{
					listaContaC[icc] = cadastraContaCorrente();
					System.out.println("Conta cadastrada com identificador "+
									listaContaC[icc].identificador);
					icc++;
				}
				case "ap"->{
					System.out.print("Informe o identificador: ");
					String identificador = ler.next();
					//Pesquisando no vetor de contas...
					int posicao = -1;
					for(int i=0;i<icp;i++){
						if(listaContaP[i].identificador.equals(identificador)){
							posicao = i;
						}
					}
					if(posicao >= 0){
						listaContaP[posicao] = acessaContaPoupanca(listaContaP[posicao]);
					}
					else{
						System.out.println("Conta "+identificador+" não encontrada");
					}
				}
				case "ac"->{
					System.out.print("Informe o identificador: ");
					String identificador = ler.next();
					//Pesquisando no vetor de contas...
					int posicao = -1;
					for(int i=0;i<icc;i++){
						if(listaContaC[i].identificador.equals(identificador)){
							posicao = i;
						}
					}
					if(posicao >= 0){
						listaContaC[posicao] = acessaContaCorente(listaContaC[posicao]);
					}
					else{
						System.out.println("Conta "+identificador+" não encontrada");
					}
				}
			}
		}
		while (!resp.equals("s"));
	}
}
