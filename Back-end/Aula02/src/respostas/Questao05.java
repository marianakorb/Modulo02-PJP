package respostas;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um valor inteiro: ");
		x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {

			if(x % i == 0) {
				System.out.print("{ " + i + " } ");
			}
		}
		
		sc.close();
		
	}

}
