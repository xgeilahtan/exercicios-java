package bloco1;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        System.out.println("Tabuada de um número");
        System.out.println("\n==================================");

        System.out.print("Insira um número para ver sua tabuada: ");
        int numero = tabuada.nextInt();
        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
        tabuada.close();
    }
}
