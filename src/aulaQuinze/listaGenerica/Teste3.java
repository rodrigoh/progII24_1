package aulaQuinze.listaGenerica;

public class Teste3 {
	public static void main(String[] args) {
		Lista<Pessoa> listaPessoa = new Lista<>();
		listaPessoa.adiciona(new Pessoa("Jonas","jonas@terra.com.br"));
		listaPessoa.adiciona(new Pessoa("Ana","ana@gmail.com"));
		System.out.println(listaPessoa);
	}
}
