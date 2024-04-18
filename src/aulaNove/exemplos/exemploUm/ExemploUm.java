package aulaNove.exemplos.exemploUm;

public class ExemploUm {
	public static void main(String[] args) {
		Carro fuscaUm = new Carro();
		fuscaUm.marca = "VW";
		fuscaUm.modelo = "Fusca";
		fuscaUm.velocidade = 0;
		fuscaUm.km = 100000;
		fuscaUm.velocidadeMaxima = 140;
		fuscaUm.anoFabricacao = 1980;
		fuscaUm.cor = "azul";
		//Exemplo dois
		Carro ferrari = new Carro();
		ferrari.marca = "Ferrari";
		ferrari.modelo = "Spider";
		ferrari.velocidade = 0;
		ferrari.km = 50000;
		ferrari.velocidadeMaxima = 250;
		ferrari.anoFabricacao = 2020;
		ferrari.cor = "verde";

		fuscaUm.ligar();
		System.out.println("O "+fuscaUm.modelo+" está ligado? "+fuscaUm.ligado);
		//fuscaUm.desligar();
		//System.out.println("O "+fuscaUm.modelo+" está ligado? "+fuscaUm.ligado);
		fuscaUm.aumentarVelocidade(20);
		System.out.println("A velocidade atual do "+fuscaUm.modelo+" é "+fuscaUm.verificaVelocidade());
		if(fuscaUm.aumentarVelocidade(200)){
			System.out.println("Velocidade atual "+fuscaUm.verificaVelocidade());
		}
		else{
			System.out.println("Não foi possível aumentar a velocidade");
		}




	}
}
