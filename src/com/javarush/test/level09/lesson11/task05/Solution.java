package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки. Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] strArr = str.toCharArray();
        ArrayList<Character> vowelList = new ArrayList<>();
        ArrayList<Character> otherList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++){
            if (strArr[i] == ' '){

            } else if (isVowel(strArr[i])) {
                vowelList.add(strArr[i]);
            } else {
                otherList.add(strArr[i]);
            }
        }
        for (Character vowel: vowelList){
            System.out.print(vowel + " ");
        }
        System.out.println();
        for (Character other: otherList){
            System.out.print(other + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
