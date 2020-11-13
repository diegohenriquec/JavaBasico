package br.com.aulajava;

public class CalcularSalario {

    public static void main(String[] args) {
        // Informem 2 valores do tipo float.
        // 1 valor é o salario base
        // 2 valor é o total das vendas
        // Apresentar valor do salario final + comissão que representa 10% do valor das
        // vendas.
        double base = 100.5;
        // valor do salario base
        double TotalVendas = 900.5;
        // valor total das vendas
        double percentual = 10.0 * TotalVendas;
        // percentual 10% de 900.5
        double salario = base + (percentual);
        // resultado da soma entre salario base e total de vendas
        System.out.println(salario);
        // Mostrar resultado

    }
}
