# PROYECTO PARCIAL

[@cristiandley](https://twitter.com/cristiandley) 2017


### Estructura Proyecto


- Dominio

    Entidades

- Presentacion

    Vistas o Forms de SWING

- Recursos

    Cualquier tipo de archivo de configuracion

- Repositorio

    Modelo y administracion de la base

- Servicio

    Controladores


### Motor MySQL dockerizado (ParcialFacultad)

Usuario: root

Pass: root

Port: 3306

[hub mysql](https://hub.docker.com/_/mysql/)

```bash

docker pull mysql:lastest

docker run --name ParcialFacultad -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql

```

### Driver jdbc:MySQL

version: 5.1.40
