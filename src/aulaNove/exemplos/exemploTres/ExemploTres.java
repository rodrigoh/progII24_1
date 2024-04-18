package aulaNove.exemplos.exemploTres;

public class ExemploTres {
	public static void main(String[] args) {
		Lampada sala = new Lampada();
		Lampada cozinha = new Lampada();
		Lampada garagem =  new Lampada();
		Lampada quarto = new Lampada();
		Lampada corredor = new Lampada();
		sala.marca = "Taschibra";
		sala.cor = "amarela";
		sala.modelo = "Led";
		cozinha.marca = "LG";
		cozinha.cor = "branca";
		cozinha.modelo = "halogena";
		garagem.marca = "Philips";
		garagem.cor = "branca";
		garagem.modelo = "fluorescente";
		sala.ligar();
		System.out.println("A lâmpara "+sala.modelo+" da sala está ligada? "+sala.estaLigado());
	}
}
