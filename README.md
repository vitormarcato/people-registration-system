# People Registration System

People registration system is a back-end application project that provides the user to do some operations related to database of personal information.

| :placard: Vitrine.Dev |     |
| -------------  | --- |
| :sparkles: Nome        | **People Registration System**
| :label: Tecnologias | java, postgresql
| :rocket: URL         | https://github.com/vitormarcato/people-registration-system
<!-- Inserir imagem com a #vitrinedev ao final do link -->
![](https://images.unsplash.com/photo-1518770660439-4636190af475?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2670&q=80#vitrinedev)
photo by [Alexandre Debiève](https://unsplash.com/photos/FO7JIlwjOtU) 

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
