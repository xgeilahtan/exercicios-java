package classes_abstratas;

public class TestaCadastro {

    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();
        cadastro.cadastroPessoas(10);
        Funcionario funcionario = new Funcionario("João", new Data(1, 1, 1990), 3000.00f);
        Cliente cliente = new Cliente("Maria", new Data(2, 2, 1995));
        Gerente gerente = new Gerente("Carlos", new Data(3, 3, 1985), 5000.00f, "Vendas");

        cadastro.imprimeCadastro();
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(gerente);
        
    }
    
}
