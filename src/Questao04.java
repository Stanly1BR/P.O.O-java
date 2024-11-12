import java.util.Scanner;

public class Questao04 {
    public static void classeEleitoral(int idade) {
        if (idade < 16) {
            System.out.println("não eleitor");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("eleitor obrigatório");
        } else if ((idade >= 16 && idade < 18) || idade >= 65) {
            System.out.println("eleitor facultativo");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int idade;

        do {
            System.out.println("Qual a sua idade: ");
            idade = leia.nextInt();
            if (idade == 0) {
                break;
            }
            classeEleitoral(idade);
            System.out.println("Digite (0) para finalizar");
        } while (idade != 0);
        
        leia.close();
    }
}

/*Questão 04. Crie um programa que leia a idade de uma pessoa e utilize um método
(função) para retornar sua classe eleitoral, considere a assinatura do método a seguir:

Classificação:
- não eleitor (abaixo de 16 anos);
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive). */
