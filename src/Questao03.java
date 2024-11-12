import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 1, somaIdades = 0, mediaIdade = 0, porcentagem = 0;
        int totalPessoas = 0, casados = 0, solteiros = 0, viuvos = 0, desquitadosSeparados = 0;
        String estadoCivil;

        do {
            System.out.println("Qual a sua idade? ou tecle (0) para finalizar: ");
            idade = leia.nextInt();
            leia.nextLine();
            
            if (idade == 0) {
                break;
            }

            System.out.println("Estado civil (C-casado, S-solteiro, V-viúvo e D-desquitado/separado): ");
            estadoCivil = leia.nextLine();

            if (estadoCivil.equals("C") || estadoCivil.equals("c")) {
                casados++;
            } else if (estadoCivil.equals("S") || estadoCivil.equals("s")) {
                solteiros++;
            } else if (estadoCivil.equals("V") || estadoCivil.equals("v")) {
                viuvos++;
                somaIdades += idade;
            } else if (estadoCivil.equals("D") || estadoCivil.equals("d")) {
                desquitadosSeparados++;
            }

            totalPessoas++;
        } while (idade != 0);

        if (viuvos > 0) {
            mediaIdade = somaIdades / viuvos;
        }
        if (totalPessoas > 0) {
            porcentagem = (int) ((double) desquitadosSeparados / totalPessoas * 100);
        }
        System.out.println("A quantidade de pessoas casadas: " + casados);
        System.out.println("A quantidade de pessoas solteiras: " + solteiros);
        System.out.println("A média das idades das pessoas viúvas: " + mediaIdade);
        System.out.println("A porcentagem de pessoas desquitadas ou separadas, dentre todas as pessoas analisadas: " + porcentagem + "%");

        leia.close();
    }
}
/*Elabore um programa que leia a idade e o estado civil (C-casado, S-solteiro,
V-viúvo e D-desquitado/separado) de várias pessoas. Considere que o programa termina de
receber entradas quando se digita a idade zero (0). Ao final, calcule e imprima:
a) A quantidade e pessoas casadas
b) A quantidade de pessoas solteiras
c) A média das idades das pessoas viúvas;
d) A porcentagem de pessoas desquitadas ou separadas, dentre todas as pessoas
analisadas. */