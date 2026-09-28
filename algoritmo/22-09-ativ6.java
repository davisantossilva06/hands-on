import java.util.Scanner;

public class DescontoPorCategoria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorCompra = leitor.nextDouble();
        int categoriaCliente = leitor.nextInt();
        double percentualDesconto;

        switch (categoriaCliente) {
            case 1:
                percentualDesconto = 0.05;
                break;

            case 2:
                percentualDesconto = 0.10;
                break;

            case 3:
                percentualDesconto = 0.15;
                break;

            default:
                System.out.println("Categoria inválida");
                leitor.close();
                return;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        leitor.close();
    }
}
