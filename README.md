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