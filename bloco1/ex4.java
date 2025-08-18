package bloco1;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inteiros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = 0;
        for (int j : inteiros) {
            if (j % 2 != 0) {
                soma += j;
            }
        }
        System.out.printf("Soma dos números ímpares: %d%n", soma);        
        
        scanner.close();
    }
}
