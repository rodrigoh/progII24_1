package aulaOnze;

import aulaOnze.exemploAcesso.Conta;

public class Teste {
	public static void main(String[] args) {
		String nome = Operacoes.leString("Qual seu nome ");
		int n1 = Operacoes.leNumeroInt("Digite um número ");
		int n2 = Operacoes.leNumeroInt("Digite outro numero ");
		int soma = Operacoes.somaNumero(n1,n2);
		System.out.println("A soma vale "+soma);
		Integer n = Integer.parseInt("9");
		//System.out.println(Integer.toBinaryString(255));
		Conta c1 = new Conta("Ana","a345");
		c1.depositar(1000);
		System.out.println("Seu saldo é de "+c1.verificaSaldo());

	}
}
