package classes_abstratas;

public class Gerente extends Funcionario{
    
    private String area;

    public Gerente(String nome, Data dataNascimento, Float salario, String area) {
        super(nome, dataNascimento, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public Float calculaImposto() {
        salario = salario - (salario * 0.05f);
        return salario;
    }
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Área: " + area);
    }

}
