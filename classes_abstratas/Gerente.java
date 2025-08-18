package classes_abstratas;

public class Gerente extends Funcionario{
    
    private String area;

    public Gerente(String nome, Data dataNascimento, Float salario, String area) {
        super(nome, dataNascimento, salario);
        this.area = area;
    }

    @Override
    public void imprimeDados() {}

    public Float calculaImposto() {
        salario = salario - (salario * 0.5f);
        return salario;
    }

}
