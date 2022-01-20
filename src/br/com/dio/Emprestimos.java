package br.com.dio;

/**
 * Classe para calculo de emprestismos
 */
public class Emprestimos {
    /**
     * Retorna a taxa de juros do emprestimo.
     * A taxa básica por mês é 0.15.
     * @param parcelas Quantidade de parcelas
     * @return taxa em double
     */
    private static double calcularTaxa(int parcelas){
        return 0.15 * parcelas;
    }

    /**
     * Dá print no valor final do emprestimo.
     * @param dinheiro Valor inicial de dinheiro
     * @param parcelas quantidade de parcelas
     */
    public static void calcularEmprestimo(double dinheiro, int parcelas){
        double parcelas_calculada = calcularTaxa(parcelas)*dinheiro;
        double dinheiro_final = parcelas_calculada + dinheiro;
        System.out.println("R$:"+ dinheiro_final);
    }
}
