package aulaDoze.exemploHeranca;

public class Teste {
	public static void main(String[] args) {
		Motorista m1 = new Motorista("Ana", "Silva",1234);
		m1.setCnh("35262562625");
		System.out.println("Dados da(o) motorista: "+m1.obterDados());
		System.out.println("Com cnh n° "+m1.getCnh());

		Engenheiro e1 = new Engenheiro("Jonas","Silva",1235,"8sd5f4sd");
		System.out.println("O engenheiro é "+e1.obterDados());
		System.out.println("Seu registro de conselho é "+e1.getCrea());

		System.out.println(e1);

		ExemploQuatro eq1 = new ExemploQuatro("Ana","Silva");

		System.out.println(eq1);
	}
}
