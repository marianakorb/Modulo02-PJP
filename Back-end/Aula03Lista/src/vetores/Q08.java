package vetores;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número de pessoas: ");
		int n = sc.nextInt();
		
		String[] nomesMenor = new String[n];
		int[] idades = new int[n];
		int[] alturas = new int[n];
		
		int somaAltura = 0;
		int menorDeDezesseis = 0;
		
		for(int i=0; i < n; i++) {
			System.out.println("Nome da pessoa n" + (i+1) + "°");
			String nome = sc.next();
			System.out.println("Idade da pessoa n" + (i+1) + "°");
			idades[i] = sc.nextInt();
			
			if(idades[i] < 16) {
				nomesMenor[i] = nome;
				menorDeDezesseis++;
			}
						
			System.out.println("Altura da pessoa n" + (i+1) + "°");
			alturas[i] = sc.nextInt();
			somaAltura += alturas[i];
			
			
		}
		
		sc.close(); 
		double mediaAltura = (double) somaAltura/n;
		double porcentagem = (menorDeDezesseis * 100 ) / n;
		
		System.out.println("Altura média: " + mediaAltura);
		System.out.println(porcentagem + "% são menores de 16");
			
		for (int i = 0; i < nomesMenor.length; i++) {
			if(nomesMenor[i] != null) {
				
				System.out.println(nomesMenor[i]);
			} else {
				break;
			}
		}
	}

}
