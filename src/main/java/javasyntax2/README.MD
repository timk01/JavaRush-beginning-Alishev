В переменных типа int в языке Java можно хранить:

- целые числа 
(строки в стринге, дробны е в дабл/флоат, ну и инт - не только положительный)

Максимальное значение, которое можно хранить в переменной типа int в языке Java:
- 2*10^9 (4 байта, 32, 31 -- > 2 милларда)
(на прмиере шорта, 2 байта, это 16 бит,
т.е. 2 в 16 если бы только +, а т.к. - это 2 в 15 или -32768 + 32767)

Переменная типа int занимает в памяти N байт:
(байт, шорт, инт, лонг - 1, 2, 4, 8)

В языке Java значение выражения 5/2 будет:
2 (т.к. по учиолчанию, инт... нацело)

В языке Java значение выражения 5%2 будет:
1 (деление с остатком)

В языке Java преобразовать строку (содержащую цифры) в число можно командой:
Integer.parseInt("123") ((остальные варианты вообще... странные))

В языке Java получить длину строки "hello" можно командой:
"hello".length()

В Java для чтения данных с консоли (с клавиатуры) используется стандартный класс:
все же сканнер (инпут - не то, ) 
читать: https://metanit.com/java/tutorial/2.9.php

В Java ввести число с клавиатуры (с помощью объекта Scanner) можно командой вида:
scanner.nextInt() ((остальные варианты - например рид, ридлайн - про буффередридер/инпустстримридер))

В Java ввести строку с клавиатуры и из объекта Scanner можно с помощью команды вида:
