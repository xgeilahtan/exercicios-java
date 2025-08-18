package classes_abstratas;

public class Cliente extends Pessoa {

    public Cliente(String nome, Data dataNascimento) {
        super(nome, dataNascimento);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
    }

}
