package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a ordem da matriz: ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		// Preenchendo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1));
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		System.out.println("Diagonal Principal");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int negativos = 0;
		System.out.println("\n Valores negativo");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] < 0) {
					negativos++;
				}
		}
		}
		System.out.println(negativos);
		
		sc.close();
	}

}
