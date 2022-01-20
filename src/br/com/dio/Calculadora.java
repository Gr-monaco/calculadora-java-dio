package br.com.dio;

/**
 * Classe do exercicio 1
 */
public class Calculadora {
    /**
     * Função que retorna a soma de dois floats
     * @param A numero 1
     * @param B numero 2
     * @return retorno
     */
    public float somaFloat(float A, float B){
        return A+B;
    }

    /**
     * Retorna a subtração de dois floats
     * @param A numero 1
     * @param B numero 2
     * @return retorno
     */
    public float subtracaoFloat(float A, float B){
        return A-B;
    }

    /**
     * Retorna a multiplicação de dois floats
     * @param A numero 1
     * @param B numero 2
     * @return retorno
     */
    public float multiplicacaoFloat(float A, float B){
        return A*B;
    }

    /**
     * Retorna divisão de dois Floats
     * @param A numero 1
     * @param B numero 2
     * @return retorno
     */
    public float divisaoFloat(float A,float B){
        return A/B;
    }

    /**
     * Dá print na soma de dois numeros
     * @param A numero 1
     * @param B numero 2
     */
    public static void soma(double A, double B){
        double result = A + B;
        System.out.println(result);
    }

    /**
     * Dá print na subtração de dois numeros
     * @param A numero 1
     * @param B numero 2
     */
    public static void subtracao(double A, double B){
        double result = A - B;
        System.out.println(result);
    }

    /**
     * Dá print na multiplicação de dois numeros
     * @param A numero 1
     * @param B numero 2
     */
    public static void multiplicacao(double A, double B){
        double result = A * B;
        System.out.println(result);
    }

    /**
     * Dá print na divisão de dois numeros
     * @param A numero 1
     * @param B numero 2
     */
    public static void divisao(double A, double B){
        double result = A / B;
        System.out.println(result);
    }
}
