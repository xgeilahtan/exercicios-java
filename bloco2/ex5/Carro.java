package bloco2.ex5;

public class Carro {

    private String modelo;
    private String marca;
    private int ano;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Volkswagen", 1976);
        Carro carro2 = new Carro("Civic", "Honda", 2020);
        Carro carro3 = new Carro("S10", "Chevrolet", 2010);

        System.out.println("Detalhes dos carros:");

        System.out.println("Carro 1: " + carro1.getModelo() + ", " + carro1.getMarca() + ", " + carro1.getAno());
        System.out.println("Carro 2: " + carro2.getModelo() + ", " + carro2.getMarca() + ", " + carro2.getAno());
        System.out.println("Carro 3: " + carro3.getModelo() + ", " + carro3.getMarca() + ", " + carro3.getAno());
    }



}
