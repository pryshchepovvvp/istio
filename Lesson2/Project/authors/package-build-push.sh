#!/bin/bash
mvn -f pom.xml clean package
docker build -t pryshchepovvvp/authors-service:1.0 .
docker login --username pryshchepovvvp
docker push pryshchepovvvp/authors-service:1.0