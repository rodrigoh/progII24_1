package aulaSeis.correcao;

import java.util.Random;

/*
 Ler dois vetores, X e Y de 10 elementos cada um (ocupando as
 posições de 0 a 10 em cada vetor). Intercalar os elementos
 desses dois vetores formando assim um novo vetor R de 20
 elementos, onde nas posições
 ímpares de R estejam os elementos de X e nas posições
 pares os elementos de Y.
 Escrever o vetor R, após sua completa geração.
 */
public class Exercicio10 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vx = new int[10];
		int[] vy = new int[10];
		int[] vr = new int[20];
		System.out.println("Dados no vetor x...");
		for(int i=0;i<vx.length;i++){
			vx[i] = aleatorio.nextInt(20);
			System.out.print(vx[i]+" ");
		}
		System.out.println("\nDados no vetor y...");
		for(int i=0;i<vy.length;i++){
			vy[i] = aleatorio.nextInt(20);
			System.out.print(vy[i]+" ");
		}
		System.out.println("\nDados no vetor r...");
		int ix = 0;
		int iy = 0;
		for(int i=0; i<vr.length;i++){
			if(i%2==0){
				vr[i] = vy[iy];
				iy++;
			}
			else{
				vr[i] = vx[ix];
				ix++;
			}
			System.out.print(vr[i]+" ");
		}
	}
}
