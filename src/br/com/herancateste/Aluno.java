package br.com.herancateste;

public class Aluno extends Pessoa {

	private float mensalida;
	private String curso;

	public Aluno(String nome, int idade, char genero, int numero,
			String dataNascimento, float mensalida, String curso) {
		super(nome, idade, genero, new Rg(numero, dataNascimento));
		this.mensalida = mensalida;
		this.curso = curso;
	}

	public float getMensalida() {
		return mensalida;
	}

	public void setMensalida(float mensalida) {
		this.mensalida = mensalida;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ":" + fala);

	}

	@Override
	public void mostrarDados() {
		System.out.println();
		System.out.println("----- Professor: " + getNome() + "-----");
		System.out.println("De Idade: " + getIdade());
		System.out.println("Do genero: " + getGenero());
		System.out.println("Com salário: " + getMensalida());
		System.out.println("Que ensina a disciplina: " + getCurso());
		System.out.println("Com numero de RG: " + getRg().getNumero());
		System.out.println("E data de nascimento: " + getRg().getDataNascimento());
	}

}
