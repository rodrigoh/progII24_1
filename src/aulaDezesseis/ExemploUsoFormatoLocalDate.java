package aulaDezesseis;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploUsoFormatoLocalDate {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Pegando a data do dia
		LocalDate hoje = LocalDate.now();
		//(aaaa, mm, dd)
		LocalDate dataNascimento = LocalDate.of(1995, 6, 5);
		System.out.println(dataNascimento);
		Period periodo = Period.between(dataNascimento, hoje);
		// Obtém a idade da pessoa
		System.out.println(periodo.getYears());
		//Formatando as datas
		//Opção simples
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataBr = dataNascimento.format(formato);
		System.out.println(dataBr);
		//Opção por extenso
		formato = DateTimeFormatter.ofPattern("dd 'de' MMMM " +
						"'de' yyyy", new Locale("pt", "BR"));
		dataBr = dataNascimento.format(formato);
		System.out.println(dataBr);
		//Separando datas
		int dia = dataNascimento.getDayOfMonth();
		int mes = dataNascimento.getMonthValue();
		int ano = dataNascimento.getYear();
		System.out.println(dia+" "+mes+" "+ano);
		//Lendo uma data do teclado
		formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		boolean valida = true;
		LocalDate data = LocalDate.now();
		do {
			System.out.print("Digite um data no formato (dd/MM/aaaa): ");
			String dataStr = ler.next();
			try{
				data = LocalDate.parse(dataStr,formato);
				valida = true;
			}
			catch (DateTimeParseException e){
				System.out.println("Formato inválido!"+e);
				valida = false;
			}
		}
		while (!valida);
		//Data
		System.out.println(data);

	}
}
