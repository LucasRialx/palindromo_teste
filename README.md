# Palíndromo TDD

Este projeto implementa uma solução para validação de palíndromos utilizando a metodologia de Desenvolvimento Orientado a Testes (TDD).

## Tecnologias Utilizadas

- **Java 22**: Linguagem de programação utilizada no projeto.
- **JUnit 5**: Framework de testes para validação das funcionalidades.
- **Maven**: Gerenciador de dependências e automação de build.

## Funcionalidades

- **Validação de Palíndromos**: Verifica se uma palavra ou frase é um palíndromo, ignorando espaços e diferenças entre maiúsculas e minúsculas.

## Testes

Os testes estão localizados no arquivo [`PalindromoTest.java`](src/test/java/PalindromoTest.java). Eles cobrem os seguintes cenários:

1. **Palíndromo simples**: Verifica palavras como "arara".
2. **Não-palíndromo**: Verifica palavras que não são palíndromos.
3. **Frase palíndroma**: Verifica frases como "A base do teto desaba".

Os resultados dos testes podem ser encontrados no diretório `target/surefire-reports/`.

### Passos

Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/LucasRialx/palindromo_teste
   ```
Navegue até o diretório do projeto:

```bash
cd palindromo_teste
```

Compile e execute o projeto com o Maven:

```bash
mvn clean install
mvn exec:java
```

Acesse a aplicação em seu navegador, se aplicável, ou siga os passos descritos na documentação para interagir com a aplicação.

Testes
O projeto inclui testes automatizados utilizando JUnit. Para rodar os testes, use o seguinte comando Maven:

```bash
mvn test
```

![image](https://github.com/user-attachments/assets/e420518d-b20a-437a-9e35-9eef84b34bf3)

## Contribuindo
Se você deseja contribuir com melhorias ou correções, fique à vontade para abrir uma pull request. Siga as boas práticas de commit e forneça uma descrição clara do que foi alterado.

## Licença
Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para mais detalhes.
