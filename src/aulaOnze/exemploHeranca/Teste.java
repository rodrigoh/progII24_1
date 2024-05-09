package aulaOnze.exemploHeranca;

public class Teste {
	public static void main(String[] args) {
		Motorista m1 = new Motorista();
		Engenheiro e1 = new Engenheiro();
		m1.setNome("João");
		m1.setSobrenome("Silva");
		m1.setMail("jsilva@gmail.com");
		m1.setMatricula(12345);
		m1.setCnh("5645456546");
		e1.setNome("Jonas");
		e1.setSobrenome("Souza");
		e1.setMail("jonass@gmail.com");
		e1.setCrea("8845sdf");
		System.out.println("Nosso motorista é o "+m1.getNome());
		System.out.println("Escreva para "+m1.getMail());
		System.out.println("Nosso engenheiro é o "+e1.getNome()+" "+e1.getSobrenome());
		System.out.println("Entre em contato: "+e1.getMail());


	}
}
