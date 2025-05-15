# Gerenciador de Shopping - Laboratório I

Descrição do Projeto
Este projeto é um sistema de gerenciamento de lojas e produtos, permitindo a criação de lojas, produtos e a verificação de informações relacionadas a eles. O sistema é estruturado em várias classes que representam diferentes entidades, como Loja, Produto, Endereco, e outras.

Estrutura do Projeto
O projeto é composto pelas seguintes classes principais:

Endereco: Representa o endereço de uma loja, incluindo informações como nome da rua, cidade, estado, país, CEP, número e complemento.
Loja: Classe base que representa uma loja, contendo informações como nome, quantidade de funcionários, salário base, endereço, data de fundação e estoque de produtos.
Produto: Representa um produto, incluindo nome, preço e data de validade.
Informatica, Vestuario, Alimentacao, Bijuteria, Cosmetico: Classes que estendem a classe Loja, cada uma representando um tipo específico de loja com atributos adicionais.
Data: Classe que representa uma data, com validação para garantir que as datas sejam válidas.
Principal: Classe que contém o método main, onde a interação com o usuário ocorre, permitindo a criação de lojas e produtos através de um menu.

Funcionalidades
Criar Lojas: O usuário pode criar uma nova loja, fornecendo informações como nome, quantidade de funcionários, salário base, endereço e data de fundação.
Criar Produtos: O usuário pode criar um novo produto, especificando nome, preço e data de validade.
Verificação de Validade: O sistema permite verificar se um produto está vencido em relação a uma data de referência.
Impressão de Informações: O sistema pode imprimir informações detalhadas sobre lojas e produtos.

Como Usar
Compilar o Projeto: Certifique-se de que todas as classes estão no mesmo diretório e compile o projeto usando um compilador Java.
Executar o Programa: Execute a classe Principal para iniciar o sistema.
Interagir com o Menu: Siga as instruções no menu para criar lojas e produtos.

Exemplo de Uso
Após iniciar o programa, o usuário verá um menu com as opções:

MENU PRINCIPAL
(1) Criar uma loja
(2) Criar um produto
(3) Sair
Escolha uma opção:

O usuário pode escolher a opção desejada e seguir as instruções para fornecer as informações necessárias.

Requisitos
Java JDK 8 ou superior
IDE de sua escolha (Eclipse, IntelliJ, etc.) ou terminal para compilar e executar o código.

Contato
Para dúvidas ou sugestões, entre em contato pelo e-mail: laurinha.pbernardo@gmail.com


