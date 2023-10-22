# Lista de Tarefas API

API simples para gerenciar uma lista de tarefas usando Spring Boot e H2 Database.

## Visão Geral

Este projeto é uma API REST que permite criar, listar, atualizar e excluir tarefas em uma lista de tarefas. Ele utiliza o Spring Boot como framework e o H2 Database para armazenamento de dados em memória.

## Requisitos

- Java 17 ou superior
- Maven
- Postman (ou outra ferramenta similar) para testar a API

## Como Executar a Aplicação Localmente

1. Clone este repositório para o seu ambiente de desenvolvimento.

2. Abra o terminal na raiz do projeto e execute o seguinte comando para iniciar a aplicação:

   ```shell
   mvn spring-boot:run

A aplicação será executada em http://localhost:8080. Você pode acessar a API e testar os endpoints usando o Postman.

### Endpoints da API

- GET /api/tasks: Lista todas as tarefas.
- POST /api/tasks: Cria uma nova tarefa.
- PUT /api/tasks/{taskId}: Atualiza uma tarefa existente.
- DELETE /api/tasks/{taskId}: Exclui uma tarefa.

Exemplo de Solicitação (POST)
URL: http://localhost:8080/api/tasks

Corpo da solicitação:
{
    "description": "Minha nova tarefa",
    "completed": false
}

