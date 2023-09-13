import java.util.Scanner;

/**
 * Classe para objetos do tipo Contador, onde serão capturados através do terminal
 * dois parametros para o mesmo e realizados as requeridas operacoes.
 * 
 * @author Vinícius Santos
 * @version 0.1
 * @since 13-09-2023
 */

public class Contador {

    /**
     * Método principal para receber dados via terminal, por meio da classe Scanner
     * no fim da captura das informações irá imprimir o número resultante da subtracao 
     * dos parametros.
     * 
     * @author Vinícius Santos
     * @param parametroUm       int - Primeiro parametro a ser capturado.
     * @param parametroDois     int - Segundo parametro a ser capturado.
     * 
     */
    public static void main(String[] args) {

        var terminal = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o valor do segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            // CHAMADA DO MÉTODO CONTAR
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    /**
     * Método contar recebe como parametro os parametros parametroUm e parametroDois
     * faz a valiacao e caso ela seja verdadeira o metodo lanca uma execao, caso con-
     * trario sera feito a impressao do numero resultante da subtracao.
     * 
     * @author Vinícius Santos
     * @param contagem       int - Subtracao do parametroDois menos o parametroUm.
     * 
     */

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // VALIDACAO: SE parametroUm é MAIOR QUE parametroDois E LANCAR EXECAO
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
        
    }
}