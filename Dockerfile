# Build stage
FROM eclipse-temurin:21 AS builder

WORKDIR /app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw package

# Run stage
FROM eclipse-temurin:21 AS runner

WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]