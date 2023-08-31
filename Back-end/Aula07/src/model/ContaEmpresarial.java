package model;

public class ContaEmpresarial extends Conta{
	
	private double limiteEmprestimo;

	public ContaEmpresarial(int numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= valor + 5;
		}
	}
	
	public void emprestimo(double valor) {
		if(valor > limiteEmprestimo) {
			System.out.println("Valor de emprestimo acima do limite");
		} else {
			saldo = saldo + valor - 10;
		}
	}
}
