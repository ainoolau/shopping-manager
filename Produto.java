public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    //getters
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    //metodo que verifica se esta vencido comparando com uma data de referencia
    public boolean estaVencido(Data dataReferencia){
        //compara ano, mes e dia
        if (dataValidade.getAno() < dataReferencia.getAno()){
            return true;
        } else if (dataValidade.getAno() == dataReferencia.getAno()){
            if(dataValidade.getMes() < dataReferencia.getMes()){
                return true;
            } else if (dataValidade.getMes() == dataReferencia.getMes()){
                return dataValidade.getDia() < dataReferencia.getDia();
            }
        }
        return false;
    }
    //toString
    @Override
    public String toString(){
        return String.format("Produto: %s | Preço: R$ %.2f | Validade: %s", nome, preco, dataValidade);
    }
}