# Security OAuth 2 - Resource Server

Este módulo provê uma API Restful para gerenciamento dos usuários autorizados pelo [Security OAuth 2 - OAuth 2 Server](https://gitlab.rbs.com.br/rbsdev/security-oauth2/tree/master/security-oauth2-server).

## Getting Started

Essas instruções fará com que você consiga uma cópia do projeto pronta para iniciar na sua máquina local para fins de desenvolvimento e teste.

### Pré-requisitos

Clone de RBS GIT Lab e então use Gradle 3.4.* e Java 8:

```
git clone ...
```

### Instalação

Passo a passo para ter um ambiente pronto para desenvolvimento.

```
cd security-oauth2/security-oauth2-resource/
gradle :security-oauth2-resource:build -x test
```

## Iniciando a aplicação

O servidor irá levantar uma aplicação tomcat embeded na porta http://localhost:9001.

```
gradle :security-oauth2-resource:bootRun
```

## O que fazer quando estiver iniciado?

Você pode testar se está tudo ok tentando acesso aos dados do usuário logado. Como ainda não possue um token de autorização a mensagem de retorno é auto-explicativa

> Os testes abaixos todos foram feitos utilizando [HTTPie](https://httpie.org/).

Fazendo requisição não autorizada ao resource:

```shell
http http://localhost:9001/oauth/user
```

Resposta do servidor será:

```json
{
    "error": "unauthorized", 
    "error_description": "Full authentication is required to access this resource"
}
```

Como a url está protegida, vamos solicitar um token válido:

```
http -a <CLIENT ID>:<SECRET> -f POST http://localhost:9000/oauth/token grant_type=password username=<USERNAME LDAP VALIDO> password=<SENHA>
```
A resposta do servidor com o token de acesso:

```json
{
    "access_token": "<ACCESS TOKEN>", 
    "expires_in": 35999, 
    "jti": "043fe44b-1e85-40fa-b161-0ac933a231ec", 
    "refresh_token": "<REFRESH TOKEN>", 
    "scope": "exibicao criacao atualizacao exclusao", 
    "token_type": "bearer"
}

```
Note que o response é um objeto json contendo o seu access_token com o qual será possível fazer requisições previamente autorizadas a api.

Agora devidamente autorizado é possível fazer requisições a api protegida passando o header adequado:

```
http http://localhost:9001/oauth/user 'Authorization:Bearer <ACCESS TOKEN>'
```

```json
{
    "roles": [
        {
            "description": "Usuario padrao", 
            "name": "ROLE_USER", 
            "resources": [
                {
                    "endpoint": "carrinhos", 
                    "grants": [
                        "read", 
                        "update", 
                        "create", 
                        "delete"
                    ], 
                    "prefix": "loja", 
                    "resourceUri": "/loja/carrinhos"
                }, 
                {
                    "endpoint": "backoffice", 
                    "grants": [
                        "read", 
                        "update", 
                        "create", 
                        "delete"
                    ], 
                    "prefix": "loja", 
                    "resourceUri": "/loja/backoffice"
                }
            ]
        }
    ], 
    "user": {
        "username": "<USERNAME LDAP VALIDO>"
    }
}
```

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

We use [RBS GIT Lab](https://gitlab.rbs.com.br) for versioning. For the versions available, see the [tags on this repository](https://gitlab.rbs.com.br/rbsdev/security-oauth2). 

## Authors

* **Daniel Barcellos** - *Initial work* - [TC-Daniel_Barcellos](https://gitlab.rbs.com.br/TC-Daniel_Barcellos)

## Agradecimentos

* My family
* Google

