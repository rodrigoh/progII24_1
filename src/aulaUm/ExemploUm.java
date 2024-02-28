package aulaUm;

public class ExemploUm {
	public static void main(String[] args) {
		System.out.println("Imprime texto na tela");
		System.out.print("Imprime sem quebrar linha");
		System.out.printf("Imprime como no C\n");
		String nome = "Rodrigo";
		String sobrenome = "Henrich";
		int alturaCm = 180;
		float alturaMetros = (float) 1.8;
		System.out.println("Nome: "+nome+" "+sobrenome);
		System.out.println("Alura: "+alturaCm+"cm, altura: "+alturaMetros+"m");
		System.out.printf("Alura: %d cm altura: %.2f\n",alturaCm,alturaMetros);
	}
}
