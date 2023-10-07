# Приложение для выбора города с наиболее тёплой погодой

Наступила осень и в нашем городе похолодало. Вы находитесь в аэропорту Иркутска и решаете, куда можно полететь. Используйте сервис OpenWeatherMap, чтобы выбрать город с наиболее тёплой погодой. Вам необходимо поиском по OpenWeatherMap собрать ID как минимум 10 городов. Например, для Шелехова это 2016764.

Ваша программа должна вывести города и температуру в них в порядке убывания температуры. В качестве ответа приложите исходный год класса(-ов) и текстовый файл с примером работы программы.

Текст программы с занятия (без потоков) https://pastebin.com/K7XAusxr

Пример работы с потоком и API https://gist.github.com/ipetrushin/140f89499ce15d0bc65ae65229c31eae

1) Собрать номера городов (не менее 10)

2) Зарегистрироваться на сайте и получить APPID

3) Используя заготовку написать программу, собирающую сведения о температуре в перечисленных городах

4) Вывести названия городов и температуры в них от более тёплых более холодным

5) Получить названия городов можно из JSON-данных, для этого придётся дополнить класс Weather

Примечание: убедитесь, что вы используете правильный URL для запросов к API: api.openweathermap.org/data/2.5/weather?q={city name}

GSON https://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.9/gson-2.8.9.jar

Дополнительные уточнения от проверяющего:
1. Температура должна быть в градусах Цельсия

2. Температура должна быть целой.

3. Список городов для сортировки должен быть внутри программы и города должны задаваться строками их названий а не id-номерами.

4. Для проверки помимо кода и необходимых классов прислать скрины консоли для двух попыток: первая без Иркутска, вторая с Иркутском. Показать, что происходит пересортировка при добавлении города.
