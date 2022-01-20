package br.com.dio;

/**
 * Classe do exercicio 1
 */
public class Calculadora {

    public float somaFloat(float A, float B){
        return A+B;
    }

    public float subtracaoFloat(float A, float B){
        return A-B;
    }

    public float multiplicacaoFloat(float A, float B){
        return A*B;
    }

    public float divisaoFloat(float A,float B){
        return A/B;
    }

    public static void soma(double A, double B){
        double result = A + B;
        System.out.println(result);
    }

    public static void subtracao(double A, double B){
        double result = A - B;
        System.out.println(result);
    }

    public static void multiplicacao(double A, double B){
        double result = A * B;
        System.out.println(result);
    }

    public static void divisao(double A, double B){
        double result = A / B;
        System.out.println(result);
    }
}
