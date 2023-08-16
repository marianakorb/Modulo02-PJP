package listas;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("João");
		lista.add("Maria");
		lista.add("Ana");
		lista.add("Mario");
		
		
		for(String list : lista) {
			System.out.println(list);
		}
		
		
		lista.remove(3); // remove pela posição
		System.out.println(lista.size());
		
		lista.remove("João"); // remove pelo valor do elemento
		
		System.out.println(lista);
		System.out.println(lista.get(1)); // descobrir o elemento pelo index
		
		lista.removeIf(i -> i.charAt(0) == 'M'); // REMOVE QUALQUER ELEMENTO QUE INICIE COM A LETRA 'M'
		System.out.println(lista);
		
		List<Integer> lista2 =  new ArrayList<>();
		lista2.add(2);
		lista2.add(3);
		lista2.add(6);
		lista2.add(4);
		lista2.add(1);
		lista2.add(9);
		
		System.out.println(lista2);
		
		lista2.remove(4); // REMOVE DA POSIÇÃO
		lista2.remove(Integer.valueOf(4)); // REMOVE O ELEMENTO COM ESSE VALOR
		
		lista2.removeIf(i -> i > 4);
		
		lista2.add(1, 23); // (posição, valor)
		System.out.println(lista2);
		
		boolean vazia = lista2.isEmpty(); // diz se está vazia ou não
		System.out.println(vazia);
		
		int ultimo = lista2.get(lista2.size() - 1);
		System.out.println(ultimo);
		
	}

}
