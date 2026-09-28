import java.util.Scanner;

public class SimuladorDeCaixa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double saldo = 1000.00;
        double valor;
        int opcao;

        do {
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Ver saldo");
            System.out.println("4- Sair");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    valor = leitor.nextDouble();

                    if (valor > 0) {
                        saldo += valor;
                        System.out.printf("Depósito realizado. Saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;

                case 2:
                    System.out.println("Digite o valor do saque:");
                    valor = leitor.nextDouble();

                    if (valor <= 0) {
                        System.out.println("Valor de saque inválido.");
                    } else if (valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valor;
                        System.out.printf("Saque realizado. Saldo: R$ %.2f%n", saldo);
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 4:
                    System.out.printf("Saldo final: R$ %.2f%n", saldo);
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        leitor.close();
    }
}
