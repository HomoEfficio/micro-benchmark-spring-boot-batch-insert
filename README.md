# Hibernate with `GenerationType.IDENTITY` vs JdbcTemplate with batch insert.

Simple micro benchmark test project for batch insert in Spring Boot + MySQL.

Actually it is not possible to use **efficient** batch inserts in Hibernate.  

Why?

You can not use batch inserts when you choose `GenerationType.IDENTITY`, but `GenerationType.IDENTITY` is still much faster than `GenerationType.AUTO` which supports batch inserts. See https://stackoverflow.com/a/27732138 for details.

So there is no efficient way to use batch inserts in Hibernate.

But if you use JdbcTemplate instead of Hibernate, you can make the best of batch inserts which is far more faster than `GenerationType.IDENTITY`.

And of course, you can use JdbcTemplate and Hibernate together.

Play with this application and have fun. 

# Prerequisites

- Java 11
- Gradle 5.X
- MySQL 5.X

# How to run

- To run Hibernate version:  

    ```
    SPRING_PROFILES_ACTIVE=hibernate ./gradlew clean bootRun
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

