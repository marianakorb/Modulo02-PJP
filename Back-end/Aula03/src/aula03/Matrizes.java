package aula03;

import java.util.Arrays;

public class Matrizes {

	public static void main(String[] args) {
		
		int [] [] matriz = { {1,2,3}, {4,5,6} };
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
		int [] [] matriz02 = new int[3][3];
		matriz02[1][2] = 5;
		
		System.out.println(matriz02[1][2]);
		
		for(int i = 0; i < matriz02.length; i++) {
			System.out.println(Arrays.toString(matriz02[i]));
		}
	}

}
