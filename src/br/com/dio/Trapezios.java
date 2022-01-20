package br.com.dio;

public class Trapezios {
    /**
     * Printa a area de um quadrado
     * @param lado tamanho do lado do quadrado
     */
    public static void area(double lado){
        System.out.println(lado*lado);
    }

    /**
     * Printa a area de um retangulo
     * @param lado_a Lado 1
     * @param lado_b Lado 2
     */
    public static void area(double lado_a, double lado_b){
        System.out.println(lado_a*lado_b);
    }

    /**
     * Printa a area de um trapezio
     * @param lado_a Lado 1
     * @param lado_b Lado 2
     * @param altura Altura
     */
    public static void area(double lado_a, double lado_b, double altura){
        System.out.println((lado_a+lado_b)*altura/2);
    }
}
