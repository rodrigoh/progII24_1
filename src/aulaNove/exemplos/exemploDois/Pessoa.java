package aulaNove.exemplos.exemploDois;

public class Pessoa {
	int idade;
	String nome;
	String sobrenome;
	String cpf;

	String obterNomeCompleto(){
		return nome+" "+sobrenome;
	}
	boolean maiorIdade(){
		if (idade >= 18){
			return true;
		}
		return false;
	}
}
