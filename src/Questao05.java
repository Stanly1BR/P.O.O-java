import java.util.Scanner;

public class Questao05 {

    public static boolean eTriangulo(double x, double y, double z) {
        return (x < y + z) && (y < x + z) && (z < x + y);
    }

    public static String tipoTriangulo(double x, double y, double z) {
        if (x == y && y == z) {
            return "Triângulo Equilátero";
        } else if (x == y || y == z || x == z) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double x = leia.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = leia.nextDouble();
        System.out.print("Digite o valor de Z: ");
        double z = leia.nextDouble();

        
        if (eTriangulo(x, y, z)) {
            System.out.println("Os valores formam um triângulo.");
            System.out.println("Tipo: " + tipoTriangulo(x, y, z));
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }

        leia.close();
    }
}
/*Crie um programa que leia três valores X, Y e Z (reais), em seguida, aplicando
uma função, verificar se eles podem ser os comprimentos dos lados de um triângulo. Caso
o retorno seja true, utilize uma outra função para classificar se é um triângulo equilátero,

isósceles ou escalenos. Se eles não formarem um triângulo, faça um tratamento para que
seja emitida uma mensagem informando ao usuário.

Considere as seguintes propriedades:
• Regra para ser um triângulo: O comprimento de cada lado em um triângulo é menor que a
soma dos outros dois lados;
• Equiláteros: tem os comprimentos dos três lados iguais;
• Isósceles: tem os comprimentos de dois lados iguais;
• escaleno: tem os comprimentos dos três lados diferentes. */