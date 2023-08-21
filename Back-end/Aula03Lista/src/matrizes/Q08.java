package matrizes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas: ");
		int m = sc.nextInt();

		System.out.println("Digite o numero de colunas: ");
		int n = sc.nextInt();

		Random random = new Random();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = random.nextInt(10);
			}
		}

		for (int i = 0; i < matriz.length; i++) {

			System.out.println(Arrays.toString(matriz[i]));
		}

		System.out.println("Escolha um número da matriz");
		int X = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == X) {
					
					System.out.println("Position: " + i + ", " + j);
					if(j > 0) {						
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if ( j < n) {
						
						System.out.println("right: " + matriz[i][j+1]);
					}
					if (i > 0) {
						
						System.out.println("Up: " + matriz[i-1][j]);
					}
					
					if(i < m) {
						
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}

		sc.close();

	}

}


