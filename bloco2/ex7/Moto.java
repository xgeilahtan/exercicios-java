package bloco2.ex7;

public class Moto extends Veiculo {
    
    private Double cilindrada;

    public Moto(String marca, String modelo, Double cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return String.format("Moto [marca = %s, modelo = %s, cilindrada = %.2f]", getMarca(), getModelo(), getCilindrada());
    }
}
