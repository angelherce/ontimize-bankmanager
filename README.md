# Curso Ontimize

> **Author:** _Ángel Herce Soto_  
> **Source:** _[https://www.ontimize.com/xwiki/bin/view/Ontimize+Training/](https://www.ontimize.com/xwiki/bin/view/Ontimize+Training/)_

---

## 1 - Compilar el proyecto

```shell
mvn clean install -U
```

## 2 - Iniciar la Base de Datos

```shell
cd ./bankmanager-server
```

```shell
mvn validate exec:java -P run_database -U
```