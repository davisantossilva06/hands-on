import java.util.Scanner;

public class LanchoneteUniversitaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao;
        double subtotal = 0;
        double percentualDesconto = 0;
        double valorDesconto;
        double valorFinal;

        do {
            System.out.println("===== LANCHONETE =====");
            System.out.println();
            System.out.println("1 - Pizza         - R$ 30,00");
            System.out.println("2 - Hambúrguer    - R$ 20,00");
            System.out.println("3 - Batata        - R$ 12,00");
            System.out.println("4 - Refrigerante  - R$ 8,00");
            System.out.println("0 - Finalizar");
            System.out.println();
            System.out.println("Escolha uma opção:");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    subtotal += 30;
                    System.out.println("Pizza adicionada ao pedido.");
                    break;

                case 2:
                    subtotal += 20;
                    System.out.println("Hambúrguer adicionado ao pedido.");
                    break;

                case 3:
                    subtotal += 12;
                    System.out.println("Batata adicionada ao pedido.");
                    break;

                case 4:
                    subtotal += 8;
                    System.out.println("Refrigerante adicionado ao pedido.");
                    break;

                case 0:
                    System.out.println("Pedido finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();
        } while (opcao != 0);

        if (subtotal < 50) {
            System.out.println("Sem desconto.");
        } else if (subtotal < 100) {
            percentualDesconto = 0.05;
            System.out.println("5% de desconto.");
        } else {
            System.out.println("Você é estudante?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int estudante = leitor.nextInt();

            if (estudante == 1) {
                percentualDesconto = 0.15;
                System.out.println("15% de desconto.");
            } else {
                percentualDesconto = 0.10;
                System.out.println("10% de desconto.");
            }
        }

        valorDesconto = subtotal * percentualDesconto;
        valorFinal = subtotal - valorDesconto;

        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        leitor.close();
    }
}
