/**
 * @author Vini
 * 
 * 
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
