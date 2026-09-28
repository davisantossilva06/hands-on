import java.util.Scanner;

public class MaiorDeDois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int primeiroNumero = leitor.nextInt();
        int segundoNumero = leitor.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero);
        } else if (segundoNumero > primeiroNumero) {
            System.out.println(segundoNumero);
        } else {
            System.out.println("Iguais");
        }

        leitor.close();
    }
}
