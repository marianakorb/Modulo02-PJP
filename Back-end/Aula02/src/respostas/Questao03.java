package respostas;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int escolha;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		do {

			System.out.println("Escolha sua preferência");
			System.out.println("[1] ÁLCOOL");
			System.out.println("[2] GASOLINA");
			System.out.println("[3] DIESEL");
			System.out.println("[4] fim");
			escolha = sc.nextInt();

			if (escolha == 1) {
				alcool++;
			} else if (escolha == 2) {
				gasolina++;
			} else if (escolha == 3) {
				diesel++;
			} else if (escolha == 4) {
				System.out.println("Muito Obrigado!");
				System.out.println("Álcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
			} else {
				System.out.println("Escolha Inválida. Digite novamente.");
			}

		} while (escolha != 4);
		
		sc.close();
	}

}
