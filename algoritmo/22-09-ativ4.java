import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int nota = leitor.nextInt();

        while (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Digite novamente:");
            nota = leitor.nextInt();
        }

        System.out.println("Nota válida: " + nota);

        leitor.close();
    }
}
