package br.com.herancateste;

public class Professor extends Pessoa {

	private float salario;
	private String disciplina;

	public Professor(String nome, int idade, char genero, int numero, String dataNascimento, float salario,
			String disciplina) {
		super(nome, idade, genero, new Rg(numero, dataNascimento));
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
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
		System.out.println("Com salário: " + getSalario());
		System.out.println("Que ensina a disciplina: " + getDisciplina());
		System.out.println("Com numero de RG: " + getRg().getNumero());
		System.out.println("E data de nascimento: " + getRg().getDataNascimento());
	}

}
