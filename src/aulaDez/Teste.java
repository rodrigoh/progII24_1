package aulaDez;

public class Teste {
	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca("Pedro","a123","12345",100);
		ContaPoupanca cp2 = new ContaPoupanca("Andre","b124","12345",150);
		System.out.println(cp1.saldo);
		System.out.println(cp2.saldo);
		cp1.nomeBanco = "BancoTeste";
		System.out.println("O nome do banco da conta um é "+ cp1.nomeBanco);
		System.out.println("O nome do banco da conta dois é "+ cp2.nomeBanco);
		ContaPoupanca.nomeBanco = "Agora é outro nome";
		System.out.println("O nome do banco da conta um é "+ cp1.nomeBanco);
		System.out.println("O nome do banco da conta dois é "+ cp2.nomeBanco);
	}
}
