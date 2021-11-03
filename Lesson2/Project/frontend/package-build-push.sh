#!/bin/bash
mvn -f pom.xml clean package
docker build -t pryshchepovvvp/frontend-service:1.0 .
docker login --username pryshchepovvvp
docker push pryshchepovvvp/frontend-service:1.0