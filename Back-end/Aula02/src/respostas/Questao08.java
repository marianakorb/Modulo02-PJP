package respostas;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um valor inteiro");
		n = sc.nextInt();
		int num = n;
		int fatorial = n;
		
		if(n == 0 || n == 1) {
			fatorial = 1;
		}
		
		while (n > 1) {
			
			fatorial = fatorial * (n - 1);
			n--;
		}
		
		System.out.println("Fatorial de " + num + " é " + fatorial);
		sc.close();
	}

}
