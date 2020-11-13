package br.com.aulajava;

public class Calculadora {
    

    static int valorPadraoMultiplicacao = 2;
    // float eu consigo atribuir valor inteiro
    float valorPadraoSoma = 3.3f;
    static int valorPadraoSomaInteiro = (int) 3.4f;

    int realizarMultiplicacao(int valor) {
        return valor * valorPadraoMultiplicacao;
    }

    public float realizaSoma(int valor) {
        return valor + this.valorPadraoSoma;
    }
}
}