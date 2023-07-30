import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroParaAdivinhar = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (true) {
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroParaAdivinhar) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativa(s)!");
                break;
            } else if (palpite < numeroParaAdivinhar) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }

    }
}
