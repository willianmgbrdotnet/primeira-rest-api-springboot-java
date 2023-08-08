# Primeira Api Rest Initializr

## Configuração do Spring Initializr
Rest api springboot java
<li>maven
<li>java
<li>spring 2.7.14
<li>Packaging jar
<li>java 17
<li>-Dependencies
<li>Spring Web
<li>Spring Data JPA
<li>MySQL Driver

<li>Comentar a dependencia JPA na pom.xml
reload Maven

<li>No arquivo application.properties -> digitar server.port = 8090</li>
<li>digitar na Controller: @GetMapping(path = "/api/status")</li>
public String check(){
        return "online";
    }
<li>Depois de rodar a api, retirar o Comentario da dependencia JPA na pom.xml</li>
E novamente reload Maven.
<li>Criar a Model e fazer a referencia @Entity</li>
Fazer @notações dos campos nos atributos da Model.
<li>Criar a Controller da model</li>
Definir Rotas e metodos
<li>Setar a ConnectionString No arquivo application.properties</li>
<li>Criar um novo package com a interface Repository que já vem com os metódos crud pré-programados.</li>
E estender da CRUDRepositoy informando a Model e o tipo do Id da model.
<li>Definir os @mapping( e rotas) adequados.</li>
Testar com o Postman