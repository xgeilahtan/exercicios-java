package bloco2.ex6;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
             throw new IllegalArgumentException("O raio deve ser um valor positivo.");
        } else {
            this.raio = raio;
        }
    }

    public void exibirRaio() {
        System.out.printf("O raio do círculo é: %.2f%n", raio);
    }

    public void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo com raio %.2f é: %.2f%n", raio, area);
    }

    public static void main(String[] args) {
        Circulo raio = new Circulo(5.0);
        raio.exibirRaio();
        raio.calcularArea();
    }
}
