# План автоматизации тестирования комплексного сервиса покупки туров

## Автоматизируемые сценарии

* Успешная оплата по дебетовой карте.
* Успешная выдача кредита по данным банковской карты.
* Неудачная оплата по дебетовой карте:
    * Сценарий - карта отклонена.
    * Сценарий - ввод невалидных данных в полях:
        1. "Номер карты". Проверяем данными: 1111, пустое поле.
        1. "Месяц". Проверяем данными: 0, пустое поле.
        1. "Год". Проверяем данными: 2, пустое поле.
        1. "Владелец". Проверяем данными: 333, пустое поле.
        1. "CVC/CVV". Проверяем данными: abv, пустое поле.
* Неудачная выдача кредита по данным банковской карты:
    * Сценарий - карта отклонена.
    * Сценарий - ввод невалидных данных в полях:
        1. "Номер карты". Проверяем данными: 1111, пустое поле.
        1. "Месяц". Проверяем данными: 0, пустое поле.
        1. "Год". Проверяем данными: 2, пустое поле.
        1. "Владелец". Проверяем данными: 333, пустое поле.
        1. "CVC/CVV". Проверяем данными: abv, пустое поле.

## Используемые инструменты

* IntelliJ IDEA - удобная программа для написания тестов на Java 11.
* Selenide, JUnit - библиотеки для написания кода автотестов. Простые, удобные, с широким спектром возможностей.
* Gradle - система автоматической сборки.

## Перечень и описание возможных рисков при автоматизации

1. Неправильный выбор инструментов тестирования: если выбрать неизвестный для тестировщика инструмент тестирования, он
   потратит много времени на его изучение.
1. Неоднозначность требований, отсутствие полной и подробной документации. В процессе работы могут возникнуть трудности,
   которые также скажутся на затраченном времени и качестве работы.
1. При использовании новых средств, в частности Node.js, может потребоваться дополнительное время на настройку.

## Интервальная оценка с учётом рисков часах

С учётом рисков на автоматизацию потребуется 240 часов (10 рабочих дней).

## План сдачи работ

1. Планирование автоматизации тестирования: 3 дня - 23.10.22 .
1. Автоматизация: 15 рабочих дней - 15.11.22.
1. Отчёт по автоматизации: 2 рабочих дня - 17.11.22.