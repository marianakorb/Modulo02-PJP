package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Funcionario;

public class Problema01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Quantos funcionário você vai registrar? ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++ ) {
			System.out.println("Funcionário " + (i+1));
			System.out.println("Id: ");
			int id = sc.nextInt();
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			
			lista.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println("Entre com o id do funcionário que terá aumento ");
		int id = sc.nextInt();
		
		for (Funcionario func : lista) {
			if(func.getId() == id) {
				System.out.println("Entre com a porcentagem");
				double porcetagem = sc.nextDouble();
				func.aumentoSalario(porcetagem);
			}
		}
		
		System.out.println();
		System.out.println("Lista de funcionários");
		for (Funcionario func : lista) {
			System.out.println(func.toString());
		}
		
		sc.close();
	}

}
