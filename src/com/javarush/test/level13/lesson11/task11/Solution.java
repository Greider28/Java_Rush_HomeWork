package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно: 
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        Scanner scanner = new Scanner(new FileInputStream(fileName));
        List<Integer> nums = new ArrayList<Integer>();
        int num = 0;

        while (scanner.hasNext()){
            num = scanner.nextInt();
            if (num % 2 == 0){
                nums.add(num);
            }
        }
        Collections.sort(nums);
        for (Integer value: nums){
            System.out.println(value);
        }

        scanner.close();

    }

    }
}

