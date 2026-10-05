import java.util.Scanner;

public class EscolhaDoRole {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quanto dinheiro você possui?");
        double dinheiro = leitor.nextDouble();

        System.out.println("Está chovendo?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int estaChovendo = leitor.nextInt();

        if (dinheiro < 20) {
            System.out.println("Rolê em casa.");
        } else if (dinheiro < 50) {
            if (estaChovendo == 1) {
                System.out.println("Streaming + comida.");
            } else if (estaChovendo == 2) {
                System.out.println("Praça ou parque.");
            } else {
                System.out.println("Opção inválida.");
            }
        } else if (dinheiro < 100) {
            System.out.println("Cinema.");
        } else {
            System.out.println("Digite sua idade:");
            int idade = leitor.nextInt();

            if (idade < 18) {
                System.out.println("Shopping + cinema.");
            } else {
                System.out.println("Show, restaurante ou churrasco com a galera.");
            }
        }

        leitor.close();
    }
}
