package respostas;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		double primeiro;
		double segundo;
		
		int i = 0;
		
		System.out.println("Digite um valor inteiro: ");
		n = sc.nextInt();
		
		while(i < n ) {
			System.out.println("Digite o primeiro número");
			primeiro =  sc.nextDouble();
			System.out.println("Digite o segundo número");
			segundo = sc.nextDouble();
			
			if(segundo == 0) {
				System.out.println("Divisão impossível");
			} else {
				double divisao = primeiro / segundo;
				System.out.printf("Divisão: %.2f \n", divisao);
			}
			
			i++;
		}
		
		sc.close();
		
	}

}
