package bloco9.ex34.VcRiquinho;

public interface ContaCliente {
    
    void depositar(double valor);
    void sacar(double valor);
    double consultarSaldo();
    void transferir(double valor, ContaCliente contaDestino);
    String getNumeroConta();
    String getNomeTitular();
    String getTipoConta();
    void setNomeTitular(String nomeTitular);
    void setTipoConta(String tipoConta);
    void setNumeroConta(String numeroConta);
    void exibirDetalhesConta();
    void exibirExtrato();
    void exibirSaldo();
    
}
