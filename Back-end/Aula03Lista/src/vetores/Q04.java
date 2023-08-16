package vetores;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de números: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		int quantPares = 0;
		
		for(int i=0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + "° número");
			vetor[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		for(int i=0; i < n; i++) {
			
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				quantPares++;
			}
		}
		
		System.out.println("Quantidade de números pares: " + quantPares);
	}

}
