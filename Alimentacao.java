public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                       Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaxProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Getter e Setter
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Sobrescrita do toString
    @Override
    public String toString() {
        return super.toString() + ", Data do Alvará: " + dataAlvara;
    }
}