# Дипломный проект профессии «Тестировщик»

## Процедура запуска автотестов

### MySQL

1. Получить [код репозитория](https://github.com/Flynt666/Diplom.git).
2. В application.properties использовать:

`spring.datasource.url=jdbc:mysql://192.168.99.100:3306/app`

3. Запустить docker machine через команду в терминале:

`docker-machine start default`

4. Поднять контейнеры MySQL, Node.js через команду в терминале:

`docker-compose -f docker-compose-mysql.yml up`

5. Запустить jar файл через команду в терминале:

`java "-Dspring.datasource.url=jdbc:mysql://192.168.99.100:3306/app" -jar artifacts/aqa-shop.jar`

6. Запустить автотесты через команду в терминале:

`.\gradlew clean test "-Ddb.url=jdbc:mysql://192.168.99.100:3306/app"`

### PostgreSQL

1. Получить [код репозитория](https://github.com/Flynt666/Diplom.git).
2. В application.properties использовать:

`spring.datasource.url=jdbc:postgresql://192.168.99.100:5432/app`

3. Запустить docker machine через команду в терминале:

`docker-machine start default`

4. Поднять контейнеры MySQL, Node.js через команду в терминале:

`docker-compose -f docker-compose-postgresql.yml up`

5. Запустить jar файл через команду в терминале:

`java "-Dspring.datasource.url=jdbc:postgresql://192.168.99.100:5432/app" -jar artifacts/aqa-shop.jar`

6. Запустить автотесты через команду в терминале:

`.\gradlew clean test "-Ddb.url=jdbc:postgresql://192.169.99.100:5432/app`

## Отчётные документы

1. [Отчёт по итогам тестирования.](https://github.com/Flynt666/Diplom.git)
1. [Отчёт по итогам автоматизации.](https://github.com/Flynt666/Diplom.git)

