package aulaNove.exemplos.exemploQuatro;

public class Aluno {
	String nome;
	String sobremome;
	String eMail;
	int codigo;
	float notaUm;
	float notaDois;

	public Aluno(String nome, String sobremome, String eMail, int codigo) {
		this.nome = nome;
		this.sobremome = sobremome;
		this.eMail = eMail;
		this.codigo = codigo;
	}


	float calculaMedia(){
		return (notaUm+notaDois)/2;
	}

	String obterStatus(){
		float media = calculaMedia();
		String status;
		if(media >= 8){
			status = "Aprovado";
		}
		else if(media >= 6){
			status = "Recuperação";
		}
		else{
			status = "Reprovado";
		}
		return status;
	}
}
