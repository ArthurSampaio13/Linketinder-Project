# Linketinder-Project

## Funcionalidades

- **Listar Candidatos:** Visualize todos os candidatos cadastrados, incluindo informações como nome, e-mail, CPF, idade, estado e suas competências.
- **Listar Empresas:** Exiba todas as empresas cadastradas, com detalhes como nome, e-mail corporativo, CNPJ, país, estado e as competências esperadas.
- **Cadastrar Novo Candidato:** Permita o registro de novos candidatos com informações pessoais e competências.
- **Cadastrar Nova Empresa:** Registre novas empresas, especificando informações corporativas e as competências desejadas.

## Estrutura do Projeto

O projeto segue o padrão MVC (Model-View-Controller):

- **Model:** Contém as classes que representam os dados do sistema, como `Candidato`, `Empresa` e `Dados`.
- **View:** Responsável por exibir as informações ao usuário, como a classe `Menu`.
- **Controller:** Gerencia a lógica de negócios e a interação entre a View e o Model, como a classe `MenuController`.

## Como Executar o Projeto

1. Certifique-se de ter o Java instalado no seu sistema.
2. Clone o repositório:
   ```bash
   git clone https://github.com/ArthurSampaio13/Linketinder-Project.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd linketinder-project
   ```
4. Execute o arquivo principal para iniciar a aplicação:
   ```bash
   groovy src/main/groovy/br/com/linketinder/Main.groovy
   ```
5. Siga as instruções do menu para explorar as funcionalidades da aplicação.


## Exemplos de Uso

### Listar Candidatos
Após iniciar a aplicação, selecione a opção `1` para listar todos os candidatos cadastrados. Você verá uma lista detalhada contendo informações pessoais e competências de cada candidato.

### Cadastrar Nova Empresa
Selecione a opção `4` no menu principal e siga as instruções para registrar uma nova empresa, informando detalhes como nome, CNPJ, e competências desejadas.


