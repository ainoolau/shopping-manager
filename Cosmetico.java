public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getter e Setter
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + ", Taxa de Comercialização: " + taxaComercializacao;
    }
}