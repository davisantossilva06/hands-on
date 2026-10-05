import java.util.Scanner;

public class EntradaNoShow {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();

        System.out.println("Possui ingresso?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int possuiIngresso = leitor.nextInt();

        if (possuiIngresso == 2) {
            System.out.println("Entrada negada: ingresso obrigatório.");
        } else if (possuiIngresso == 1) {
            if (idade >= 18) {
                System.out.println("Entrada liberada!");
            } else {
                System.out.println("Está acompanhado de um responsável?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int acompanhado = leitor.nextInt();

                if (acompanhado == 1) {
                    System.out.println("Entrada liberada!");
                } else {
                    System.out.println("Entrada negada.");
                }
            }
        } else {
            System.out.println("Opção inválida.");
        }

        leitor.close();
    }
}
