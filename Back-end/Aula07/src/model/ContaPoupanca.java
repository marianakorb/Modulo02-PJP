package model;

public class ContaPoupanca extends Conta{
	
	private double taxaJuros;
	

	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		
	}

	public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo = saldo + (saldo * taxaJuros)/100;
	}
	
}
