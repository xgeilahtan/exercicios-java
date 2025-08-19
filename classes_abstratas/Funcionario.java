package classes_abstratas;

public class Funcionario extends Pessoa {
    protected Float salario;

    public Funcionario(String nome, Data dataNascimento, Float salario) {
        super(nome, dataNascimento);
        this.salario = salario;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Salário: " + salario);
    }
    
    public Float calculaImposto(){
        salario = salario - (salario * 0.03f);
        return salario;
    }
}
