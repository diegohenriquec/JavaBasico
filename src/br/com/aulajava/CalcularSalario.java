package br.com.aulajava;

public class CalcularSalario {

    public static void main(String[] args) {
        // Informem 2 valores do tipo float.
        // 1 valor é o salario base
        // 2 valor é o total das vendas
        // Apresentar valor do salario final + comissão que representa 10% do valor das
        // vendas.
        double valor1 = 100.5;
        // valor do salario base
        double valor2 = 9000.5;
        // valor total das vendas
        double percentual = 10.0 / 9000.5;
        // percentual 10% de 88.5
        double resultado = valor1 + (percentual);
        //resultado da soma entre salario base e total de vendas
        System.out.println(resultado);
        //Mostrar resultado

    }
}
