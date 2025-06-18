package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
У нас есть кинофабрика, но она работает не в полную силу. Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли. Вот что тебе нужно сделать для успешного решения: 
1.Разобраться, что программа умеет делать.
2.Все классы должны быть внутри класса Solution.
3.Добавить классы Cartoon, Thriller.
4.Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
5.Аналогично получению объекта SoapOpera сделать: 
 -добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
 -добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
6.Считать с консоли несколько ключей (строк).
Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
7.Создать переменную movie типа Movie и для каждой введенной строки (ключа): 
получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
вывести на экран movie.getClass().getSimpleName().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
}
