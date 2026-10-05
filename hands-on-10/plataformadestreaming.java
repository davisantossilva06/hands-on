import java.util.Scanner;

public class PlataformaStreaming {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("===== STREAMING =====");
        System.out.println();
        System.out.println("1 - Netflix");
        System.out.println("2 - Disney+");
        System.out.println("3 - Prime Video");
        System.out.println("4 - Spotify");
        System.out.println("5 - Sair");
        System.out.println();
        System.out.println("Escolha uma opção:");

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Netflix.");
                System.out.println("Prepare a pipoca!");
                break;

            case 2:
                System.out.println("Você escolheu Disney+.");
                System.out.println("Aproveite a diversão!");
                break;

            case 3:
                System.out.println("Você escolheu Prime Video.");
                System.out.println("Bom filme!");
                break;

            case 4:
                System.out.println("Você escolheu Spotify.");
                System.out.println("Aumente o som!");
                break;

            case 5:
                System.out.println("Você escolheu Sair.");
                System.out.println("Até logo!");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        leitor.close();
    }
}
