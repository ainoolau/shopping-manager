import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        
        int opcao;
        do{
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.println("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao){
                case 1:
                    loja = criarLoja(scanner);
                    break;
                case 2: 
                    produto = criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
        if (loja != null && produto != null){
            Data dataReferencia = new Data(01,06,2025);
            
            System.out.println("\nRESULTADOS:");
            if(produto.estaVencido(dataReferencia)){
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
            
            System.out.println("\nInformações da Loja:");
            System.out.println(loja);
        }
        scanner.close();
    }
    
    private static Loja criarLoja(Scanner scanner){
        System.out.println("\nCRIAR LOJA");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Quantidade de funcionários: ");
        int qtdFunc = scanner.nextInt();
        
        System.out.print("Salário base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.print("Quantidade máxima de produtos: ");
        int quantidadeMaxProdutos = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\nENDEREÇO DA LOJA");
        Endereco endereco = criarEndereco(scanner);
        
        System.out.println("\nDATA DE FUNDAÇÃO");
        Data dataFundacao = criarData(scanner);
        
        return new Loja(nome, qtdFunc, salarioBase, endereco, dataFundacao, quantidadeMaxProdutos);
    }
    
    private static Produto criarProduto(Scanner scanner) {
        System.out.println("\nCRIAR PRODUTO");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("\nDATA DE VALIDADE");
        Data dataValidade = criarData(scanner);
        
        return new Produto(nome, preco, dataValidade);
    }
    
    private static Endereco criarEndereco(Scanner scanner) {
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        
        System.out.print("País: ");
        String pais = scanner.nextLine();
        
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        
        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();
        
        return new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
    }
    
    private static Data criarData(Scanner scanner) {
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); 
        
        return new Data(dia, mes, ano);
    }
}
