import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[6];
        int[] pares = new int[6];
        int[] impares = new int[6];

        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int somaPares = 0;

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("Digite o " + (indice + 1) + "º número: ");
            numeros[indice] = entrada.nextInt();

            if (numeros[indice] % 2 == 0) {
                pares[quantidadePares] = numeros[indice];
                somaPares++;
                quantidadePares++;
            } else {
                impares[quantidadeImpares] = numeros[indice];
                quantidadeImpares++;
            }
        }

        System.out.print("\nNúmeros pares digitados: [");

        for (int indice = 0; indice < quantidadePares; indice++) {
            System.out.print(pares[indice]);

            if (indice < quantidadePares - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        System.out.println("Soma dos números pares: " + somaPares);

        System.out.print("Números ímpares digitados: [");

        for (int indice = 0; indice < quantidadeImpares; indice++) {
            System.out.print(impares[indice]);

            if (indice < quantidadeImpares - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        entrada.close();
    }
}
