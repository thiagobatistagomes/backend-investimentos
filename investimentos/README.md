# Back-End - Controle de Investimentos (Spring Boot)

## Tecnologias usadas
- Java 21
- Spring Boot 3.5.0
- Spring Web
- Spring Data JPA
- Spring Security com JWT
- Banco de dados: H2


## Como Rodar o Back-End

1. Pré-requisitos:
- Java 21
- Maven

2. Rodando a aplicação:

```
execute o arquivo InvestimentosApplication.java
```

3. Endereço base da API:
```
http://localhost:8081
```

## Endpoints principais

| Método | Rota | Descrição |
|---|---|---|
| POST | `/auth/register` | Cadastro de usuário |
| POST | `/auth/login` | Login (gera e devolve o JWT) |
| GET | `/investimentos` | Lista todos os investimentos |
| POST | `/investimentos` | Cria um novo investimento |
| PUT | `/investimentos/{id}` | Atualiza um investimento |
| DELETE | `/investimentos/{id}` | Deleta um investimento |

## Validações Implementadas

- Valor investido deve ser maior que 0.
- Data do investimento não pode estar no futuro.
- JWT obrigatório em todas as rotas de investimento.



## Observações Finais

Projeto segue separação por camadas (Controller, Service, Repository) com autenticação por JWT.  
O banco H2 é usado apenas para testes locais.
