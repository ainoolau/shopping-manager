public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Getters
    public String getNome() {
        return nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Método para inserir loja
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // Método para remover loja
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // Método para contar lojas por tipo
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipoLoja.toLowerCase()) {
                    case "cosmético":
                        if (loja instanceof Cosmetico) count++;
                        break;
                    case "vestuário":
                        if (loja instanceof Vestuario) count++;
                        break;
                    case "bijuteria":
                        if (loja instanceof Bijuteria) count++;
                        break;
                    case "alimentação":
                        if (loja instanceof Alimentacao) count++;
                        break;
                    case "informática":
                        if (loja instanceof Informatica) count++;
                        break;
                    default:
                        return -1;
                }
            }
        }
        return count;
    }

    // Método para encontrar a loja de informática com seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica info = (Informatica) loja;
                if (info.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = info.getSeguroEletronicos();
                    lojaMaisCara = info;
                }
            }
        }
        return lojaMaisCara;
    }

    // Método toString
    @Override
    public String toString() {
        return "Shopping: " + nome + 
               ", Endereço: " + endereco + 
               ", Quantidade Máxima de Lojas: " + lojas.length;
    }
}