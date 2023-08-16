package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
		while(true) {
			System.out.println("\nMenu");
			System.out.println("[1] Adicionar item");
			System.out.println("[2] Remover item");
			System.out.println("[3] Exibir lista");
			System.out.println("[4] Sair do programa");
			System.out.println("Escolha uma opção: ");
			int escolha = sc.nextInt();
			sc.nextLine();
			
			switch (escolha) {
			case 1:
				System.out.println("Digite o nome do item: ");
				String item = sc.nextLine();
				lista.add(item);
				System.out.println("Item adicionado");
				break;
			case 2:
				System.out.println("Itens da lista ");
				for(int i = 0; i < lista.size(); i++) {
					System.out.println("Item " + i + " " + lista.get(i));
				}
				
				System.out.println("Digite o item a ser removido: ");
				int itemRemover = sc.nextInt();
				
				if(itemRemover < lista.size()) {
					lista.remove(itemRemover);
					System.out.println("Item removido");
				} else {
					System.out.println("Item nao existe");
				}
				break;
			case 3: 
				for(int i = 0; i < lista.size(); i++) {
					System.out.println("Item " + i + " " + lista.get(i));
				}
				break;
			case 4: 
				System.out.println("Saindo do programa...");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");
				
			}
			
		}

	}

}
