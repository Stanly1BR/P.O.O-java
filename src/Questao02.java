import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int time = 4, salario = 0, bairro = 0;
        int confianca = 0, sergipe = 0, outro = 0;
        int somaSalarial = 0, mediaSalarial = 0, moradoresTrocedores = 0;

        do {
            System.out.println("Qual seu time do coração? 1 - Confiança, 2 - Sergipe e 3 - Outro (0 para sair): ");
            time = leia.nextInt();
            if (time == 0) break;
            System.out.println("Qual bairro você mora? 1 - Pereira Lobo, 2 - Centro e 3 - Outro: ");
            bairro = leia.nextInt();
            System.out.println("Qual o seu salário?: ");
            salario = leia.nextInt();

            if (time == 1) {
                confianca++;
                somaSalarial += salario; 
            } else if (time == 2) {
                sergipe++;
            } else if (time == 3) {
                outro++;
                if (bairro == 2) {
                    moradoresTrocedores++;
                }
            }
        } while (time != 0);
        if (confianca > 0) {
            mediaSalarial = somaSalarial / confianca;
        }

        System.out.println("QUANTIDADE DE TORCEDORES POR CLUBE:");
        System.out.println("Confiança: " + confianca);
        System.out.println("Sergipe: " + sergipe);
        System.out.println("Outro: " + outro);
        System.out.println("A média salarial dos torcedores do Confiança: " + mediaSalarial);
        System.out.println("O número de pessoas moradoras do Centro, torcedores de outros clubes: " + moradoresTrocedores);
        
        leia.close();
    }
}

/*Uma pesquisa de opinião realizada em Aracaju teve as seguintes perguntas:
Qual seu time do coração? 1 - Confiança, 2 - Sergipe e 3 - Outro. Qual bairro você mora? 1
- Pereira Lobo, 2 - Centro e 3 - Outro. Qual o seu salário?
Considerando que a entrada de dados finaliza quando for digitado 0 para o time. Elabore
um algoritmo que, ao final da leitura, imprima:
a) O número de torcedores por clube;
b) A média salarial dos torcedores do Confiança;
c) O número de pessoas moradoras do Centro, torcedores de outros clubes. */