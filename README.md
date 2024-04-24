# Conversor_de_Moedas_Alura_Challanges_ONE

Conversor de moedas para o desafio da Alura challanges com a ONE (Oracle Next Education)

![image](https://github.com/LealDias/Conversor_de_Moedas_Alura_Challanges_ONE/assets/70763447/96c669ef-3a45-4b34-85c3-74b23f920caf)


# Tecnologias

<p align="center">
  <a href="#">
    <img src="https://img.shields.io/badge/Java-E34F26?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  </a>
</p>

# O Projeto

O projeto consiste em um conversor de multiplas moedas, com menu interativo onde o usuário pode escolher até 6 opções de conversões. Há ainda a opção de histórico de pesquisa das operações de conversão.

# API's

A API utilizada é a ExchangeRate-API, que fornece múltipla opções de conversão. A conexão deve ser feita via link próprio com chave pessoal gerada direto no site. Abaixo segue um exemplo de link:

https://v6.exchangerate-api.com/v6/b79cbd822d955ac95be0b81f/latest/USD

# As classes

Para este projeto foram criadas 6 classes:

### ExchangeRateService:

Nesta classe é feita a conexão com o serviço de API da Exhanger-API, retornando os dados no formato Json.

### CurrencyConverter:

Nesta classe é feita a conversão dos valores solicitados pelo usuários, que foram colerados durante a requisição na API.

### ConversionRecord:

Nesta classe é feito o registro único da transação durante o processo de consulta do usuário. Este registro é então passado para a classe history que armazena as informações em uma lista.

### History:

Armazena as informações de consulta em uma lista, gerando assim um histórico de todas as consultas feitas pelo usuário.

### Main:

Nesta classe é executado o programa principal com o menu e suas opções disponíveis.

# Resultados e Testes

### Menu Inicial

![image](https://github.com/LealDias/Conversor_de_Moedas_Alura_Challanges_ONE/assets/70763447/a697c820-a0a1-4624-837a-ecc32b0445c7)

