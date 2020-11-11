package br.com.aulajava;

public class SomandoValores {

	/*
	 * Informar 2 valores e realizar a soma de ambos e apresentar o resultado da
	 * seguintes forma
	 * 
	 * "5 + 5 = 10";
	 *
	 * Com System.out.println();
	 * 
	 * Quando o valor1 for maior que o valor2 Some + 2 ao valor da soma
	 * 
	 * Quando o valor1 for menor que o valor2 diminua - 5 ao valor da soma
	 * 
	 * "Ocorreu um ajuste no valor da soma já que valor1 > valor2 valor1 < valor2 "
	 * 
	 */

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 4;
		boolean eMaior = false;

		int soma = valor1 + valor2;

		// o uso do if

		System.out.println(valor1 > valor2);

		if (valor1 > valor2) {
			soma = soma + 2;
			eMaior = true;
			// soma += 2;
		} else if (valor1 < valor2) {
			soma = soma - 5;
			// soma -=5;
		}
		System.out.println(("" + valor1).concat(" + " + valor2).concat(" = " + soma));

	}
}
