public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.produtosImportados = produtosImportados;
    }

    // Getter e Setter
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + ", Produtos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}