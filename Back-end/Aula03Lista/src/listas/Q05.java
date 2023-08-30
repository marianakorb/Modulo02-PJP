package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> ids = new ArrayList<>();
		List<String> nomes = new ArrayList<>();
		List<Double> salarios = new ArrayList<>();
		
		 System.out.println("Quantos funcionarios voce quer registrar? ");
		 int num = sc.nextInt();
		 
		 for(int i =0; i < num; i++) {
			 System.out.println("Funcionario: " + (i+1));
			 System.out.println("Id ");
			 ids.add(sc.nextInt());
			 System.out.println("Nome ");
			 sc.nextLine();
			 nomes.add(sc.next());
			 System.out.println("Salario ");
			 salarios.add(sc.nextDouble());
		 }
		 
		 System.out.println("Informe o id do funcionario que terá aumento: ");
		 int id = sc.nextInt();
		 
		 for (int i = 0; i < ids.size(); i++) {
			 if(ids.get(i) == id) {
				 System.out.println("Entre com a porcentagem: ");
				 double porcentagem = sc.nextDouble();
				 double salario = salarios.get(i);
				 double novoSalario = salario + (salario * porcentagem) / 100;
				 salarios.set(i, novoSalario);
			 }
		 }
		 
		 System.out.println("Lista de funcionarios");
		 for(int i=0; i < ids.size(); i++) {
			 System.out.println(ids.get(i) + ", " + nomes.get(i) + ", " + salarios.get(i));
		 }
		 
		 sc.close();
	}

}
