package aulaQuatro.exemploWhile;

public class ExemploUm {
	public static void main(String[] args) {
		System.out.println("Looping crescente...");
		int cont = 0;
		while(cont<=10){
			System.out.print(cont+" ");
			cont++;
		}
		System.out.println("\nLooping decrescente...");
		cont = 10;
		while(cont>=0){
			System.out.print(cont+" ");
			cont--;
		}

	}
}
