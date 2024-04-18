package aulaNove.exemplos.exemploUm;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int anoFabricacao;
	int km;
	float velocidadeMaxima;
	float velocidade;
	boolean ligado;

	boolean aumentarVelocidade(float valor){
		if(velocidade +valor < velocidadeMaxima){
			velocidade+=valor;
			return true;
		}
		else{
			return false;
		}
	}

	void frear(int valor){
		if(valor <= velocidade){
			velocidade-=valor;
		}
	}

	void ligar(){
		ligado = true;
	}

	void desligar(){
		ligado = false;
	}

	String verificaVelocidade(){
		return velocidade+"km/h";
	}
}
