# ETAPA 1: Compilación (Maven)
# Usamos una imagen que ya tiene Maven y Java 17 instalado
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiamos el archivo pom.xml y las dependencias primero para aprovechar el cache de Docker
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiamos el código fuente de tu proyecto
COPY src ./src

# Compilamos el proyecto y generamos el .war (saltamos los tests para mayor rapidez)
RUN mvn clean package -DskipTests


# ETAPA 2: Ejecución (Tomcat)
# Esta es la imagen final que se ejecutará en Cloud Run
FROM tomcat:10.1-jre17-temurin-jammy

# Limpiamos las aplicaciones por defecto de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# COPIAMOS el .war generado en la ETAPA 1 (build) a la carpeta de Tomcat
# Nota: Asegúrate de que el nombre del .war coincida con el que genera tu pom.xml
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]

