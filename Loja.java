public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos){
        
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaxProdutos];
    
    
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaxProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaxProdutos];
        
    }
    //getters
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    //metodo toString reescrito
    @Override
    public String toString(){
        return "Loja: " + nome + 
               ", Funcionários: " + quantidadeFuncionarios + 
               ", Salário Base: " + salarioBaseFuncionario +
               ", Endereço: " + endereco +
               ", Data Fundação: " + dataFundacao +
               ", Quantidade Máxima de Produtos: " + estoqueProdutos.length;
    }
    //metodos especiais
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios <= 30){
            return 'M';
        } else {
            return 'G';
        }
    }
    // Método para imprimir produtos
    public void imprimeProdutos() {
        System.out.println("Produtos da loja " + nome + ":");
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }
     // Método para inserir produto
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    // Método para remover produto
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}
