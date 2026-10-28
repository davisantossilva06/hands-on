public class IntercalacaoVetores {
    public static void main(String[] args) {
        int[] vetor1 = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
        int[] vetor2 = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};
        int[] vetorIntercalado = new int[20];

        int posicao = 0;

        for (int indice = 0; indice < vetor1.length; indice++) {
            vetorIntercalado[posicao] = vetor1[indice];
            posicao++;

            vetorIntercalado[posicao] = vetor2[indice];
            posicao++;
        }

        System.out.print("Intercalação: [");

        for (int indice = 0; indice < vetorIntercalado.length; indice++) {
            System.out.print(vetorIntercalado[indice]);

            if (indice < vetorIntercalado.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
