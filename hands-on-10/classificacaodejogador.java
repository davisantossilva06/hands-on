import java.util.Scanner;

public class ClassificacaoJogador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        int horasSemanais = leitor.nextInt();

        if (idade < 12) {
            System.out.println("Jogador Mirim");
        } else if (idade <= 17) {
            if (horasSemanais <= 10) {
                System.out.println("Jogador Casual");
            } else {
                System.out.println("Jogador Frequente");
            }
        } else {
            if (horasSemanais <= 5) {
                System.out.println("Jogador Casual");
            } else if (horasSemanais <= 15) {
                System.out.println("Jogador Gamer");
            } else {
                System.out.println("Gamer Hardcore");
            }
        }

        leitor.close();
    }
}
