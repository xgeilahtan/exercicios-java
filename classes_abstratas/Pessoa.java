package classes_abstratas;

public abstract class Pessoa {
    private String nome;
    private Data dataNascimento;

    public Pessoa(String nome, Data dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public Data getDataNascimento() {
        return dataNascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public abstract void imprimeDados();
}
