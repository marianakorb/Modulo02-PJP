package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Conta;
import model.ContaEmpresarial;
import model.ContaPoupanca;

public class Problema02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Conta> contas = new ArrayList<>();
		
		System.out.println("Digute o número de contas que serão preenchidas");
		int n = sc.nextInt();
		
		for(int i =0; i < n; i++) {
			System.out.println("Conta " + (i+1));
			
			System.out.print("Conta poupança ou empresarial (p/e)? ");
			char tipoConta = sc.next().charAt(0);
			
			System.out.print("Número da conta: ");
			int numConta = sc.nextInt();
			
			System.out.println("Nome do titular: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Saldo inicial: ");
			double saldoInicial = sc.nextDouble();
			
			if(tipoConta == 'p') {
				System.out.println("Taxa de juros (%): ");
			
				double taxa = sc.nextDouble();
				
				contas.add(new ContaPoupanca(numConta, nome, saldoInicial, taxa));
			} else {
				System.out.println("Limite de emprestimo: ");
				double limite = sc.nextDouble();
				contas.add(new ContaEmpresarial(numConta, nome, saldoInicial, limite));
			}
			
			double saque = 100;
			double saldoTotal = 0;
			for(Conta cc : contas) {
				
				if(cc instanceof ContaPoupanca) {
					((ContaPoupanca) cc).atualizarSaldo();
				}
				
				if (cc instanceof ContaEmpresarial) {
					((ContaEmpresarial) cc).emprestimo(100);
				}
				System.out.println();
				System.out.println("Titular: " + cc.getTitular() + " ---- Saldo atual: " + cc.getSaldo());
				cc.sacar(saque);
				
				System.out.println("Saque de " + saque + " realido");
				
				System.out.println("Titular: " + cc.getTitular() + " ---- Saldo atualizado: " + cc.getSaldo());
				
				saldoTotal += cc.getSaldo();
			}
			
			System.out.println(saldoTotal);
		}
		sc.close();
	}

}
