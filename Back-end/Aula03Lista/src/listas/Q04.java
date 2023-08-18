package listas;

import java.util.ArrayList;
import java.util.List;

public class Q04 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(7);
		lista.add(8);
		lista.add(16);
		lista.add(27);
		lista.add(5);
		lista.add(1);
		
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		for(int i= 0; i < lista.size(); i++) {
			
			if(lista.get(i) % 2 == 0) {
				pares.add(lista.get(i));
			} else {
				impares.add(lista.get(i));
			}
		}
		
		System.out.println("Pares: " + pares.toString());
		System.out.println("Ímpares: " + impares.toString());

	}

}
