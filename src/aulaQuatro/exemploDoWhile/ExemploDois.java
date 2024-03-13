package aulaQuatro.exemploDoWhile;

public class ExemploDois {
	public static void main(String[] args) {
		int cont = 10;
		while(cont<10){
			System.out.print(cont+" ");
			cont++;
		}
		System.out.println("\nDo...While");
		do{
			System.out.print(cont+" ");
			cont++;
		}
		while (cont<10);

	}
}
