import java.util.Scanner;

public class LojaDeSkins {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int saldo = 1500;
        int opcao;
        int preco;
        String nomeSkin;

        do {
            System.out.println("===== LOJA DE SKINS =====");
            System.out.println();
            System.out.println("Saldo: " + saldo + " moedas");
            System.out.println();
            System.out.println("1 - Skin Básica   - 100 moedas");
            System.out.println("2 - Skin Rara     - 250 moedas");
            System.out.println("3 - Skin Épica    - 500 moedas");
            System.out.println("4 - Skin Lendária - 1000 moedas");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.println("Escolha uma skin:");

            opcao = leitor.nextInt();
            preco = 0;
            nomeSkin = "";

            switch (opcao) {
                case 1:
                    nomeSkin = "Skin Básica";
                    preco = 100;
                    break;

                case 2:
                    nomeSkin = "Skin Rara";
                    preco = 250;
                    break;

                case 3:
                    nomeSkin = "Skin Épica";
                    preco = 500;
                    break;

                case 4:
                    nomeSkin = "Skin Lendária";
                    preco = 1000;
                    break;

                case 0:
                    System.out.println("Saindo da loja...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            if (opcao >= 1 && opcao <= 4) {
                if (saldo >= preco) {
                    saldo -= preco;
                    System.out.println(nomeSkin + " comprada!");
                    System.out.println("Saldo restante: " + saldo + " moedas");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            }

            System.out.println();
        } while (opcao != 0);

        System.out.println("Saldo final: " + saldo + " moedas");

        leitor.close();
    }
}
