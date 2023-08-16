package listas;

import java.util.ArrayList;
import java.util.List;

public class Q03 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		
		lista.add(15);
		lista.add(8);
		lista.add(23);
		lista.add(19);
		lista.add(27);
		lista.add(5);
		
		System.out.println(lista.contains(19));
		System.out.println(lista.contains(25));
		
	}

}
