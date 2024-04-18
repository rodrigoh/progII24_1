package aulaNove.exemplos.exemploTres;

public class Lampada {
	String marca;
	String modelo;
	String cor;
	boolean ligado;

	void ligar(){
		ligado = true;
	}

	void desligar(){
		ligado = false;
	}

	boolean estaLigado(){
		return ligado;
	}
}
