# Sistema de Cadastro de Pessoas


 O sistema de cadastro de pessoas é uma aplicação back-end que fornece algumas funcionalidades básicas de cadastro de informações pessoais para o usuário. 

  
### Captura de tela
---
![](https://media.giphy.com/media/pIlauUMGVf7ZWuRKac/giphy.gif)


<div id="sobre">


### Motivação
---

A proposta do projeto é praticar, estudar e desenvolver o conhecimento sobre programação.

O desafio é codificar, em linguagem Java, uma aplicação  CRUD de back-end capaz de manipular um banco de dados relacional.

CRUD  é um acrônimo que refere-se a operações básicas: Criar, ler, atualizar e deletar dados. 

O projeto está organizado para que seja usado uma classe DAO (Data Acess Object), com padrão arquitetural MVC (Model View Controller), utilizando a linguagem de programção Java e PostgreSQL para banco de dados relacional. 

</div>
  

### Funcionalidades
---

1 - criar novo registro

2 - pesquisar registro

3 - atualizar informações

4 - deletar registro

5 - mostrar lista de registros 

### Dependências
---

  - Java 17 ou posterior 
  - PostgreSQL 12
  
### Script SQL
---


```
CREATE DATABASE peopleregister
WITH
ENCODING = 'UTF-8'
CONNECTION LIMIT = -1;

CREATE TABLE person(
id SERIAL NOT NULL,
name VARCHAR (255),
emailaddress VARCHAR (255),
socialsecnumber char(9)
);

```
<div id="run">

### Como executar
---

  1. Clone o repositório ou faça o download do arquivo .zip
  
  ```sh
git clone https://github.com/vitormarcato/people-registration-system.git
```
  		  
  2. Por meio de seu terminal, dentro da pasta **src**, execute o comando abaixo    

  ```sh
javac App.java
```

  3. Na sequência, execute o comando abaixo
  
  ```sh
java App
```
</div>

[us]
# People Registration System

<div id="sobre">

People registration system is a back-end application project that provides the user to do some operations related to database of personal information.

</div>
  
  
### Demo
---
![](https://media.giphy.com/media/pIlauUMGVf7ZWuRKac/giphy.gif#vitrinedev)


### Why
---

The project purpose is to practice, study and improve knowledge about programming.

The challenge was encoding a CRUD back-end application which is responsible for manipulating data in a relational database.

CRUD is an acronym that refers to the four basic functions that are necessary to implement a persistent storage application: create, read, update and delete.

The project is organized to use a DAO (Data Access Object) class to access the database, with the MVC (Model-View-Controller) architectural pattern, using Java and PostgreSQL as a relational database.

### Features
---

1 - create new register

2 - search person

3 - update information

4 - delete register

5 - show registration list

### Prerequisites
---

  - JDK17 or later 
  - PostgreSQL 12
  
### Script SQL
---


```
CREATE DATABASE peopleregister
WITH
ENCODING = 'UTF-8'
CONNECTION LIMIT = -1;

CREATE TABLE person(
id SERIAL NOT NULL,
name VARCHAR (255),
emailaddress VARCHAR (255),
socialsecnumber char(9)
);

```
<div id="run">

### Building and Running
---

  1. Clone source code or download .zip file
  
  ```sh
git clone https://github.com/vitormarcato/people-registration-system.git
```
  		  
  2. Compile: 

  ```sh
javac App.java
```

  3.  Run App class
  
  ```sh
java App
```
</div>

### VitrineDev - Alura
---

| :placard: Vitrine.Dev |     |
| -------------  | --- |
| :sparkles: Nome        | **People Registration System**
| :label: Tecnologias | java, postgresql
| :rocket: URL         |  Veja como executar no link: [**Executar**](#run)
| :fire: Desafio     | Veja seção no link: [**Sobre**](#sobre)

