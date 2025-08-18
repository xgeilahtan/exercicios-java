package classes_abstratas;

public class CadastroPessoas {
    private int qtdAtual;
    private Pessoa[] pessoas;

    public void cadastroPessoas(int capacidade) {
        this.pessoas = new Pessoa[capacidade];
        this.qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pessoa) {
        if (qtdAtual < pessoas.length) {
            pessoas[qtdAtual] = pessoa;
            qtdAtual++;
        }
    }
    public void imprimeCadastro() {
        for (int i = 0; i < qtdAtual; i++) {
            pessoas[i].imprimeDados();
            if (pessoas[i] instanceof Funcionario) {
                Funcionario f = (Funcionario) pessoas[i];
                System.out.println("Imposto: " + f.calculaImposto());
            }
            System.out.println("---------------------");
        }
    }
    
}
