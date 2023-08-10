package respostas;

import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <=25) {
			
			System.out.println("O número está ente 0 e 25.");
			
		} else if (num >= 26 && num <= 50) {
			
			System.out.println("O número está ente 26 e 50.");
			
		} else if (num >= 51 && num <= 75) {
			
			System.out.println("O número está ente 51 e 75.");
			
		} else if (num >= 76 && num <= 100) {
			
			System.out.println("O número está ente 76 e 100.");
			
		} else {
			
			System.out.println("Fora do intervalo");
		}
	}

}
