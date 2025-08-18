package bloco2.ex7;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return String.format("Carro [marca = %s, modelo = %s, numeroPortas = %d]", getMarca(), getModelo(), getNumeroPortas());
    }
}
