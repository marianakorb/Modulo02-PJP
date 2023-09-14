package model;

public class Funcionario {
	
	String nome;
	String idade;
	String funcao;
	
	public Funcionario(String nome, String idade, String funcao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public String getIdade() {
		return idade;
	}

	public String getFuncao() {
		return funcao;
	}
	

}
