package matrizes;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		String maior = "";
		int maiorValor = matriz[0][0];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.println("Digite o valor da posição [" + i + "] [" + j + "]");
				matriz[i][j] = sc.nextInt();

				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];

					maior = "O maior valor: " + maiorValor + "\nPosição: [" + i + "] [" + j + "]";
				}
			}
		}

		System.out.println(maior);

		sc.close();

	}

}
