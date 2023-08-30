package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> tarefas = new ArrayList<>();
		List<String> tarefasConcluidas = new ArrayList<>();

		while (true) {
			System.out.println("\nMenu");
			System.out.println("1-  Adicionar Tarefa");
			System.out.println("2- Marcar tarefa como concluida");
			System.out.println("3- Remover tarefa");
			System.out.println("4- Listar tarefa");
			System.out.println("5- Sair");

			System.out.println("Escolha");
			int escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite a descrição da tarefa: ");
				sc.nextLine();
				String descricao = sc.nextLine();
				
				tarefas.add(descricao);
				System.out.println("Tarefa adicionada com sucesso");
				break;
			case 2:
				System.out.println("Digite o numero da tarefa a ser marcada como concluida");
				imprimirTarefas(tarefas);
				int tarefaIndex = sc.nextInt();
				if (tarefaIndex <= 1 && tarefaIndex <= tarefas.size()) {
					tarefasConcluidas.add(tarefas.get(tarefaIndex - 1));
					tarefas.remove(tarefaIndex - 1);
					System.out.println("Tarefa marcada como concluida");
					
				} else {
					System.out.println("Indice inválido");
				}
			case 3:
				System.out.println("Digite o numero da tarefa a ser removida");
				imprimirTarefas(tarefas);
				tarefaIndex = sc.nextInt();
				if (tarefaIndex <= 1 && tarefaIndex <= tarefas.size()) {
					tarefas.remove(tarefaIndex - 1);
					System.out.println("Tarefa removida");
				} else {
					System.out.println("indice invalido");
				}
			case 4:
				imprimirTarefas(tarefas);
				break;
				
			
			case 5:
				imprimirTarefas(tarefas);
				System.out.println("Saindo do programa");
				System.exit(0);
			}
			sc.close();
		}

	}

	private static void imprimirTarefas(List<String> tarefas) {
		for (int i = 0; i < tarefas.size(); i++) {

		}

	}

}
