# SistemaGer-Livros
Pequeno sistema de gerenciamento de Livro usando Spring e Vue.js

## Back-end - API
1. Acesse a pasta biblioteca e execute o comando: mvn spring-boot:run ;
2. É executado na porta 8056 - http://localhost:8056/swagger-ui;
3. Banco de dados H2 sem relacionamento entre tabelas;

## Front-end - Vue.js
1. Acesse a pasta ' front-biblioteca ';
2. Execute ' npm install ';
3. Em seguida ' npm install -g @vue/cli ';
4. Levante o cliente com: ' npm run serve -- --port 3000 ';

### Complicações
1. O front só possui duas telas: Login e Cadastro de usuário;
2. Api não possui autenticação como basicAuth, providos pelo spring security por falta de conhecimentos e prática. Logo a api está insegura ;
3. Não possui tipos de usuários(Enumerações, Roles do security);