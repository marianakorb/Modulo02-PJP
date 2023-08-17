package listas;

import java.util.ArrayList;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(15);
		lista.add(8);
		lista.add(23);
		lista.add(19);
		lista.add(27);
		lista.add(5);
		
		int soma = 0;
		
		for(int i= 0; i < lista.size(); i++) {
			
			soma += lista.get(i);
		}
		
		double media = (double) soma / lista.size();
		
		System.out.printf("Média: %.2f ", media);
	}

}
