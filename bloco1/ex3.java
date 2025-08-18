package bloco1;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe o número");
        System.out.println("\n==================================");

        int numAleatorio = (int)(Math.random() * 101) + 1;
        int tentativa;

        do {
            System.out.println("\nTente adivinhar o número entre 0 e 100:");
            tentativa = scanner.nextInt();

            if (tentativa < numAleatorio) {
                System.out.println("Muito baixo!");
            }else if (tentativa > numAleatorio) {
                System.out.println("Muito alto!");
            }else {
                System.out.printf("Parabéns! Você acertou o número!");
            }
        }
        while (tentativa != numAleatorio);

        scanner.close();
    }
}
