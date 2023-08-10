package respostas;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}

	}

}
