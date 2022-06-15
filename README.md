REST API банковского приложения на Spring boot и Spring Data JPA Опиание: Разработан api для получения id и balance пользователя.
Выполнение операций изменение данных с исопльзованием Spring Data JPA, сохранение данных в бд PostgreSql.
Так же приложен PostgreSQL_Backup с dump бд. Добавлена таблица аудита operation, по тригеру действия пользователя записываются согласно id который вносит изменения.
Метод getOperationList предоствляет возможность получить список операций выбраного пользователя.

Запросы: GET http://localhost:8080/api/getBalance/1 PUT http://localhost:8080/api/putMoney PUT http://localhost:8080/api/takeMoney GET http://localhost:8080/api/getOperationList/

Структура таблицы customers в бд PostgreSql


![image](https://user-images.githubusercontent.com/84147034/169574290-2a119d7a-7796-43eb-a2fd-6bd565d28ce0.png)



Структура таблицы operation в бд PostgreSql

![image](https://user-images.githubusercontent.com/84147034/172426169-645663cb-4a8d-403f-8f4e-313125197a31.png)
