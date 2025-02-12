package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня 
1 
Боб
3 
Яблоко
22
0 
Арбуз

Пример вывода: 
Арбуз
22 
Боб 
3
Вишня
1
0 
Яблоко
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
      ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        //бежим по массиву и раскидываем слова и числа в отдельные листы
        for (int i = 0; i < array.length; i++){
            if (isNumber(array[i])){
                numbers.add(array[i]);
            } else {
                strings.add(array[i]);
            }
        }
        //бежим по листу слов и сортируем в возрастающем порядке
        for (int i = strings.size() - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if (isGreaterThan(strings.get(j), strings.get(j + 1))){
                    String temp = strings.get(j);
                    strings.set(j, strings.get(j + 1));
                    strings.set(j + 1, temp);
                }

            }
        }
        //бежим по листу чисел и сортируем в убывающем порядке
        for (int i = numbers.size() - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if (Integer.parseInt(numbers.get(j)) < Integer.parseInt(numbers.get(j + 1))){
                    String temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }

            }
        }
        //бежим по листам и собираем данные в изначальный массив начав со строк
        ArrayList<String> common = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (i < strings.size()) {
                common.add(strings.get(i));
            }
            if (i < numbers.size()) {
                common.add(numbers.get(i));
            }
        }
        for (int i = 0; i < common.size(); i++){
            array[i] = common.get(i);
        }
        /*JR solution
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j])) {
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        */
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
