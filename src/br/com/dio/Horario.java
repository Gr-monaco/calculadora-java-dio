package br.com.dio;

/**
 * Classe para retorno de horas
 */
public class Horario {
    /**
     * Retorna mensagem apropriada segundo o horário
     * @param hora horário a ser analisado
     */
    public static void horas(int hora){
        if (hora >=0 && hora <12 ) {
            System.out.println("Bom dia.");
        }else if (hora >=12 && hora <18){
            System.out.println("Boa tarde.");
        } else if (hora >=18 && hora <=24){
            System.out.println("Boa noite.");
        } else {
            System.out.println("Coloque um horário válido");
        }
    }
}
