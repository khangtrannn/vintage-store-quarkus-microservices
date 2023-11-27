#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=org.khang.quarkus.microservices \
        -DprojectArtifactId=rest-book \
        -DclassName="org.khang.quarkus.microservices.book.BookResource" \
        -Dpath="/api/books" \
        -Dextensions="resteasy-jsonb, smallrye-openapi"