package respostas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o número do funcionário: ");
		String numFunc = sc.next();
		
		System.out.println("Digite o número de horas trabalhadas");
		double horasTrabalhadas = sc.nextDouble();
		
		System.out.println("Digite quanto o funcionário recebe por hora: ");
		double salarioPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * salarioPorHora;
		
		System.out.printf("O funcionário " + numFunc + " recebe %.2f", salario);
		
		sc.close();
		
	}

}
