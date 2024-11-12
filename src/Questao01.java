import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("APERTE (3) para sair ou (1) para continuar:");
            opcao = leia.nextInt();

            if (opcao == 1) {
                System.out.println("CALCULANDO O SALDO MÉDIO:");
                System.out.print("QUAL O SEU SALDO MÉDIO?: ");
                int saldoMedio = leia.nextInt();
                double credito = 0;

                if (saldoMedio <= 500) {
                    System.out.println("NÃO TEM ACRÉSCIMO.");
                } else if (saldoMedio >= 501 && saldoMedio <= 1000) {
                    System.out.println("OCORREU UM ACRÉSCIMO DE 30%");
                    credito = saldoMedio * 0.3;
                } else if (saldoMedio >= 1001 && saldoMedio <= 3000) {
                    System.out.println("OCORREU UM ACRÉSCIMO DE 40%");
                    credito = saldoMedio * 0.4;
                } else if (saldoMedio > 3000) {
                    System.out.println("OCORREU UM ACRÉSCIMO DE 50%");
                    credito = saldoMedio * 0.5;
                }

                System.out.println("O VALOR DO CRÉDITO É: "+ credito);
                System.out.println("DE ACORDO COM O SEU SALDO MÉDIO DE: "+ saldoMedio);
            }
        } while (opcao != 3);

        leia.close();
    }
}
/*O Banco X concederá um crédito especial com juros de 2% aos seus clientes
de acordo com o saldo médio no último ano. Fazer um programa que leia o saldo médio de
um cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma
mensagem informando o saldo médio e o valor de crédito. */
