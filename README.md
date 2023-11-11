# databaseIntegration
Desenvolvi um projeto em Java que utiliza a API gráfica Swing como objeto de estudo para a integração de um banco de dados em uma aplicação.
<p>
  Blibioteca utilizada
  <a href="https://downloads.mysql.com/archives/c-j/">JDBC 1.5.47</a>.
</p>
-JDK 8

CREATE DATABASE SENAI;
USE SENAI;

CREATE TABLE CURSOS(ID_CURSO INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
NOME_CURSO VARCHAR(100)NOT NULL,
AREA VARCHAR (50));
