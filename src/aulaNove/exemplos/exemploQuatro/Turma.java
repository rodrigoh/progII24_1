package aulaNove.exemplos.exemploQuatro;

import java.util.Scanner;

public class Turma {
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		Aluno alunoUm = new Aluno("Roger", "Silva", "roger@gmail.com", 123);
//		alunoUm.codigo = 123;
//		alunoUm.nome = "Roger";
//		alunoUm.sobremome = "Silva";
//		alunoUm.eMail = "roger@gmail.com";
		System.out.print("Qual a primeira nota do "+alunoUm.nome+": ");
		alunoUm.notaUm = ler.nextFloat();
		System.out.print("Qual a segunda nota do "+alunoUm.nome+": ");
		alunoUm.notaDois = ler.nextFloat();
		System.out.println("Com estas notas o aluno "+alunoUm.nome);
		System.out.println("Obtém um média de "+alunoUm.calculaMedia());
		System.out.println("E está "+alunoUm.obterStatus());
	}
}
