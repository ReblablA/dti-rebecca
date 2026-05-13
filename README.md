# projeto Petshop

Este projeto consiste em uma aplicação web que ajuda o Senhor Eduardo, proprietário de um canil em Belo Horizonte, a encontrar o melhor petshop para banhar seus cães, levando em consideração os preços e a proximidade dos estabelecimentos.

## Funcionalidades
- Determina o melhor petshop com base na data, quantidade de cães pequenos e grandes.
- Calcula o preço total dos banhos nos petshops disponíveis.
- Exibe o nome do melhor petshop e o preço total dos banhos.

## Instruções para Executar o Sistema
Para executar este projeto, siga as instruções abaixo:

### Código Frontend
Clone o repositório para o seu computador.

Navegue até o diretório do projeto:
cd nome-do-repositorio

Instale as dependências do projeto:
npm install

Inicie o servidor de desenvolvimento para visualizar a aplicação localmente:
npm start



### Código BackEnd

Clone o repositório para o seu computador (caso ainda não tenha feito).

Navegue até o diretório do projeto:
cd nome-do-repositorio

Compile e execute o arquivo Java que contém a lógica do backend.

## Premissas Assumidas

Ao desenvolver este projeto, foram feitas as seguintes premissas:

Os preços e distâncias para os petshops são fixos e não variam com o tempo.
O critério principal para determinar o melhor petshop é o preço total dos banhos.
Em caso de empate no preço total, o petshop mais próximo do canil é considerado o melhor.
Os dados inseridos pelo usuário (data, quantidade de cães) estão corretos e seguem o formato especificado.

## Decisões de Projeto

Para este projeto, foram tomadas as seguintes decisões de projeto:

Implementação da lógica de negócio em Java para o frontend/backend devido à sua robustez e eficiência.
Criação de uma interface intuitiva e amigável para o usuário inserir os dados e visualizar o resultado.
Organização do código em pastas separadas para facilitar a manutenção e o desenvolvimento futuro.


## Testes Unitários

Finalmente, quando terminei o código para compilação, comecei a escrever os testes unitários. Decidi não realizar testes extensivos porque calcular os valores esperados manualmente consumiria muito tempo. Para executar o arquivo de teste CalculadoraPrecoBanhoTest.java, foi necessário configurar o ambiente para testes unitários em Java. Instalei a biblioteca JUnit para realizar os testes e adicionei o comando "test" ao arquivo de configuração do Maven (pom.xml).



Aproveite o uso do sistema e garanta que os cãezinhos do Senhor Eduardo estejam sempre felizes e cheirosos!
