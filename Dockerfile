FROM gradle:9.2.1-jdk

WORKDIR /app

COPY . .

RUN ./gradlew test