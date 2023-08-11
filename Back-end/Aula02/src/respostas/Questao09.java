package respostas;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int out = 0;
		int in = 0;
		
		System.out.println("Digite um valor de 1 a 1000");
		n = sc.nextInt();
		
		int i = 0;
		
		while(i < n) {
			
			System.out.println("Digite o " + (i+1) + "° número");
			int num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}
			
			i++;
		}
		
		System.out.println(in + " in");
		System.out.println(out  + " out");
		
		sc.close();
	}

}
