package aulaDoze.exemploEncapsulamento;

public class Teste {
	public static void main(String[] args) {
		Conta c1 = new Conta("Pedo","a589");
		c1.depositar(1000);
		System.out.println("Seu saldo é de "+c1.getSaldo());
		c1.depositar(100);
		System.out.println("Seu saldo é de "+c1.getSaldo());
		c1.setTitular("Pedro");
		System.out.println("Dados do titular alterados para "+c1.getTitular());
	}
}
