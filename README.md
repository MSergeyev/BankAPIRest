REST API банковского приложения на Spring boot и Spring Data JPA Опиание: Разработан api для получения id и balance пользователя.
Выполнение операций изменение данных с исопльзованием Spring Data JPA, сохранение данных в бд PostgreSql.
Так же приложен PostgreSQL_Backup с dump бд.

Запросы: GET http://localhost:8080/api/getBalance/1 PUT http://localhost:8080/api/putMoney PUT http://localhost:8080/api/takeMoney

Структура таблицы в бд PostgreSql


![image](https://user-images.githubusercontent.com/84147034/169574290-2a119d7a-7796-43eb-a2fd-6bd565d28ce0.png)
