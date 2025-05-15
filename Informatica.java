public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                       Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getter e Setter
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + ", Seguro de Eletrônicos: " + seguroEletronicos;
    }
}