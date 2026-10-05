import java.util.Scanner;

public class TentativasDeLogin {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senhaDigitada;
        int tentativas = 0;

        do {
            System.out.println("Digite sua senha:");
            senhaDigitada = leitor.nextInt();
            tentativas++;

            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta.");
                System.out.println();
            }
        } while (senhaDigitada != senhaCorreta);

        System.out.println("Login realizado com sucesso!");
        System.out.println("Login realizado após " + tentativas + " tentativas.");

        leitor.close();
    }
}
