public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,quantidadeMaxProdutos);
        this.metaVendas = metaVendas;
    }

    // Getter e Setter
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + ", Meta de Vendas Mensais: " + metaVendas;
    }
}