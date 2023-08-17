package vetores;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max = 10;
		String[] quartos = new String[max];

		System.out.println("Quantos quartos serão alugados? (1 a 10) ");
		int n = sc.nextInt();

		String[] registrados = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nome do " + (i + 1) + "° estudante: ");
			String nome = sc.next();

			System.out.println("Email do " + (i + 1) + "° estudante: ");
			String email = sc.next();

			System.out.println("Número do quarto do " + (i + 1) + "° estudante: ");
			int quarto = sc.nextInt();

			if (quartos[quarto] == null) {
				quartos[quarto] = quarto + ": " + nome + ", " + email;

				registrados[i] = "/nQuarto: " + quarto + "\nNome: " + nome + "\nEmail: " + email;

			} else {
				System.out.println("Quarto ocupado.");
			}
		}
		
		sc.close();
		
		for (int i = 0; i < registrados.length ; i++) {
			System.out.println("\nAluguel #" + (i+1));
			System.out.println(registrados[i]);
		}
		
		
		for (int i = 0; i < quartos.length ; i++) {
			
			if(quartos[i] != null) {
				System.out.println("\n" +quartos[i]);
			}
		
		}
	}

}
