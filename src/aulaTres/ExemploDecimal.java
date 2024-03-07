package aulaTres;

import java.text.DecimalFormat;

public class ExemploDecimal {
	public static void main(String[] args) {
		double valor  = 74823478.1056;
		/**
		 * 0 – imprime um dígito se existir, 0 caso contrário
		 * # – imprime um dígito se existir, nada de outra forma
		 * . – indica onde colocar o separador decimal
		 * , – indica onde colocar o separador de agrupamento
		 */
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println(df.format(valor));
		System.out.println("O valor é "+String.format("%.2f",valor));
	}
}
