import java.util.Scanner;

public class MultiplicacaoVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        for (int indice = 0; indice < vetorA.length; indice++) {
            System.out.print("Digite o " + (indice + 1) + "º elemento: ");
            vetorA[indice] = entrada.nextInt();
        }

        for (int indice = 0; indice < vetorA.length; indice++) {
            vetorB[indice] = vetorA[indice] * 3;
        }

        System.out.print("Elementos do vetor B: [");

        for (int indice = 0; indice < vetorB.length; indice++) {
            System.out.print(vetorB[indice]);

            if (indice < vetorB.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        entrada.close();
    }
}
