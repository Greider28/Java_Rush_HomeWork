package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        list.remove(2);
        for (int i = 1; i <= list.size(); i++){
            System.out.println(list.get(list.size() - i));
        }
    }
}
