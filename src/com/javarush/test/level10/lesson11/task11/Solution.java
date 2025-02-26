package com.javarush.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Поправочки нужны
Наша программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку),
помещает их в HashMap и выводит на экран содержимое HashMap. Нужно исправить программу так, чтобы она скомпилировалась.
*/

public class Solution {
    HashMap<int, String> map;//need to replace int to Integer
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap<int, String>();//need to replace int to Integer
        map.put(index, name);//need to remove to escape null, null
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<int, String> pair : solution.map.entrySet()) {//need to replace int to Integer
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
