package vetores;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[10];
		int soma = 0;
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i+1) + "° valor");
			soma += sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
