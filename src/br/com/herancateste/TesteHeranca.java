/**
 * @author Vini
 * 
 * Laboratório 1
Neste laboratório, vamos criar as classes Professor e Aluno, que herdarão 
atributos e métodos da classe abstrata Pessoa.
A – Criando a classe RG
1. Crie uma classe chamada RG, com os atributos privados numero do tipo int
e dataNasc do tipo String;
2. Crie os métodos get e set para cada atributo;
3. Crie um construtor que receba um parâmetro do tipo int e um do tipo 
String, e os atribua a seus respectivos atributos;
4. Salve e compile a classe.
B – Criando a classe Pessoa
1. Crie uma classe abstrata chamada Pessoa com os seguintes atributos:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• rg do tipo RG.
2. Crie os métodos get e set para cada atributo;
3. Crie um construtor que receba os parâmetros a seguir e os atribua a seus 
respectivos atributos:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• rg do tipo RG.
4. Crie dois métodos abstratos com os nomes falar, que receba o parâmetro 
fala do tipo String, e mostrarDados;
5. Salve e compile a classe.


C – Criando a classe Professor
1. Crie uma classe com o nome Professor, que deve ser subclasse de Pessoa;
2. Declare os atributos privados salario do tipo float e disciplina do tipo 
String;
3. Crie os métodos get e set para cada atributo;
4. Crie um construtor que receba os seguintes parâmetros:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• numeroRG do tipo int;
• dataNasc do tipo String;
• salario do tipo float;
• disciplina do tipo String.
5. Dentro do construtor, chame o operador super passando os parâmetros 
nome, idade, sexo e um objeto do tipo RG com os parâmetros numeroRG e 
dataNasc;
6. Atribua os parâmetros salario e disciplina a seus respectivos atributos;
7. Implemente o método abstrato falar e, dentro dele, imprima uma frase 
contendo o atributo nome da pessoa e o valor do parâmetro informado;
8. Implemente o método abstrato mostrarDados e, dentro dele, imprima 
todos os atributos da classe e da superclasse;
9. Salve a classe e compile.

D – Criando a classe Aluno
1. Crie uma classe com o nome Aluno, que deve ser subclasse de Pessoa;
2. Declare os atributos privados mensalidade, do tipo float, e curso, do tipo 
String;
3. Crie os métodos get e set para cada atributo;
4. Crie um construtor que receba os seguintes parâmetros:
• nome do tipo String;
• idade do tipo int;
• sexo do tipo char;
• numeroRG do tipo int;
• dataNasc do tipo String;
• mensalidade do tipo float;
• curso do tipo String.
5. Dentro do construtor, chame o operador super passando os parâmetros 
nome, idade, sexo e um objeto do tipo RG com os parâmetros numeroRG e 
dataNasc;
6. Atribua os parâmetros mensalidade e curso a seus respectivos atributos;
7. Implemente o método abstrato falar e, dentro dele, imprima uma frase 
contendo o atributo nome da pessoa e o valor do parâmetro informado;
8. Implemente o método abstrato mostrarDados e, dentro dele, imprima 
todos os atributos da classe e da superclasse;
9. Salve a classe e compile

E – Testando todas as classes criadas
1. Crie uma classe chamada Cap9_Lab1 e insira a estrutura básica de um 
programa Java;
2. Crie três objetos do tipo Pessoa. Para dois objetos, utilize o construtor 
da classe Aluno e, para o outro, utilize o construtor da classe Professor, 
passando os devidos parâmetros;
3. Utilize o método falar com cada objeto e, depois, mostre os dados de cada 
objeto com o método mostrarDados;
4. Compile e execute o programa
 */
package br.com.herancateste;

import java.util.Locale;

public class TesteHeranca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Pessoa claudia = new Aluno("Claudia", 22, 'F', 375647128, "12/08/1990", (float) 799.9, "Administração");
		Pessoa manuel = new Aluno("Manuel", 19, 'M', 521234567, "15/06/1993", (float) 1099.9, "Ciência da Computação");
		Pessoa rafael = new Professor("Rafael", 38, 'M', 261454789, "Portugues", 2500, "12/08/1990");
		
		rafael.falar("Manuel?");
		manuel.falar("Presente!");
		rafael.falar("Claudia?");
		claudia.falar("Presente!");
		
		rafael.mostrarDados();
		claudia.mostrarDados();
		manuel.mostrarDados();
	}

}
