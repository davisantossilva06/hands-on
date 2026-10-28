import java.util.Scanner;

public class NomesEmOrdemContraria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[15];

        for (int indice = 0; indice < nomes.length; indice++) {
            System.out.print("Digite o " + (indice + 1) + "º nome: ");
            nomes[indice] = entrada.nextLine();
        }

        System.out.println("\nNomes na sequência contrária:");

        for (int indice = nomes.length - 1; indice >= 0; indice--) {
            System.out.println(nomes[indice]);
        }

        entrada.close();
    }
}
