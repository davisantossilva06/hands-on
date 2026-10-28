import java.util.Scanner;

public class SeparacaoDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];

        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("Digite o " + (indice + 1) + "º número: ");
            numeros[indice] = entrada.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                positivos[quantidadePositivos] = numero;
                quantidadePositivos++;
            } else if (numero < 0) {
                negativos[quantidadeNegativos] = numero;
                quantidadeNegativos++;
            }
        }

        System.out.print("Vetor de números positivos: [");

        for (int indice = 0; indice < quantidadePositivos; indice++) {
            System.out.print(positivos[indice]);

            if (indice < quantidadePositivos - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        System.out.print("Vetor de números negativos: [");

        for (int indice = 0; indice < quantidadeNegativos; indice++) {
            System.out.print(negativos[indice]);

            if (indice < quantidadeNegativos - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        entrada.close();
    }
}
