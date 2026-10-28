import java.util.Scanner;

public class NumerosPrimosNoVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean encontrouPrimo = false;

        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("Digite o " + (indice + 1) + "º número: ");
            numeros[indice] = entrada.nextInt();
        }

        System.out.println("\nNúmeros primos e suas posições:");

        for (int indice = 0; indice < numeros.length; indice++) {
            int numero = numeros[indice];
            int quantidadeDivisores = 0;

            if (numero > 1) {
                for (int divisor = 1; divisor <= numero; divisor++) {
                    if (numero % divisor == 0) {
                        quantidadeDivisores++;
                    }
                }

                if (quantidadeDivisores == 2) {
                    System.out.println(
                        "Número primo: " + numero +
                        " | Posição: " + indice
                    );

                    encontrouPrimo = true;
                }
            }
        }

        if (!encontrouPrimo) {
            System.out.println("Nenhum número primo foi encontrado.");
        }

        entrada.close();
    }
}
