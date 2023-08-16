package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		
		
		for(int i=0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i+1) + "° valor");
			vetor[i] = sc.nextInt();
		}
		
		Arrays.sort(vetor);
			
		sc.close();
		

	}

}
