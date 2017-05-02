# Security OAuth 2

A solução visa propor um meio comum de autentitação via [LDAP](https://en.wikipedia.org/wiki/Lightweight_Directory_Access_Protocol) e autorização de usuários em sistemas utilizando o protocolo [OAuth 2.0](https://oauth.net/2/). 

O projeto está modularizado no seguinte: 

* O primeiro módulo `security-oauth2-common` contem uma api common utilizada entre os projetos que venham a utilizar a solução; 
* O segundo módulo `security-oauth2-resource` provê uma api restful para gerenciamento dos usuários logados; 
* O terceiro e último módulo `security-oauth2-server` é o servidor OAuth 2 propriamente dito.

Para mais informações sobre OAuth 2 visite o site do [Spring Security OAuth2](https://projects.spring.io/spring-security-oauth/docs/oauth2.html) uma vez que a solução "is built on top" Spring Security OAuth 2 framework.

## Getting Started

Clone de [GIT Hub](https://github.com/danielbarcellos/security-oauth2) e então use Gradle 3.4.* e Java 8:

```
git clone ...
```
## Módulos

* [Security OAuth 2 - OAuth 2 Server](https://github.com/danielbarcellos/security-oauth2/tree/master/security-oauth2-resource) - OAuth 2 Server.
* [Security OAuth 2 - Resource Server](https://github.com/danielbarcellos/security-oauth2/tree/master/security-oauth2-resource) - Resource server.
* [Security OAuth 2 - Common API](https://github.com/danielbarcellos/security-oauth2/tree/master/security-oauth2-common) - Objetos de uso comum.

## Veja mais

* [Spring Security OAuth User Guide](http://projects.spring.io/spring-security-oauth/docs/Home.html)
* [Spring Security OAuth Source](http://github.com/spring-projects/spring-security-oauth)
* [Using JWT with Spring Security OAuth](http://www.baeldung.com/spring-security-oauth-jwt)
* [OAuth2 for a Spring REST API – Handle the Refresh Token in AngularJS](http://www.baeldung.com/spring-security-oauth2-refresh-token-angular-js)
* [Stackoverflow](http://stackoverflow.com/questions/tagged/spring-security+spring+oauth)

## Built With

* [Spring Boot](https://projects.spring.io/spring-boot/) - Plataforma de aplicações.
* [Spring Security](https://projects.spring.io/spring-security/) - Framework de segurança do Spring.
* [Spring Security OAuth 2](http://projects.spring.io/spring-security-oauth/) - Usado para implementação da estrutura OAuth 2.0 com Spring Security.
* [Gradle](https://gradle.org/) - Builder e gerenciamento de dependências.

## Versionamento

We use [GIT Hub](https://github.com) for versioning. For the versions available, see the [tags on this repository](https://github.com/danielbarcellos/security-oauth2). 

## Authors

* **Daniel Barcellos** - *Initial work* - [Daniel Barcellos](https://github.com/danielbarcellos)

## Agradecimentos

* My family
* Google
