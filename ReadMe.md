# BetterMe Microservice testing framework

Project requirements
--------------------
[Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) could be downloaded here

[Maven](https://maven.apache.org/download.cgi) of the latest version required for frontend assets generation

[AssertJ](https://joel-costigliola.github.io/assertj/index.html) Fluent assertions for java to create more readable assertion in the tests

[RestAssured](http://rest-assured.io/) Testing and validating REST services in Java

[TestNG](https://testng.org/doc/) TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use

[Lombok](https://projectlombok.org/) Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.

Library validation
-------------
Validate is java, maven, allure is setup by command `--version`, example:
```
mvn --version
java -- version
```

Project setup/Running the tests
-------------
Project run test by maven command, like:

```
mvn clean test
```

DEVELOP Project setup
-------------
DEVELOP Project run test by maven command, like:

```
● Install docker
● Install docker compose
● git clone https://github.com/microservices-demo/microservices-demo
● CD microservices-demo
● docker-compose -f deploy/docker-compose/docker-compose.yml up -d
```

