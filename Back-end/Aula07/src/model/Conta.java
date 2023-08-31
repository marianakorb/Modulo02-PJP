package model;

public class Conta {
	
	private int numero;
	private String titular;
	protected double saldo;
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
}
