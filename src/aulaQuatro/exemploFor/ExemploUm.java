package aulaQuatro.exemploFor;

public class ExemploUm {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			System.out.print(i+" ");
		}
		System.out.println("\nMais de uma variável...");
		for(int i=0,j=9;i<10 && j>=0;i++,j--){
			System.out.println("i="+i+", j="+j);
		}
		System.out.println("\nFor sem inicialização");
		int i=0;
		for(;i<=100;i+=2){
			System.out.print(i+" ");
		}
		System.out.println("\nFor sem incremento");
		i=0;
		for(;i<=100;){
			if(i%2==0){
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("\nFor decrescente...");
		for(int j=9;j>=0;j--){
			System.out.print(j+" ");
		}

	}
}
