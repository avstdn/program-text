# ПОЛУЧЕНИЕ ТЕКСТА ПРОГРАММЫ ИЗ ИСХОДНОГО КОДА ПРИЛОЖЕНИЯ

Ссылка на статью в КБ на внутреннем ресурсе: https://kb-liga.phoenixit.ru/pages/viewpage.action?pageId=182856238

Примечание! Потребуется установленная Java 8.

1. Скачать джарник из вложения: program-text.jar. Либо собрать проект и достать оттуда.

2. Для получения исходных кодов java (backend) в терминале/консоли перейти в папку со скачанным джарником и выполнить команду(все 3 параметра обязательные):

> java -jar program-text.jar C:\git\soop\soop-server\src\main\java .java 0

Описание параметров запуска:
- "C:\git\soop\soop-server\src\main\java" - Абсолютный путь до директории, откуда будет начинаться обход файлов.
- ".java" - Расширения файлов, которые будут записаны в файл. Если их несколько, то писать через запятую слитно без пробелов.
- "0" - Абсолютный путь до папки/папок, которые НЕ НУЖНО записывать в файл. Если их несколько, то писать через запятую слитно без пробелов. Параметр обязательный, поэтому нужно туда что-то передавать, например 0, если хотим его пропустить.

3. Для получения исходных кодов js (frontend) в терминале/консоли перейти в папку со скачанным джарником и выполнить команду(все 3 параметра обязательные):

> java -jar program-text.jar C:\git\soop\soop-client\soop-ws .js,.scss C:\git\soop\soop-client\soop-ws\build

Описание параметров запуска:
- "C:\git\soop\soop-client\soop-ws" - Абсолютный путь до директории, откуда будет начинаться обход файлов.
- ".js,.scss" - Расширения файлов, которые будут записаны в файл. Если их несколько, то писать через запятую слитно без пробелов.
- "C:\git\soop\soop-client\soop-ws\build" - Абсолютный путь до папки/папок, которые НЕ НУЖНО записывать в файл. Если их несколько, то писать через запятую слитно без пробелов. Параметр обязательный, поэтому нужно туда что-то передавать, например 0, если хотим его пропустить.

4. По окончанию выполнения программы, в папке, где был располжен джарник появиться текстовый файл: output-xxxxxxxxxxxxxx.txt.

5. Аналогичным образом выполнить команду для каждого из модулей, текст программы которого необходимо получить, например: soop-server, soop-gis-gmp и др.
