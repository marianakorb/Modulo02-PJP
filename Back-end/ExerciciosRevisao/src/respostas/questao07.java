package respostas;

import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			
			System.out.println("São multiplos");
			
		} else {
			
			System.out.println("Não são multíplos");
		}
	}

}
