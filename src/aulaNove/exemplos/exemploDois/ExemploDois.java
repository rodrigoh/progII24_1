package aulaNove.exemplos.exemploDois;

public class ExemploDois {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Jonas";
		p1.sobrenome = "Silva";
		p1.idade = 20;
		p1.cpf = "000.000.000-00";
		if(p1.maiorIdade()){
			System.out.println(p1.obterNomeCompleto()+" é maior de idade");
		}
		else{
			System.out.println(p1.obterNomeCompleto()+" é menor de idade");
		}

		Pessoa p2 = new Pessoa();
		p2.nome = "Ana";
		p2.sobrenome = "Souza";
		p2.idade = 15;
		p2.cpf = "000.000.000-00";
		if(p2.maiorIdade()){
			System.out.println(p2.obterNomeCompleto()+" é maior de idade");
		}
		else{
			System.out.println(p2.obterNomeCompleto()+" é menor de idade");
		}
	}
}
