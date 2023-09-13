import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        var terminal = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o valor do segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
        // realizar o for para imprimir os números com base na variável contagem
    }
}