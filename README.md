Informacion sacada de https://techsparx.com/software-development/openapi/spring-boot-rest-api-docs.html

#Comando para lanzar en la consola CMD de Windows

docker run --rm -v %cd%:/local -v %cd%/config.json:/local/config.json swaggerapi/swagger-codegen-cli generate --lang spring -i /local/service.yaml -c /local/config.json -o /local/src-spring

#Comando para lanzar en Power Shell

docker run --rm -v ${PWD}:/local -v ${PWD}/config.json:/local/config.json swaggerapi/swagger-codegen-cli generate --lang spring -i /local/service.yaml -c /local/config.json -o /local/src-spring