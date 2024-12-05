package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое. Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
Примеры: 
а) при вводе чисел 1 2 2 4 5 -1 получим вывод 2.8
б) при вводе чисел 4 3 2 1 -1 получим вывод 2.5
Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
      double count = 0;
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int number = Integer.parseInt(reader.readLine());
            if (number == -1){
                break;
            }
            sum += number;
            count++;
        }

        System.out.println(sum / count);
    }
}
