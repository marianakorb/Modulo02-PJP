package respostas;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um valor inteiro positivo");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			double q = Math.pow(i, 2);
			double c = Math.pow(i, 3);
			
			System.out.print(i + " ");
			System.out.print(q + " ");
			System.out.println(c);
		}
		
		sc.close();

	}

}
