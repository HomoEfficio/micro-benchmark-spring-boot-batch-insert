# Batch Insert Micro Benchmark

Simple micro benchmark test project for batch insert in Spring Boot + MySQL.

Spring Data JDBC vs Spring Data JPA SEQUENCE vs Spring Data JPA IDENTITY.

Play with this application and have fun.

# Acknowledgement

I got solution for Spring Data JPA SEQUENCE from [smartyansh's blog post](https://dev.to/smartyansh/best-possible-hibernate-configuration-for-batch-inserts-2a7a). 

# Prerequisites

- Java 11
- Gradle 5.X
- MySQL 5.X

# How to run

- To run IDENTITY version:  

    ```
    SPRING_PROFILES_ACTIVE=identity ./gradlew clean bootRun
    ```
  
- To run SEQUENCE version:  

    ```
    SPRING_PROFILES_ACTIVE=sequence ./gradlew clean bootRun
    ```

- To run JdbcTemplate version:  

    ```
    SPRING_PROFILES_ACTIVE=jdbc ./gradlew clean bootRun
    ```

And you'll see the console log saying `OOO Elapsed: X.XX secs` in the end like below:

```
...
2020-01-25 01:58:24.075  INFO 28905 --- [  restartedMain] i.h.s.m.b.h.HibernateRunner              : OOO Elapsed: 3.31
2020-01-25 01:58:24.080  INFO 28905 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-01-25 01:58:24.084  INFO 28905 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-01-25 01:58:24.094  INFO 28905 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

```

