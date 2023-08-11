package respostas;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		do {

			System.out.println("Digite o valor de X: ");
			x = sc.nextInt();

			System.out.println("Digite o valor de Y: ");
			y = sc.nextInt();

			if (x < 0 && y > 0) {
				System.out.println("2°Q");
			} else if (x > 0 && y > 0) {
				System.out.println("1°Q");
			} else if (x < 0 && y < 0) {
				System.out.println("3°Q");
			} else if (x > 0 && y < 0) {
				System.out.println("4°Q");
			} else {
				break;
			}

		} while ((x != 0) && (y != 0));

	}

}
