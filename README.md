# ExercicioData-hora

## Objetivo
Este projeto tem como objetivo criar um programa que leia o nome e a data de nascimento de uma pessoa, calcule a idade e o horário atual, e verifique se a pessoa é maior de idade.

## Funcionalidades
- Leitura dos dados: Nome e data de nascimento.
- Cálculo da idade usando a classe `Period` da biblioteca `java.time`.
- Cálculo do horário atual usando a classe `LocalDateTime` da biblioteca `java.time`.
- Verificação se a pessoa é maior de idade.

## Tecnologias utilizadas
- Java 8 ou superior.

## Como executar
1. Clone o projeto para o seu ambiente de desenvolvimento.
2. Crie um novo arquivo `pom.xml` se você estiver usando Maven.
3. Adicione as dependências necessárias para o projeto, como a biblioteca `java.time`.
4. Compile o projeto usando o comando `javac Main.java`.
5. Execute o programa usando o comando `java Main`.

## Conceitos de programação presentes
- **Classes e Métodos**: `Main`, `Scanner`, `LocalDate`, `LocalDateTime`, `Period`, `DateTimeFormatter`.
- **Lógica Condicional**: `if-else` para verificar a idade.
- **Entrada/Saída**: `System.in` e `System.out` para leitura e exibição de dados.
- **Data Manipulação**: `LocalDate.parse()` e `LocalDateTime.now()` para manipular datas e horários.