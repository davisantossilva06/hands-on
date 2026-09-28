import java.util.Scanner;

public class CalculadoraComMenu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");

        int opcao = leitor.nextInt();

        double primeiroNumero = leitor.nextDouble();
        double segundoNumero = leitor.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado = " + (primeiroNumero + segundoNumero));
                break;

            case 2:
                System.out.println("Resultado = " + (primeiroNumero - segundoNumero));
                break;

            case 3:
                System.out.println("Resultado = " + (primeiroNumero * segundoNumero));
                break;

            case 4:
                if (segundoNumero == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    System.out.println("Resultado = " + (primeiroNumero / segundoNumero));
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }

        leitor.close();
    }
}
