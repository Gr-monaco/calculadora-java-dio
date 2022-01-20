package br.com.dio;

import static br.com.dio.Calculadora.*;

public class Main {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        float a = cal.somaFloat(1f, 2f);
        float b = cal.subtracaoFloat(1f, 2f);
        float c = cal.multiplicacaoFloat(1f, 3f);
        float d = cal.divisaoFloat(2f, 2f);

        //Testando
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //Testando saidas do método do curso
        soma(1,2);
        subtracao(1,2);
        divisao(1,2);
        multiplicacao(1,3);
    }
}
