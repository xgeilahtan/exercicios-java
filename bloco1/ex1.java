package bloco1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.println("Cálculo da média de três notas");
        System.out.println("\n==================================");

        System.out.print("Insira a primeira nota: ");
        double n1 = calc.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double n2 = calc.nextDouble();

        System.out.print("Insira a terceira nota: ");
        double n3 = calc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
          System.out.println("Aprovado!");
        } else if (media >= 5 && media < 7) {
          System.out.println("Recuperação!");
        } else {
          System.out.println("Reprovado!");
        }

        System.out.printf("A média é: %.2f%n", media);
        calc.close(); 
    }
}