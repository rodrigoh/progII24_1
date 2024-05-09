package aulaOnze.exemploAcesso;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João","Silva","jsilva@gmail.com");
		p1.setNome("João");
		p1.setSobrenome("Silva");
		p1.setAltura(180);
		System.out.println("A pessoa chama "+p1.getNomeCompleto());
		System.out.println("E mede "+p1.getAltura()+" cm");
	}
}
