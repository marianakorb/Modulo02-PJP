package respostas;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {

		String ref01;
		String ref02;
		int quant01;
		int quant02;
		double valor01;
		double valor02;
		double total;

		Scanner sc = new Scanner(System.in);

		System.out.println("Código da peça 1: ");
		ref01 = sc.next();

		System.out.println("Quantidade peça 1: ");
		quant01 = sc.nextInt();

		System.out.println("Valor peça 1: ");
		valor01 = sc.nextDouble();
		
		System.out.println("Código da peça 2: ");
		ref02 = sc.next();

		System.out.println("Quantidade peça 2: ");
		quant02 = sc.nextInt();

		System.out.println("Valor peça 2: ");
		valor02 = sc.nextDouble();
		
		double t01 = quant01 * valor01;
		double t02 = quant02 * valor02;
		
		total = t01 + t02;
		
		System.out.printf("TOTAL: %.2f", total);
	}

}
