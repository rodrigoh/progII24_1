package aulaDezesseis;

public class ExemploString {
	public static void main(String[] args) {
		String nome = "Rodrigo";
		String sobrenome = "Henrich";
		//String nomeCompleto = nome+sobrenome;
		String nomeCompleto = nome.concat(sobrenome);
		System.out.println(nomeCompleto);
		if(nome.equals("Rodrigo")){
			System.out.println("O nome é Rodrigo");
		}
		if(nome.equalsIgnoreCase("rodrigo")){
			System.out.println("O nome é Rodrigo");
		}
		//
		System.out.println("A String nome inicia com R "+nome.startsWith("R"));
		System.out.println("A String nome inicia com R "+nome.startsWith("T"));
		System.out.println("A String nome termina com o "+nome.endsWith("o"));
		System.out.println("A String nome termina com T "+nome.endsWith("T"));

		System.out.println("A letra o aparace em nome na posição "+nome.indexOf('o'));
		System.out.println("A última ocorrência da letra o em nomes está em "+nome.lastIndexOf('o'));
		//Passando para um vetor de caracteres
		char[] palavra = nome.toCharArray();
		for(int i=0;i<palavra.length;i++){
			System.out.print(palavra[i]+" ");
		}
		int numero = Integer.parseInt("9");
		System.out.println("\n"+numero);

		String frase = "Aula de programação, onde aprendemos programação de " +
						"computadores";
		frase = frase.replace("programação","manutenção");
		System.out.println(frase);
		//Separando a frase em um vetor de Strings
		String[] fraseVetor = frase.split(" ");
		for(String p:fraseVetor){
			System.out.print("'"+p+"' ");
		}
	}
}
