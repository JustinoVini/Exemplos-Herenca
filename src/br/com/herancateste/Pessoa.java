package br.com.herancateste;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private char genero;
	private Rg rg;

	public Pessoa() {
	}

	public Pessoa(String nome, int idade, char genero, Rg rg) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Rg getRg() {
		return rg;
	}

	public void setRg(Rg rg) {
		this.rg = rg;
	}
	
	public abstract void falar (String fala);
	public abstract void mostrarDados();
	
}
