package respostas;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senha;

		do {

			System.out.println("Digite a senha: ");
			senha = sc.nextInt();

			if (senha == 2002) {
				System.out.println("Acesso Permitido");
			} else {
				System.out.println("Senha inválida");
			}

		} while (senha != 2002);

		sc.close();
	}

}
