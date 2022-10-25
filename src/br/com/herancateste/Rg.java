package br.com.herancateste;

public class Rg {
	private int numero;
	private String dataNascimento;
	
	public Rg() {
	}
	
	public Rg(int numero, String dataNascimento) {
		this.numero = numero;
		this.dataNascimento = dataNascimento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
