package br.com.dio;

import static br.com.dio.Calculadora.*;
import static br.com.dio.Emprestimos.calcularEmprestimo;
import static br.com.dio.Horario.horas;
import static br.com.dio.Trapezios.area;

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

        //Teste de horas
        horas(1);
        horas(12);
        horas(13);
        horas(18);
        horas(19);
        horas(24);
        horas(25);

        //Teste de emprestimo
        calcularEmprestimo(1000,3);
        calcularEmprestimo(2000,2);
        calcularEmprestimo(3000,5);

        //Teste de sobrecarga
        area(5);
        area(5,8);
        area(9,2,5);

    }
}
