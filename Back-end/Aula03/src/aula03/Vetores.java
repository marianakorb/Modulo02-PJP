package aula03;

import java.util.Random;

public class Vetores {

	public static void main(String[] args) {
		
		
		double[] valores;
		valores = new double[5];
		
		valores[0] = 5;
		valores[1] = 6;
		
		Random random = new Random();
		
		int[] numeros2 = new int[5];
		
		for(int i = 0; i < valores.length; i++) {
			numeros2[i] = random.nextInt(10);
			System.out.println(numeros2[i]);
		}
		
		int[] numeros = {1, 2, 3, 4, 5, 6};
		
		System.out.println(numeros);
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
