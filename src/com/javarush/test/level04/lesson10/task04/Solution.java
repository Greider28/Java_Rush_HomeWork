package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.
Пример вывода на экран: SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 0;
        while (a < 10){
            if (a == 9){
                int i = 0;
                while (i < 10) {
                    System.out.print("S");
                    i++;
                }
                a++;
            }
            else {
                int i = 0;
                while (i < 10) {
                    System.out.print("S");
                    i++;
                }
                System.out.println();
                a++;
            }
        }


    }
}
