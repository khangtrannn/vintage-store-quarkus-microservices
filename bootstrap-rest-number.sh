#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=org.khang.quarkus.microservices \
        -DprojectArtifactId=rest-number \
        -DclassName="org.khang.quarkus.microservices.number.NumberResource" \
        -Dpath="/api/numbers" \
        -Dextensions="resteasy-jsonb, smallrye-openapi"