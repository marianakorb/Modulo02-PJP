package vetores;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número inteiro: ");
		int n = sc.nextInt();
		
		double[] reais = new double[n];
		double soma = 0.0;
		
		for(int i=0; i < n; i++) {
			System.out.println("Digite um número real ");
			reais[i] = sc.nextDouble();
			soma+= reais[i];
		}
		
		double media = soma / reais.length;
		System.out.printf("Média: %.3f \n", media);
		
		System.out.print("Valores abaixo da média: ");
		for(int i=0; i < n; i++) {
			if(reais[i] < media) {
				System.out.print(reais[i] + " ");
			}
		}
		
		sc.close();
		
	}

}
